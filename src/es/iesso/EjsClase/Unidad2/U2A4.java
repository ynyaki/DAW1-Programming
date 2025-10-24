package es.iesso.EjsClase.Unidad2;

import es.iesso.Impresora;

import java.util.Scanner;

public abstract class U2A4 extends Impresora {

    private static final int N_UD = 2;
    private static final int N_ACT = 4;
    private static final int N_EJS = 7;

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
        imprttl(TITULO_ACT);
        lineas(2);
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
        else if(n == 7)
            ej7();
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        int i1 = 1;
        do {
            imprln("i1 = " + i1);
            i1++;
        } while(i1 <= 5);
        linea();

        int i2 = 1;
        while(i2 <= 5) {
            imprln("i2 = " + i2);
            i2++;
        };
    }

    private static void ej2() {
        imprln("Los bucles no pueden no ejecutarse, ser infinitos o ejecutarse una sola vez.");
    }

    private static void ej3() {
        int i = 1;
        do {
            imprln("Hola caracola");
            i++;
        } while(i <= 5);
    }

    private static void ej4() {
        int i = 1;
        do {
            imprln("i = " + i + "; \"Hola caracola\"");
            i++;
        } while(i <= 5);
    }

    private static void ej5() {
        int c = 1;
        do {
            imprln(c);
            if(c % 4 == 0) {
                imprln("Múltiplo de 4 encontrado");
                c = 10;
            }
            c++;
        } while(c <= 10);
    }

    private static void ej6() {
        int i = 1;
        int n;
        impr("Tabla del nº.: ");
        n = sc.nextInt();
        sc.nextLine();
        while(i <= 10) {
            imprln(n + " x " + i + " = " + (n * i));
            i++;
        }
    }

    private static void ej7() {
        int i;
        int n;
        impr("Cuenta atrás de: ");
        n = sc.nextInt();
        sc.nextLine();
        i = n;
        while(i > 0) {
            imprln(i);
            i--;
        }
    }
}