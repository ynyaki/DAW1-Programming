package es.iesso.EjsClase.Unidad4.U4A2;

import java.util.Arrays;
import java.util.Scanner;

public abstract class MetodosArray {

    public static int[] pedirArray(Scanner sc) {
        int[] a;
        int n;
        System.out.print("Tamaño del array: ");
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < a.length; i++) {
            System.out.print("int[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int maximo(int[] a) {
        int max = Integer.MIN_VALUE;
        for(int n : a)
            if(max < n)
                max = n;
        return max;
    }

    public static int minimo(int[] a) {
        int min = Integer.MAX_VALUE;
        for(int n : a)
            if(min > n)
                min = n;
        return min;
    }

    public static int[] ordenar(int[] a) {
        int x;
        int[] oa = Arrays.copyOf(a, a.length);
        for(int i = 0; i < oa.length - 1; i++)
            for(int j = 1; j < oa.length; j++)
                if(oa[i] > oa[j]) {
                    x = oa[i];
                    oa[i] = oa[j];
                    oa[j] = x;
                }
        return oa;
    }

    public static int sumar(int[] a) {
        int suma = 0;
        for(int n : a)
            suma += n;
        return suma;
    }
}
