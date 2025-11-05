package es.iesso.EjsClase.Unidad3.U3A4;

public abstract class MetodosString {

    public static char caracterEnIndice(String s, int i) {
        return s.charAt(i);
    }

    public static int UcpEnIndice(String s, int i) {
        return s.codePointAt(i - 1);
    }

    public static boolean sonStringsIguales(String s1, String s2) {
        return s1.equals(s2);
    }

    public static boolean sonStringsIgualesIgnMay(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
}
