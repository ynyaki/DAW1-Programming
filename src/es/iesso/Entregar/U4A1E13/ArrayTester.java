package es.iesso.Entregar.U4A1E13;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Ejercicio 13 de la Actividad 1 de la Unidad 4 de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public abstract class ArrayTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] i = leerArray(sc);
        int[] t = transformarArray(i);
        imprArray(t);
        sc.close();
    }

    public static void imprArray(int[] a) {
        System.out.print("[");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if(i < a.length - 1)
                System.out.print(" ");
        }
        System.out.print("]");
    }

    public static int[] transformarArray(int[] a) {
        int[] r = new int[a.length];
        for(int i = 0; i < r.length; i++)
            if(a[i] % 2 == 0)
                r[i] = a[i];
            else
                r[i] = -1;
        return r;
    }

    public static int[] leerArray(Scanner sc) {
        boolean inputVal = false;
        int[] intA = null;
        String input;
        StringTokenizer st;
        int nt;

        while(!inputVal) {
            System.out.print("Introduce un array de enteros: ");
            input = sc.nextLine().trim();
            st = new StringTokenizer(input, " ");
            nt = st.countTokens();
            intA = new int[nt];
            try {
                for(int i = 0; i < intA.length; i++)
                    intA[i] = Integer.parseInt(st.nextToken());
                inputVal = true;
            } catch(NumberFormatException nFE) {
                System.out.println("Error: Array de enteros inválido");
                System.out.println();
            }
        }
        return intA;
    }
}