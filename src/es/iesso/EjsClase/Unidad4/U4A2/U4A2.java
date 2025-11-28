package es.iesso.EjsClase.Unidad4.U4A2;

import es.iesso.Impresora;

import java.util.Arrays;
import java.util.Scanner;

import static es.iesso.EjsClase.Unidad4.U4A2.MetodosArray.*;

public abstract class U4A2 extends Impresora {

    private static final int N_UD = 4;
    private static final int N_ACT = 2;
    private static final int N_EJS = 12;

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

    public static void mostrarAct(Scanner scIn) {
        sc = scIn;
        lineas(2);
        imprttl(TITULO_ACT);
        for(int i = 1; i <= N_EJS; i++)
            mostrarEj(i, sc);
    }

    public static void mostrarEj(int n, Scanner scIn) {
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
        else if(n == 8)
            ej8();
        else if(n == 9)
            ej9();
        else if(n == 10)
            ej10();
        else if(n == 11)
            ej11();
        else if(n == 12)
            ej12();
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        int[] array;
        array = pedirArray(sc);
        linea();
        imprarln(array);
    }

    private static void ej2() {
        int[] a = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        int max = maximo(a);
        imprarln(a);
        imprln("Máximo: " + max);
    }

    private static void ej3() {
        int[] ua = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        int[] oa = ordenarAsc(ua);
        imprln(Arrays.toString(ua) + " -> " + Arrays.toString(oa));
    }

    private static void ej4() {
        int[] a = {-35, -13, -77, -46, -82, -2, -26};
        int min = minimo(a);
        imprarln(a);
        imprln("Mínimo: " + min);
    }

    private static void ej5() {
        int[] pagoSem = {987, 688, 1324, 450, 667, 801};
        int suma = sumar(pagoSem);
        imprln(Arrays.toString(pagoSem) + " -> Suma = " + suma);
    }

    private static void ej6() {
        imprln("Los foreach han sido implementados.");
    }

    private static void ej7() {
        double[] array = {};
        double total = 0.0;

        imprln("a) Sí, aunque mostrará un warning.");
        imprln("b) Hay 0 elementos.");
        imprln("c) Sí, ya que con foreach no se dará la excepción" +
                " IndexOutOfBounds");
        imprln("d) El total es 0, porque los valores del array se" +
                " inicializan a 0 y el total también. Además," +
                " no se ejecutará ninguna iteración del bucle.");

        imprln("Comprobación:");
        for(double valor : array)
            total += valor;
        imprln("El total es " + total);
    }

    private static void ej8() {
        double m;
        double[] a = {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42};
        m = media(a);
        imprarln(a);
        imprln("Media = " + roundTxt(m, 2));
    }

    private static void ej9() {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        int[] c = {4, 3, 2, 1};
        imprln(Arrays.toString(a) + " == " + Arrays.toString(b) + ": "
                + sonIguales(a, b));
        imprln(Arrays.toString(a) + " == " + Arrays.toString(c) + ": "
                + sonIguales(a, c));
    }

    private static void ej10() {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        imprln(Arrays.toString(a) + " == " + Arrays.toString(b) + ": "
                + sonIgualesSinOrden(a, b));
    }

    private static void ej11() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4};
        int[] c = {1, 3, 5};
        int[] d = {1, 2, 3, 4, 5, 5};
        imprln(Arrays.toString(a) + " ⊆ " + Arrays.toString(b) + ": "
                + estaContenidoEn(a, b));
        imprln(Arrays.toString(c) + " ⊆ " + Arrays.toString(d) + ": "
                + estaContenidoEn(c, d));
    }

    private static void ej12() {
        int[] a = {9, 3, 5, 1, 7};
        imprln(Arrays.toString(a) + " -> " + Arrays.toString(ordenarAsc(a)));
    }
}