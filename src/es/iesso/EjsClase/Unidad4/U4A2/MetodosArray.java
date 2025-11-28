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

    public static int[] ordenarAsc(int[] a) {
        return ordenar(a, "asc");
    }

    public static int[] ordenarDesc(int[] a) {
        return ordenar(a, "desc");
    }

    public static int sumar(int[] a) {
        int suma = 0;
        for(int n : a)
            suma += n;
        return suma;
    }

    public static void intercambiar(int[] a, int eA, int[] b, int eB) {
        int x = a[eA];
        a[eA] = b[eB];
        b[eB] = x;
    }

    public static void intercambiar(int[] a, int i,  int j) {
        intercambiar(a, i, a, j);
    }

    public static double media(double[] a) {
        double m;
        double t = 0;
        for(double n : a)
            t += n;
        m = t / a.length;
        return m;
    }

    public static boolean sonIguales(int[] a, int[] b) {
        int nIguales = 0;
        if(a.length != b.length)
            return false;
        for(int i = 0; i < a.length; i++)
            if(a[i] == b[i])
                nIguales++;
        return (nIguales == a.length);
    }

    public static boolean sonIgualesSinOrden(int[] a, int[] b) {
        int nIguales = 0;
        int[] oa;
        int[] ob;
        if(a.length != b.length)
            return false;
        oa = ordenarAsc(a);
        ob = ordenarAsc(b);
        for(int i = 0; i < a.length; i++)
            if(oa[i] == ob[i])
                nIguales++;
        return (nIguales == a.length);
    }

    public static boolean estaContenidoEn(int[] a, int[] b) {
        int nConten = 0;
        int[] oa;
        int[] ob;
        if(a.length > b.length)
            return false;
        oa = ordenarAsc(a);
        ob = ordenarAsc(b);
        for(int i = 0; i < a.length; i++)
            if(oa[i] == ob[i])
                nConten++;
        return (nConten == a.length);
    }

    public static int[] revertir(int[] a) {
        int[] r = Arrays.copyOf(a, a.length);
        int j = r.length - 1;
        for(int i = 0; i < j; i++) {
            intercambiar(r, i, j);
            j--;
        }
        return r;
    }

    private static int[] ordenar(int[] a, String ord) {
        int[] oa = Arrays.copyOf(a, a.length);
        for(int i = 0; i < oa.length - 1; i++)
            for(int j = i + 1; j < oa.length; j++) {
                if(ord.equals("asc") && (oa[i] > oa[j]))
                    intercambiar(oa, i, j);
                else if(ord.equals("desc") && (oa[i] < oa[j]))
                    intercambiar(oa, i, j);
            }
        return oa;
    }
}