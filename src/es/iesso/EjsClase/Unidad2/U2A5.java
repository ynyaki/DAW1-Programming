package es.iesso.EjsClase.Unidad2;

import es.iesso.Impresora;

import java.util.Scanner;

public final class U2A5 extends Impresora {

    private static final int N_UD = 2;
    private static final int N_ACT = 5;
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
        double t = 0;
        double r;
        double n;
        do {
            impr("Introduce un valor (0 para salir): ");
            n = sc.nextDouble();
            sc.nextLine();
            r = t + n;
            imprln(t + " + " + n + " = " + r);
            t = r;
        } while(n != 0);
    }

    private static void ej2() {
        double t = 0;
        double r;
        double n;
        int c = 0;
        do {
            impr("Introduce un valor (0 para salir): ");
            n = sc.nextDouble();
            sc.nextLine();
            r = t + n;
            imprln(t + " + " + n + " = " + r);
            t = r;

            c++;
            imprln("(" + c + " sumandos)");
        } while(n != 0);
    }

    private static void ej3() {
        double t = 0;
        double r;
        double n;
        int imp = 0;
        do {
            impr("Introduce un valor (0 para salir): ");
            n = sc.nextDouble();
            sc.nextLine();
            r = t + n;
            imprln(t + " + " + n + " = " + r);
            t = r;

            if(n % 2 != 0)
                imp++;
            imprln("(" + imp + " nº. impares)");
        } while(n != 0);
    }

    private static void ej4() {
        double t = 0;
        double r;
        double n;
        double v;
        int nV = 0;
        impr("Introduce un valor que contar: ");
        v = sc.nextDouble();
        sc.nextLine();
        do {
            impr("Introduce un valor (0 para salir): ");
            n = sc.nextDouble();
            sc.nextLine();
            r = t + n;
            imprln(t + " + " + n + " = " + r);
            t = r;

            if(n == v)
                nV++;
            imprln(v + " fue introducido " + nV + " veces)");
        } while(n != 0);
    }

    private static void ej5() {
        double t = 0;
        double r;
        double n;
        double max = 0;
        do {
            impr("Introduce un valor (0 para salir): ");
            n = sc.nextDouble();
            sc.nextLine();
            r = t + n;
            imprln(t + " + " + n + " = " + r);
            t = r;

            if(max < n)
                max = n;
            imprln("(val. máx.: " + max + ")");
        } while(n != 0);
    }

    private static void ej6() {
        double t = 0;
        double r;
        double n;
        double m;
        int nM = 0;
        impr("Introduce número del que contar sus múltiplos: ");
        m = sc.nextDouble();
        sc.nextLine();
        do {
            impr("Introduce un valor (0 para salir): ");
            n = sc.nextDouble();
            sc.nextLine();
            r = t + n;
            imprln(t + " + " + n + " = " + r);
            t = r;

            if(n % m == 0)
                nM++;
            imprln("(" + nM + " múltiplos de " + m + ")");
        } while(n != 0);
    }
}