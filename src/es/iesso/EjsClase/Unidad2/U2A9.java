package es.iesso.EjsClase.Unidad2;

import es.iesso.Impresora;

import java.util.Scanner;

public abstract class U2A9 extends Impresora {

    private static final int N_UD = 2;
    private static final int N_ACT = 9;
    private static final int N_EJS = 6;

    private static final String TITULO_ACT = "UNIDAD " + N_UD + " - ACTIVIDAD " + N_ACT;
    private static final String TITULO_EJ = "U" + N_UD + "A" + N_ACT + ". Ejercicio ";
    private static final String COM_ENTRAR = "(Pulsa Entrar para continuar...) ";
    private static final String ERR_EJ = "Error: Ejercicio no disponible";

    private static Scanner sc;

    public static int getNUd() {
        return N_UD;
    }

    public static int getNAct() {
        return N_ACT;
    }

    public static int getNEjs() {
        return N_EJS;
    }

    public static void mostrar(Scanner scIn) {
        sc = scIn;
        lineas(2);
        imprttl(TITULO_ACT);
        for(int i = 1; i <= N_EJS; i++)
            imprEj(i, sc);
    }

    public static void imprEj(int n, Scanner scIn) {
        sc = scIn;
        if(0 < n && n <= N_EJS)
            imprttl(TITULO_EJ + n);

        ej(n);
        linea();
        impr(COM_ENTRAR);
        sc.nextLine();
        linea();
    }

