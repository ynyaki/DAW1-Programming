package es.iesso.Otros.u2act3;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        linea();

        ejercicio1();
        ejercicio2();
        // ejercicio5(); // Bucle infinito
        ejercicio6();
        ejercicio7();
        ejercicio8();

        sc.close();
    }

    private static void ejercicio1() {
        imprttl("Ejercicio 1");

        imprln("f)");
        int i = 0;
        while(i <= 3) {
            imprln("i = " + i);
            i++;
        }
        impr("(Pulsa Enter para continuar) ");
        sc.nextLine();
        linea();
    }

    private static void ejercicio2() {
        imprttl("Ejercicio 2");

        impr("Valor inicial: ");
        int i = sc.nextInt();
        sc.nextLine();
        impr("Valor límite: ");
        int n = sc.nextInt();
        sc.nextLine();
        if(i <= n) {
            while (i <= n) {
                imprln("i = " + i);
                i++;
            }
        }
        else {
            while(i >= n) {
                imprln("i = " + i);
                i--;
            }
        }
        impr("(Pulsa Enter para continuar) ");
        sc.nextLine();
        linea();
    }

    /*
    private static void ejercicio5() {
        imprttl("Ejercicio 5");
        while(true) { // Bucle infinito
            imprln("  **********");
            imprln("*  *********");
            imprln("**  ********");
            imprln("***  *******");
            imprln("****  ******");
            imprln("*****  *****");
            imprln("******  ****");
            imprln("*******  ***");
            imprln("********  **");
            imprln("*********  *");
            imprln("**********  ");
            imprln(" ********** ");
        }
    }
    */

    private static void ejercicio6() {
        imprttl("Ejercicio 6");

        int nClase = 7;
        int nPC = 24;
        int i = 1;
        while(i <= 24) {
            imprln(nClase + "." + i);
            i++;
        }
        impr("(Pulsa Enter para continuar) ");
        sc.nextLine();
        linea();
    }

    private static void ejercicio7() {
        imprttl("Ejercicio 7");

        int nClase = 7;
        int nPC = 24;
        int i = 1;
        while(i <= 24) {
            impr(nClase + "." + i);
            if(i < 24)
                impr(", ");
            i++;
        }
        linea();

        impr("(Pulsa Enter para continuar) ");
        sc.nextLine();
        linea();
    }

    private static void ejercicio8() {
        imprttl("Ejercicio 8");

        for(int i = 1; i <= 25; i += 4) {
            impr(String.valueOf(i));
            if(i < 25)
                impr(", ");
        }
        linea();

        impr("(Pulsa Enter para continuar) ");
        sc.nextLine();
    }

    /** Imprime un salto de línea */
    private static void linea() {
        System.out.println();
    }

    /**
     * Ejecuta un {@code System.out.print}
     * @param txt {@code String} a imprimir
     */
    private static void impr(String txt) {
        System.out.print(txt);
    }

    /**
     * Ejecuta un {@code System.out.println}
     * @param txt {@code String} a imprimir
     */
    private static void imprln(String txt) {
        System.out.println(txt);
    }

    /**
     * Imprime un título, es decir, un texto subrayado y un salto de línea
     * @param txt Título en formato {@code String} a imprimir
     */
    private static void imprttl(String txt) {
        System.out.println(txt);
        for(int i = 1; i <= txt.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();
    }
}
