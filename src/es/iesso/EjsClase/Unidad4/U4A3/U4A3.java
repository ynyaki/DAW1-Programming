package es.iesso.EjsClase.Unidad4.U4A3;

import es.iesso.EjsClase.Unidad4.U4A1.ArrayTester;
import es.iesso.EjsClase.Unidad4.U4A2.MetodosArray;
import es.iesso.EjsClase.Unidad4.U4A3.ArrayOperations;
import es.iesso.Impresora;

import java.lang.foreign.MemorySegment;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class U4A3 extends Impresora {

    private static final int N_UD = 4;
    private static final int N_ACT = 3;
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
        int[] a = {6, 5, 4, 3, 2, 1};
        int[] ra = MetodosArray.revertir(a);
        imprln(Arrays.toString(a) + " -> "
                + Arrays.toString(ra));
    }

    private static void ej2() {
        int[] a = {-13, 1, 2, 4, 8, 16};
        int[] b = {-13, 16, 4, 8, 1, 2};
        int[] c;

        impr("A = ");
        ArrayOperations.print(a);
        linea();
        ArrayOperations.reverse(a);
        imprln("A' = " + Arrays.toString(a));
        ArrayOperations.reverse(a);
        imprln("Máximo: " + ArrayOperations.max(a));
        imprln("Mínimo: " + ArrayOperations.min(a));
        imprln("Suma: " + ArrayOperations.sum(a));
        linea();
        imprln("B = " + Arrays.toString(b));
        imprln("¿A y B iguales sin orden? "
                + ArrayOperations.equalsWithoutOrder(a, b));
        imprln("¿A ⊆ B? "
                + ArrayOperations.isArrayOn(a, b));
        impr(Arrays.toString(b));
        ArrayOperations.sort(b);
        impr(" -> " + Arrays.toString(b));
        linea();
        c = ArrayOperations.copy(b);
        imprln("B = " + Arrays.toString(b) + " -> C = "
                + Arrays.toString(c));
        ArrayOperations.removeOddNumbers(c);
        imprln("C sin impares = " + Arrays.toString(c));
    }

    private static void ej3() {
        int[] a = {1, 2, 3, 2, 7, 3, 1};
        imprarln(a);
        ArrayOperations.printRange(a, 0, 7);
        linea();
        ArrayOperations.printRange(a, 1, 6);
        linea();
        ArrayOperations.printRange(a, 2, 2);
        linea();
    }

    private static void ej4() {
        int[] a = {-2, 45, -29, 77, 56, 31};
        int[] b;
        int[] c;
        imprln(a);
        imprln("max(array): " + ArrayOperations.max(a));
        b = ArrayOperations.copy(a);
        imprln("copy(array, copyArray)");
        imprln("print(copyArray): " + Arrays.toString(b));
        c = ArrayOperations.copy(a);
        ArrayOperations.sort(c);
        imprln("print(arrayOrdenado): " + Arrays.toString(c));
        imprln("equalsWithoutOrder(array, arrayOrdenado): "
                + ArrayOperations.equalsWithoutOrder(a, c));
        imprln("equals(array, copyArray): " + ArrayOperations.equals(a, b));
        ArrayOperations.removeOddNumbers(a);
        imprln("removeOddNumbers(array): " + Arrays.toString(a));
        imprln("sum(array): " + ArrayOperations.sum(a));
        imprln("min(array): " + ArrayOperations.min(a));
        try {
            impr("printRange(array, 1, 4): ");
            ArrayOperations.printRange(a, 1, 4);
            linea();
        } catch(IndexOutOfBoundsException | InputMismatchException e) {
            imprln("Error: " + e.getMessage());
            impr("printRange(array, 1, 4) no podrá ejecutarse");
        }
        ArrayOperations.reverse(c);
        imprln("reverse(arrayOrdenado): " + Arrays.toString(c));
        try {
            impr("printRange(arrayOrdenado, 2, 5): ");
            ArrayOperations.printRange(c, 2, 5);
            linea();
        } catch(IndexOutOfBoundsException | InputMismatchException e) {
            imprln("Error: " + e.getMessage());
            impr("printRange(arrayOrdenado, 2, 5) no podrá ejecutarse");
        }
    }

    private static void ej5() {
        int[] a = {-6, 33, 98, 10, 9};
        imprln("deleteOneDigitNumbers: "
                + Arrays.toString(ArrayOperations.deleteOneDigitNumbers(a)));
    }

    private static void ej6() {
        int[] a = {1, 2, 3, 4};
        imprln("searchFirst(a, 4) = " + ArrayOperations.searchFirst(a, 4));
    }

    private static void ej7() {
        imprln("Ya documentada.");
    }
}