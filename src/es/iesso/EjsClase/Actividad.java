package es.iesso.EjsClase;

import es.iesso.Impresora;

import java.util.Scanner;

public final class Actividad extends Impresora {

    private static final int N_UD = 0; // TODO Cambiar valor
    private static final int N_ACT = 0; // TODO Cambiar valor
    private static final int N_EJS = 2; // TODO Cambiar valor

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
        // TODO Añadir ejercicios
        else
            imprln(ERR_EJ);
    }

    // TODO Añadir ejercicio propio
    private static void ej1() {
        imprln("¡Hola, Mundo, y a todo el que te habita!");
    }

    // TODO Añadir ejercicio propio
    private static void ej2() {
        impr("Di tu frase: ");
        String frase = sc.nextLine();
        for(int i = 1; i <= 4; i++)
            imprln("¡Lo dijo! ¡\"" + frase + "\"!");
    }

    // TODO Añadir ejercicios
}