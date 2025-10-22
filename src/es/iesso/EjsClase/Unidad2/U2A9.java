package es.iesso.EjsClase.Unidad2;

import es.iesso.Impresora;

import java.util.Scanner;

public final class U2A9 extends Impresora {

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

    public static void ej(int n) {
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

        imprln(imprFunc(1) + esCapicua(10201));
        imprent("101");
        linea();

        imprln(imprFunc(2) + esPrimo(113));
        imprent("113");
        linea();

        imprln(imprFunc(3) + siguientePrimo(119));
        imprent("119");
        linea();

        imprln(imprFunc(4) + potencia(2, 4));
        imprent("2, 4");
        linea();

        imprln(imprFunc(5) + digitos(1000));
        imprent("1000");
        linea();

        imprln(imprFunc(6) + voltea(221));
        imprent("221");
        linea();

        imprln(imprFunc(7) + digitoN(150, 1));
        imprent("150, 1");
        linea();

        imprln(imprFunc(8) + posicionDeDigito(150, 1));
        imprent("150, 1");
        linea();

        imprln(imprFunc(9) + quitaPorDetras(150, 1));
        imprent("150, 1");
        linea();

        imprln(imprFunc(10) + quitaPorDetras(150, 1));
        imprent("150, 1");
        linea();

        imprln(imprFunc(11) + pegaPorDelante(150, 1));
        imprent("150, 1");
        linea();

        imprln(imprFunc(12) + pegaPorDetras(150, 1));
        imprent("150, 1");
        linea();

        imprln(imprFunc(13) + digitoN(150, 1));
        imprent("150, 1");
        linea();

        imprln(imprFunc(14) + digitoN(150, 1));
        imprent("150, 1");
        linea();

        /*
        case 8 -> ("posicionDeDigito");
        case 9 -> ("quitaPorDetras");
        case 10 -> ("quitaPorDelante");
        case 11 -> ("pegaPorDelante");
        case 12 -> ("pegaPorDetras");
        case 13 -> ("trozoDeNumero");
        case 14 -> ("juntaNumeros");
        */
    }

    // Función 1
    private static boolean esCapicua(int n) {
        int m = voltea(n);
        return (n == m);
    }

    // Función 2
    private static boolean esPrimo(int n) {
        boolean primo = true;
        for(int i = 2; i < n; i++)
            if (n % i == 0) {
                primo = false;
                break;
            }
        return primo;
    }

    // Función 3
    private static int siguientePrimo(int n) {
        int i = n + 1;
        while(!esPrimo(i))
            i++;
        return i;
    }

    // Función 4
    private static int potencia(int n, int e) {
        int r = n;
        for(int i = 1; i < e; i++)
            r *= n;
        return r;
    }

    // Función 5
    private static int digitos(int n) {
        return (Integer.toString(n).length());
    }

    // Función 6
    private static int voltea(int n) {
        String tInic = Integer.toString(n);
        String tFin = "";
        for(int i = tInic.length() - 1; i >= 0; i--)
            tFin = tFin.concat(String.valueOf(tInic.charAt(i)));
        return Integer.parseInt(tFin);
    }

    // Función 7
    private static char digitoN(int n, int i) {
        String num = Integer.toString(n);
        return num.charAt(i);
    }

    // Función 8
    private static int posicionDeDigito(int n, int d) {
        int i = 0;
        String nTxt = Integer.toString(n);
        while(String.valueOf(nTxt.charAt(i)).equals(String.valueOf(d)))
            i++;
        return i;
    }


    // Función 9
    private static int quitaPorDetras(int n, int d) {
        String num = Integer.toString(n);
        return Integer.parseInt(num.substring(0, d));
    }


    // Función 10
    private static int quitaPorDelante(int n, int d) {
        String num = Integer.toString(n);
        return Integer.parseInt(num.substring(d));
    }


    // Función 11
    private static int pegaPorDetras(int n, int x) {
        return Integer.parseInt(String.valueOf(n).concat(String.valueOf(x)));
    }


    // Función 12
    private static int pegaPorDelante(int n, int x) {
        return Integer.parseInt(String.valueOf(x).concat(String.valueOf(n)));
    }


    // Función 13
    private static int trozoDeNumero(int n, int i, int f) {
        String nTxt = String.valueOf(n);
        return Integer.parseInt(nTxt.substring(i, f));
    }


    // Función 14
    private static String juntaNumeros(int a, int b) {
        return String.valueOf(a).concat(String.valueOf(b));
    }

    private static String imprFunc(int nF) {
        String txtFunc = switch(nF) {
            case 1 -> ("esCapicua");
            case 2 -> ("esPrimo");
            case 3 -> ("siguientePrimo");
            case 4 -> ("potencia");
            case 5 -> ("digitos");
            case 6 -> ("voltea");
            case 7 -> ("digitoN");
            case 8 -> ("posicionDeDigito");
            case 9 -> ("quitaPorDetras");
            case 10 -> ("quitaPorDelante");
            case 11 -> ("pegaPorDelante");
            case 12 -> ("pegaPorDetras");
            case 13 -> ("trozoDeNumero");
            case 14 -> ("juntaNumeros");
            default -> "ERROR: Impresión incorrecta a cont.";
        };
        return (nF + ". " + txtFunc + ": ");
    }

    private static void imprent(String txtIn) {
        imprln("Entrada original: " + txtIn);
    }

    private static void ej2() {
    }

    private static void ej3() {
    }

    private static void ej4() {
    }

    private static void ej5() {
    }

    private static void ej6() {
    }

    // TODO Añadir ejercicios
}