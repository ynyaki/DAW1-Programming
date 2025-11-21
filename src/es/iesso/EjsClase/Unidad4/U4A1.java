package es.iesso.EjsClase.Unidad4;

import es.iesso.Impresora;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public final class U4A1 extends Impresora {

    private static final int N_UD = 4;
    private static final int N_ACT = 1;
    private static final int N_EJS = 13;

    private static final String TITULO_ACT = "UNIDAD " + N_UD + " - ACTIVIDAD " + N_ACT;
    private static final String TITULO_EJ = "U" + N_UD + "A" + N_ACT + ". Ejercicio ";
    private static final String COM_ENTRAR = "(Pulsa Entrar para continuar...) ";
    private static final String ERR_EJ = "Error: Ejercicio no disponible";

    private static Scanner sc;

    public static void mostrar(Scanner scIn) {
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
        else if(n == 13)
            ej13();
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        int[] array = {23, 38, 14, -3, 0, 14, 9, 103, 0, -56};

        imprln("a) El array tiene 10 elementos.");
        imprln("b) Es de tipo entero");
        imprln("c) El elemento en la 8ª pos.: 103");
        imprln("d) El 4º elemento es array[3] (-3)");
        imprln("e) int[] array = {23, 38, ..., -56}");
        imprln("f) array[9] = 2");
        imprln("g) Devolvería 38 + 14 = 52");
        imprln("h) Cambia su valor a 10 tras ser utilizada");
        imprln("i) (MAL) Devuelve 9 y no cambia su valor");
        imprln("i) No compila porque se está intentando asignar un valor" +
                " a un número y no a una variable.");
        imprln("j) Lanza una excepción porque se está intentando acceder" +
                " a una posición fuera de los límites del array.");

        hrule(3);

        imprln("Comprobación:");
        imprln("a) " + Array.getLength(array));
        imprln("b) -");
        imprln("c) " + array[7]);
        imprln("d) " + array[3]);
        imprln("e) -");
        imprln("f) -");
        imprln("g) " + (array[1] + array[5]));
        imprln("h) " + array[6]++);
        // array[6++]
        imprln("i) No compila");
        // (array[14] + 10)
        imprln("j) Lanza excepción \"Array index is out of bounds\"");
    }

    private static void ej2() {
        // int[] data = new int[3];
        // data[3] = 1;
        imprln("La longitud del array es 3, desde 0 hasta 2, por lo que" +
                " al intentar leer la 4ª posición (data[3]) da un warning" +
                " avisando de que se producirá una excepción de tipo" +
                " IndexOutOfBounds.");
    }

    private static void ej3() {
        imprln("a) 0 - Bien");
        imprln("b) 10 - Bien");
        imprln("c) 1.2 - Mal (índice decimal)");
        imprln("d) 1 - Bien");
        imprln("e) 25 - Mal (pos. fuera del límite)");
        imprln("f) 2 - Bien");
        imprln("g) -1 - Mal (índice negativo)");
        imprln("h) 24 - Bien");
        imprln("i) 4 - Bien");
    }

    private static void ej4() {
        int[] data = new int[5];
        data[0] = 2;
        data[1] = 54;
        data[2] = 5*6;

        imprln("data[0] = " + data[0]);
        imprln("data[1] = " + data[1]);
        imprln("data[2] = " + data[2]);
        imprln("data[3] = " + data[3]);
        imprln("data[4] = " + data[4]);
    }

    private static void ej5() {
        int[] array = new int[7];
        array[6] = 42;
        array[0] = 71;
        array[5] = 23;
        array[4] = array[0];

        imprln("a)");
        imprln("array[6] = " + array[6]);
        imprln("array[0] = " + array[0]);
        imprln("array[5] = " + array[5]);
        imprln("array[4] = " + array[4]);

        array[6] = array[3];
        imprln("array[6] = " + array[6]);
    }

    private static void ej6() {
        int j;
        double[] array = new double[4];
        array[0] = 0.21;
        array[1] = 4.31;
        array[2] = 9.28;
        j = 3;

        imprln("La primera línea no dará un error de compilación pero sí" +
                " una excepción.");
        imprln("pos 2 = 9.28");
        imprln("pos 1 = 4.31");

        linea();
        imprln("Comprobación:");
        imprln("posición " + (j-1) + " valor " + array[j - 1]);

        j = j - 2;
        imprln("posición " + j + " valor " + array[j]);
    }

    private static void ej7() {
        int j;
        double[] array = new double[4];
        array[0] = 0.21;
        array[1] = 4.31;
        array[2] = 9.28;
        j = 3;
        array[j] = array[j - 1] + array[j - 2];
        imprln("9.28 + 4.31 = 13.59");
        imprln("Corrección: array[" + j + "] == " + array[j]);
    }

    private static void ej8() {
        char[] nom = {'p', 'a', 't', 'r', 'i', 'c', 'i', 'a'};
        imprln("nom = " + Arrays.toString(nom));
        imprln("Tamaño: " + Array.getLength(nom));
        imprln("nom[2] = " + nom[2]);
    }

    private static void ej9() {
        char[] nom = new char[8];
        nom[0] = 'p';
        nom[1] = 'a';
        nom[2] = 't';
        nom[3] = 'r';
        nom[4] = 'i';
        nom[5] = 'c';
        nom[6] = 'i';
        nom[7] = 'a';
        imprln("char[] nom = new char[8] -> " + Arrays.toString(nom));
    }

    private static void ej10() {
        char[] nom = {'p', 'a', 't', 'r', 'i', 'c', 'i', 'a'};
        imprln(Arrays.toString(nom));
        imprln(Arrays.toString(mostrarInvertido(nom)));
    }

    private static char[] mostrarInvertido(char[] s) {
        char c;
        int j = Array.getLength(s) - 1;
        for(int i = 0; i < j; i++) {
            c = s[i];
            s[i] = s[j];
            s[j] = c;
            j--;
        }
        return s;
    }

    private static void ej11() {
        imprln("Todas las variables valen 45 menos la de la posición 1.");
    }

    private static void ej12() {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = new int[8];
        int j = Array.getLength(array2) - 1;
        for(int i = 0; i < Array.getLength(array1); i++) {
            array2[j] = array1[i];
            j--;
        }
        imprln(Arrays.toString(array1) + " -> " + Arrays.toString(array2));
    }

    private static void ej13() {
        // TODO Por hacer
    }
}