    private static void ej(int n) {
        if(n == 1)
            ej1();
        else if(n == 2)
            ej2();
        else if(n == 3)
            ej3();
        else if(n == 4)
            ej4();
        else if(n == 5)
            ej5();
        else if(n == 6)
            ej6();
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {

        imprFunc(esCapicua(10201), "esCapicua", "10201");
        imprFunc(esPrimo(113), "esPrimo", "113");
        imprFunc(siguientePrimo(119), "siguientePrimo", "119");
        imprFunc(potencia(2, 4), "potencia", "2, 4");
        imprFunc(digitos(1000), "digitos", "1000");
        imprFunc(voltea(521), "voltea", "521");
        imprFunc(digitoN(150, 1) , "digitoN", "150, 1");
        imprFunc(posicionDeDigito(9060, 6), "posicionDeDigito", "9060, 6");
        imprFunc(quitaPorDetras(1250, 1), "quitaPorDetras", "1250, 1");
        imprFunc(quitaPorDelante(2305, 1), "quitaPorDelante", "2305, 1");
        imprFunc(pegaPorDelante(9, 1234), "pegaPorDelante", "9, 1234");
        imprFunc(pegaPorDetras(1234, 0), "pegaPorDetras", "1234, 0");
        imprFunc(trozoDeNumero(12345, 1, 4), "trozoDeNumero", "12345, 1, 4");
        imprFunc(juntaNumeros(123, 456), "juntaNumeros", "123, 456");
    }

    private static void ej2() {
        imprFunc(nPrimos(1, 1000), "nPrimos", "1000");
    }

    private static void ej3() {
        imprFunc(nCapicua(1, 99999), "nCapicua", "1, 99999");
    }

    private static void ej4() {
        imprFunc(binToDec(1100001), "binToDec", "1100001");
    }

    // EJERCICIO 4

    public static int binToDec(int n) {
        String nTxt = String.valueOf(n);
        return Integer.parseInt(nTxt, 2);
    }

    public static void imprFunc(Object res, String nomFunc, String entOrg) {
        imprln("\"" + nomFunc + "\"");
        imprln("Entrada: " + entOrg);
        imprln("Salida: " + res.toString());
        linea();
    }

    private static void ej5() {
        imprFunc(decToBin(65), "decToBin", "65");
    }

    // EJERCICIO 5

    public static int decToBin(int n) {
        String nTxt = String.valueOf(n);
        return Integer.valueOf(nTxt, 2);
    }

    public static void ej6() {
        imprFunc(baseAtoBaseB(256, 10, 16), "decToHex", "256, 10, 16");
    }

    public static int baseAtoBaseB(int n, int a, int b) {
        String nTxt = String.valueOf(n);
        Integer nA = Integer.valueOf(nTxt, a);
        String nATxt = String.valueOf(nA);
        return Integer.parseInt(nATxt, b);
    }

    // EJERCICIO 1

    // Función 1
    public static boolean esCapicua(int n) {
        int m = voltea(n);
        return (n == m);
    }

    // Función 2
    public static boolean esPrimo(int n) {
        boolean primo = true;
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

    // Función 3
    public static int siguientePrimo(int n) {
        int i = n + 1;
        while(!esPrimo(i))
            i++;
        return i;
    }

    // Función 4
    public static int potencia(int n, int e) {
        int r = n;
        for(int i = 1; i < e; i++)
            r *= n;
        return r;
    }

    // Función 5
    public static int digitos(int n) {
        return (String.valueOf(n).length());
    }

    // Función 6
    public static int voltea(int n) {
        String tIni = String.valueOf(n);
        String tFin = "";
        for(int i = tIni.length() - 1; i >= 0; i--)
            tFin = tFin.concat(String.valueOf(tIni.charAt(i)));
        return Integer.parseInt(tFin);
    }

    // Función 7
    public static char digitoN(int n, int i) {
        return String.valueOf(n).charAt(i);
    }

    // Función 8
    public static int posicionDeDigito(int n, int d) {
        char cN;
        int i = 0;
        boolean isDig = false;
        String nT = String.valueOf(n);
        char cD = String.valueOf(d).charAt(0);
        while(!isDig && i < nT.length()) {
            cN = nT.charAt(i);
            if(cN == cD)
                isDig = true;
            else
                i++;
        }
        if(isDig)
            return i;
        else
            return -1;
    }

    // Función 9
    public static int quitaPorDetras(int n, int d) {
        String num = String.valueOf(n);
        return Integer.parseInt(num.substring(0, num.length() - d));
    }

    // Función 10
    public static int quitaPorDelante(int n, int d) {
        String num = String.valueOf(n);
        return Integer.parseInt(num.substring(d));
    }

    // Función 11
    public static int pegaPorDetras(int n, int x) {
        return Integer.parseInt(String.valueOf(n).concat(String.valueOf(x)));
    }

    // Función 12
    public static int pegaPorDelante(int x, int n) {
        return Integer.parseInt(String.valueOf(x).concat(String.valueOf(n)));
    }

    // Función 13
    public static int trozoDeNumero(int n, int i, int f) {
        String nTxt = String.valueOf(n);
        return Integer.parseInt(nTxt.substring(i, f));
    }

    // Función 14
    public static String juntaNumeros(int a, int b) {
        return String.valueOf(a).concat(String.valueOf(b));
    }

    // EJERCICIO 2

    public static String nPrimos(int in, int fi) {
        String txt = "";
        for(int i = in; i <= fi; i++) {
            if(esPrimo(i))
                txt = txt.concat("(" + i + ") ");
        }
        return txt.trim();
    }

    // EJERCICIO 3

    public static String nCapicua(int in, int fi) {
        String txt = "";
        for(int i = in; i <= fi; i++) {
            if(esCapicua(i))
                txt = txt.concat("(" + i + ") ");
        }
        return txt.trim();
    }

    // Funciones manuales (no usar)

    public static int baseNADec(int num, int b) {
        int f = 0;
        int c = 0;
        int dN;
        for(int i = digitos(num) - 1; i >= 0; i--) {
            dN = Character.getNumericValue(digitoN(num, i));
            f += (int) (dN * Math.pow(b, c));
            c++;
        }
        return f;
    }

    public static int decABaseN(int n, int b) {
        int i = 0;
        int f = 0;
        int r = 0;
        while(n > 1) {
            r = n % b;
            f += (int) (r * Math.pow(10, i));
            n /= b;
            i++;
        }
        f += (int) (r * Math.pow(10, i));
        return f;
    }
}