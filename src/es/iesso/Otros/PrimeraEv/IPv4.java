package es.iesso.Otros.PrimeraEv;

import java.util.StringTokenizer;

/**
 * Clase para el examen de la primera evaluación de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public class IPv4 {

    public enum Clase {
        A,
        B,
        C,
        D,
        E,
    }

    private String oct1;
    private String oct2;
    private String oct3;
    private String oct4;
    private String masc;
    private Clase clase;

    public IPv4(String ip) {
        this();
        StringTokenizer st;
        String ipSM;
        String m;
        String[] oct;
        if(esIPv4valida(ip)) {
            st = new StringTokenizer(ip, "/");
            ipSM = st.nextToken();
            m = st.nextToken();
            oct = crearOcts(ipSM);
            this.oct1 = oct[0];
            this.oct2 = oct[1];
            this.oct3 = oct[2];
            this.oct4 = oct[3];
            this.masc = m;
            this.clase = calcularClase(oct[0]);
        }
    }

    public String getClaseString() {
        return claseToString(clase);
    }

    @Override
    public String toString() {
        String txtClase = claseToString(clase);
        if(oct1 != null)
            return (oct1 + "." + oct2 + "." + oct3 + "." + oct4 + "/" + masc + " - " + txtClase);
        else
            return "-";
    }

    private static String claseToString(Clase clase) {
        return switch(clase) {
            case A -> "Clase A";
            case B -> "Clase B";
            case C -> "Clase C";
            case D -> "Clase D";
            case E -> "Clase E";
            case null -> "Sin clase";
        };
    }

    private IPv4() {
        this.oct1 = null;
        this.oct2 = null;
        this.oct3 = null;
        this.oct4 = null;
        this.masc = null;
        this.clase = null;
    }

    private static Clase calcularClase(String oct1) {
        Clase c;
        int n = Integer.parseInt(oct1);
        if(0 <= n && n <= 9)
            c = null;
        else if(10 <= n && n <= 126)
            c = Clase.A;
        else if(n == 127)
            c = null;
        else if(128 <= n && n <= 191)
            c = Clase.B;
        else if(192 <= n && n <= 223)
            c = Clase.C;
        else if(224 <= n && n <= 239)
            c = Clase.D;
        else if(240 <= n && n <= 255)
            c = Clase.E;
        else
            c = null;
        return c;
    }

    public static boolean esIPv4valida(String s) {
        StringTokenizer st;
        String ip;
        String m;

        if(contarChar(s, '/') != 1)
            return false;

        st = new StringTokenizer(s, "/");

        if(st.countTokens() != 2)
            return false;

        ip = st.nextToken();
        m = st.nextToken();

        return (esIPv4sinMascValida(ip) && esMascValida(m));
    }

    private static boolean esIPv4sinMascValida(String s) {
        String[] oct;
        StringTokenizer st;

        if(contarChar(s, '.') != 3)
            return false;

        st = new StringTokenizer(s, ".");

        if(st.countTokens() != 4)
            return false;

        oct = stringTokToArray(st);

        return sonOctsValidos(oct);
    }

    private static boolean esMascValida(String m) {
        int n;

        if(m.length() > 2)
            return false;

        try {
            n = Integer.parseInt(m);
            return n >= 1 && n <= 32;
        } catch(NumberFormatException nFE) {
            return false;
        }
    }

    private static int contarChar(String s, char c) {
        int n = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == c)
                n++;
        return n;
    }

    private static String[] stringTokToArray(StringTokenizer st) {
        String[] sa = new String[4];
        for(int i = 0; st.hasMoreTokens(); i++)
            sa[i] = st.nextToken();
        return sa;
    }

    private static boolean sonOctsValidos(String[] oct) {
        return (esOctValido(oct[0]) && esOctValido(oct[1])
                && esOctValido(oct[2]) && esOctValido(oct[3]));
    }

    private static boolean esOctValido(String oct) {
        int oNum;
        if(oct.length() > 3)
            return false;
        try {
            oNum = Integer.parseInt(oct);
            return oNum >= 0 && oNum <= 255;
        } catch(NumberFormatException nFE) {
            return false;
        }
    }

    private static String[] crearOcts(String ip) {
        return stringTokToArray(new StringTokenizer(ip, "."));
    }
}