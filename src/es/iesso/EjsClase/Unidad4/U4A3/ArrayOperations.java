package es.iesso.EjsClase.Unidad4.U4A3;

import java.lang.reflect.Array;
import java.util.InputMismatchException;

/**
 * Ejercicio 2 de la Actividad 3 de la Unidad 4 de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public abstract class ArrayOperations {

    public static void print(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }

    public static void reverse(int[] array) {
        int j = array.length - 1;
        for(int i = 0; i < j; i++) {
            swap(array, i, j);
            j--;
        }
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int n : array)
            if(max < n)
                max = n;
        return max;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int n : array)
            if(min > n)
                min = n;
        return min;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int n : array)
            sum += n;
        return sum;
    }

    public static boolean equalsWithoutOrder(int[] a, int[] b) {
        int nIguales = 0;
        int[] oa;
        int[] ob;
        if(a.length != b.length)
            return false;
        oa = copy(a);
        ob = copy(b);
        sort(oa);
        sort(oa);
        for(int i = 0; i < a.length; i++)
            if(oa[i] == ob[i])
                nIguales++;
        return (nIguales == a.length);
    }

    public static boolean isArrayOn(int[] a, int[] b) {
        int nConten = 0;
        int[] oa;
        int[] ob;
        if(a.length > b.length)
            return false;
        oa = copy(a);
        ob = copy(b);
        sort(oa);
        sort(oa);
        for(int i = 0; i < a.length; i++)
            if(oa[i] == ob[i])
                nConten++;
        return (nConten == a.length);
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++)
            for(int j = i + 1; j < array.length; j++)
                if(array[i] > array[j])
                    swap(array, i, j);
    }

    public static int[] copy(int[] array) {
        int[] c = new int[array.length];
        for(int i = 0; i < array.length; i++)
            c[i] = array[i];
        return c;
    }

    public static void removeOddNumbers(int[] array) {
        for(int i = 0; i < array.length; i++)
            if(array[i] % 2 != 0)
                array[i] = 0;
    }

    // FIXME: start y end son índice, no valores del array cuyas posiciones haya que buscar
    public static void printRange(int[] array, int start, int end) {
        int posI = buscar(array, start);
        int posF = buscar(array, end);

        if(posI == -1)
            throw(new InputMismatchException(
                    "Posición inicial no encontrada en el array"));
        else if(posF == -1)
            throw(new InputMismatchException(
                    "Posición final no encontrada en el array"));
        else if(posI > posF)
            throw(new ArrayIndexOutOfBoundsException(
                    "El índice inicial para el array es mayor que el final"));

        System.out.print("[");
        for(int i = posI; i <= posF; i++) {
            System.out.print(array[i]);
            if(i < posF)
                System.out.print(", ");
        }
        System.out.print("]");
    }

    private static int buscar(int[] a, int n) {
        for(int i = 0; i < a.length; i++)
            if(a[i] == n)
                return i;
        return -1;
    }

    private static void swap(int[] array, int a, int b) {
        int x = array[a];
        array[a] = array[b];
        array[b] = x;
    }
}