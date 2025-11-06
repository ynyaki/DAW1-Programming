package es.iesso.EjsClase.Unidad3.U3A4;

public abstract class MetodosString {

    public static char caracterEnIndice(String s, int i) {
        return s.charAt(i);
    }

    public static int UcpEnIndice(String s, int i) {
        return s.codePointAt(i - 1);
    }

    public static boolean sonStrIguales(String s1, String s2) {
        return s1.equals(s2);
    }

    public static boolean sonStrIgualesIgnMay(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }

    public static String comparStr(String s1, String s2) {
        if(s1.compareTo(s2) == 0)
            return "\"" + s1 + "\" es igual que \"" + s2 + "\"";
        else if(s1.compareTo(s2) > 0)
            return "\"" + s1 + "\" es mayor que \"" + s2 + "\"";
        else
            return "\"" + s1 + "\" es menor que \"" + s2 + "\"";
    }

    public static String comparStrIgnMay(String s1, String s2) {
        if(s1.compareToIgnoreCase(s2) == 0)
            return "\"" + s1 + "\" es igual que \"" + s2 + "\"";
        else if(s1.compareToIgnoreCase(s2) > 0)
            return "\"" + s1 + "\" es mayor que \"" + s2 + "\"";
        else
            return "\"" + s1 + "\" es menor que \"" + s2 + "\"";
    }

    public static boolean contieneIgnMay(String s, String sec) {
        return s.contains(sec);
    }

    public static boolean empiezanIgual(String s1, String s2, String sec) {
        return s1.startsWith(sec) && s2.startsWith(sec);
    }

    public static String reemplazarCharAconB(String s, char a, char b) {
        return s.replace(a, b);
    }

    public static String quitarCharEnPos(String s, int pos) {
        return s.substring(0, pos).concat(s.substring(pos + 1));
    }

    public static String revertir(String s) {
        String f = "";
        String c;
        for(int i = s.length() - 1; i >= 0; i--) {
            c = String.valueOf(s.charAt(i));
            f = f.concat(c);
        }
        return f;
    }

    public static String subtexto(String s, int i, int f) {
        return s.substring(i, f + 1);
    }

    public static String elimCharDupl(String s) {
        String f = s;
        for(int i = 0; i < s.length(); i++)
            for(int j = 0; j < i; j++)
                if(s.charAt(i) == s.charAt(j))
                    f = quitarCharEnPos(f, i);
        return f;
    }

    public static char buscar1erCharNoRep(String s) {
        for(int i = 0; i < s.length(); i++)
            for(int j = 0; j < s.length(); j++)
                if(i != j && s.charAt(i) == s.charAt(j))
                    return s.charAt(i);
        return '\n';
    }

    public static String[] dividirString(String s, int size) {
        return null; // TODO Terminar ejercicio
    }
}