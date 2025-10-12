package es.iesso.Entregar.U2A5; // TODO Quitar antes de entregar

import java.util.Scanner;

/**
 * Actividad 5 de la Unidad 2 de Programación, por Iñaki Bazán Fernández,
 * 1ºJ (DAW), IES Severo Ochoa, Elche
 */
public final class Main {

    private static final String txtPedirA = "Introduce A (1er sumando): ";
    private static final String txtPedirB = "Introduce B (2o sumando): ";
    private static final String txtPedirL = "Introduce L (límite): ";
    private static final String txtErrMayor0 = "Error: El valor debe ser mayor a 0";
    private static final String txtErrBMayorA = "Error: El valor debe ser mayor que A";
    private static final String txtErrL = "Error: El valor debe ser mayor que 2 y menor o igual a 30";
    private static final String txtInValido = "Error: introduzca un número entero válido";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = pedirA(sc);
        int b = pedirB(sc, a);
        int l = pedirL(sc);
        ejecBucle(a, b, l);
    }

    private static int pedirA(Scanner sc) {
        String input = null;
        int n = 0;
        System.out.println();
        while(n <= 0) {
            System.out.print(txtPedirA);
            input = sc.nextLine();
            try {
                n = Integer.parseInt(input);
                if(n <= 0)
                    System.out.println(txtErrMayor0);
            } catch(NumberFormatException nFE) {
                System.out.println(txtInValido);
            }
            System.out.println();
        }
        return n;
    }

    private static int pedirB(Scanner sc, int a) {
        String input = null;
        int n = 0;
        while(n <= a) {
            System.out.print(txtPedirB);
            input = sc.nextLine();
            try {
                n = Integer.parseInt(input);
                if(n <= a)
                    System.out.println(txtErrBMayorA);
            } catch(NumberFormatException nFE) {
                System.out.println(txtInValido);
            }
            System.out.println();
        }
        return n;
    }

    private static int pedirL(Scanner sc) {
        String input = null;
        int n = 0;
        while(n <= 2 || n > 30) {
            System.out.print(txtPedirL);
            input = sc.nextLine();
            try {
                n = Integer.parseInt(input);
                if(n <= 2 || n > 30)
                    System.out.println(txtErrL);
            } catch(NumberFormatException nFE) {
                System.out.println(txtInValido);
            }
            System.out.println();
        }
        return n;
    }

    private static void ejecBucle(int a, int b, int l) {
        int i = 1;
        int r;
        System.out.print(a + " " + b);
        while(i <= (l - 2)) {
            r = a + b;
            a = b;
            b = r;
            if(i < l)
                System.out.print(" ");
            System.out.print(r);
            i++;
        }
        System.out.println();
    }
}
