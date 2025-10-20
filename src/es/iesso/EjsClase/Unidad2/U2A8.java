package es.iesso.EjsClase.Unidad2;

import es.iesso.Impresora;

import java.util.Arrays;
import java.util.Scanner;

public final class U2A8 extends Impresora {

    private static final int N_UD = 2;
    private static final int N_ACT = 8;
    private static final int N_EJS = 11;

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
        else if(n == 7)
            ej7();
        else if(n == 8)
            ej8();
        else if(n == 9)
            ej9();
        else if(n == 10)
            ej10();
        else if(n == 11)
            ej11();
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        imprln("IndexOutOfBoundsException podría manejar la excepción.");
    }

    private static void ej2() {
        String s = null;
        int n1;
        int n2;
        int n3;
        try {
            n1 = Integer.parseInt(null);
        } catch(NullPointerException | NumberFormatException e) {
            if(e.getClass().equals(NullPointerException.class)) {
                imprln(e.getStackTrace());
            } else {
                imprln("Error: Formato de número entero incorrecto.");
            }
        }
        try {
            n2 = s.indexOf("a");
        } catch(NullPointerException | IndexOutOfBoundsException e) {
            imprln(e.getStackTrace());
        }
        try {
            s = "hello";
            n3 = s.charAt(5);
        } catch(NullPointerException | IndexOutOfBoundsException e) {
            imprln(e.getStackTrace());
        }
    }

    private static void ej3() {
        double d;
        double j;
        try {
            d = Math.random();
            j = Math.random();
            if (d > 0.95)
                throw new ArithmeticException(d + " está fuera de rango") ;
            imprln("El número es " + d);
            if (j > 0.5)
                throw new ArithmeticException(j + " está fuera de rango") ;
            imprln("El número es " + j);
        } catch (ArithmeticException e) {
            imprln("Error: " + e.getMessage());
        }
    }

    private static void ej4() {
        double d;
        double j;
        try {
            d = Math.random();
            j = Math.random();
            if (d > 0.95)
                throw new ArithmeticException(d + " está fuera de rango") ;
            imprln("El número es " + d);
            if (j > 0.5)
                throw new ArithmeticException(j + " está fuera de rango") ;
            imprln("El número es " + j);
        } catch (ArithmeticException e) {
            imprln("Error: " + e.getMessage());
            imprln(e.getStackTrace());
        }
    }

    private static void ej5() {
        imprln("¡Hola, Mundo, y a todo el que te habita!");
    }

    private static void ej6() {
        imprln("¡Hola, Mundo, y a todo el que te habita!");
    }

    private static void ej7() {
        imprln("¡Hola, Mundo, y a todo el que te habita!");
    }

    private static void ej8() {
        imprln("¡Hola, Mundo, y a todo el que te habita!");
    }

    private static void ej9() {
        imprln("¡Hola, Mundo, y a todo el que te habita!");
    }

    private static void ej10() {
        imprln("¡Hola, Mundo, y a todo el que te habita!");
    }

    private static void ej11() {
        imprln("¡Hola, Mundo, y a todo el que te habita!");
    }
}