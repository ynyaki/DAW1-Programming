package es.iesso.EjsClase.Unidad4.U4A7;

import es.iesso.EjsClase.Unidad4.U4A3.ArrayOperations;
import es.iesso.Impresora;

import java.util.Arrays;
import java.util.Scanner;

public abstract class U4A7 extends Impresora {

    // TODO Cambiar valores
    private static final int N_UD = 4;
    private static final int N_ACT = 7;
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
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        int[] a = {24, 18, 90, 1, 0, 85, 24, 18};
        imprarln(bubbleSort(a));
    }

    private static void ej2() {
        int[] a = {24, 18, 90, 1, 0, 85, 24, 18};
        imprarln(countingSort(a));
    }

    private static void ej3() {
        int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
        imprarln(a);
        imprln("Búsqueda binaria iterativa:");
        imprln("pos(22) = " + binarySearch(a, 22));
        imprln("pos(21) = " + binarySearch(a, 21));
        imprln("pos(10) = " + binarySearch(a, 10));
        imprln("pos(2) = " + binarySearch(a, 2));
        imprln("pos(28) = " + binarySearch(a, 28));
        imprln("pos(14) = " + binarySearch(a, 14));
        imprln("Búsqueda binaria recursiva:");
        imprln("pos(22) = " + binarySearchRecursive(a, 0, a.length - 1, 22));
        imprln("pos(21) = " + binarySearchRecursive(a, 0, a.length - 1, 21));
        imprln("pos(10) = " + binarySearchRecursive(a, 0, a.length - 1, 10));
        imprln("pos(2) = " + binarySearchRecursive(a, 0, a.length - 1, 2));
        imprln("pos(28) = " + binarySearchRecursive(a, 0, a.length - 1, 28));
        imprln("pos(14) = " + binarySearchRecursive(a, 0, a.length - 1, 14));
    }

    private static void ej4() {
        imprln("Hecho en el ejercicio 3.");
    }

    private static void ej5() {
        imprln("Hecho en el ejercicio 3.");
    }

    private static void ej6() {
        imprln("Hecho en la entrega.");
    }

    private static void ej7() {
        imprln("Algoritmo de búsqueda binaria implementado.");
    }

    private static int[] bubbleSort(int[] a) {
        int[] o = Arrays.copyOf(a, a.length);
        for(int i = 0; i < o.length - 1; i++)
            for(int j = i; j < o.length; j++)
                if(o[i] > o[j])
                    swap(o, i, j);
        return o;
    }

    public static int[] countingSort(int[] a) {
        int[] r = new int[a.length];
        int[] c = new int[ArrayOperations.max(a) + 1]; // Count array

        if(a.length == 0)
            return new int[0];

        // Count frequency of each element
        for(int i = 0; i < a.length; i++)
            c[a[i]]++;

        // Compute prefix sum
        for(int i = 1; i < c.length; i++)
            c[i] += c[i - 1];

        // Build output array
        for(int i = a.length - 1; i >= 0; i--) {
            r[c[a[i]] - 1] = a[i];
            c[a[i]]--;
        }

        return r;
    }

    public static int binarySearch(int[] a, int n) {
        int[] o = bubbleSort(ArrayOperations.copy(a));
        int i = 0;
        int f = o.length - 1;
        int m;
        while(i <= f) {
            m = (i + f) / 2;
            if(o[m] < n)
                i = m + 1;
            else if(o[m] > n)
                f = m - 1;
            else
                return m;
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] a, int i, int f, int n) {
        int m = (f + i) / 2;
        if(i > f)
            return -1;
        else if(a[m] < n)
            i = m + 1;
        else if(a[m] > n)
            f = m - 1;
        else
            return m;
        return binarySearchRecursive(a, i, f, n);
    }

    private static void swap(int[] array, int a, int b) {
        int x = array[a];
        array[a] = array[b];
        array[b] = x;
    }
}