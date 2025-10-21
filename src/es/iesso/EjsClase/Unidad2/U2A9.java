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
        // TODO Añadir ejercicios
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        imprln(imprFunc(7) + digitoN(125, 1));
        imprent(125 + ", " + 1);
        linea();
        /*
        imprln(imprFunc(1));
        imprln(imprFunc(2));
        imprln(imprFunc(3));
        imprln(imprFunc(4));
        imprln(imprFunc(5));
        imprln(imprFunc(6));
        imprln(imprFunc(7));
        imprln(imprFunc(8));
        imprln(imprFunc(9));
        imprln(imprFunc(10));
        imprln(imprFunc(11));
        imprln(imprFunc(12));
        imprln(imprFunc(13));
        imprln(imprFunc(14));
         */
    }

    private static char digitoN(int n, int i) {
        String num = Integer.toString(n);
        return num.charAt(i);
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
        impr("Entrada original: " + txtIn);
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