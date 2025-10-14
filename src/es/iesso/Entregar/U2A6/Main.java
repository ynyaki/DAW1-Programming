package es.iesso.Entregar.U2A6;

import java.util.Scanner;

/**
 * Actividad 6 de la Unidad 2 de Programación,
 * por Iñaki Bazán Fernández,
 * 1º. J (DAW), IES Severo Ochoa, Elche
 */
public final class Main {

    private static final String TXT_TITULO = "DESGLOSE DE BILLETES";
    private static final String TXT_TITULO_SUB = "--------------------";
    private static final String TXT_PEDIR_C = "Introduce la cantidad a desglosar: ";
    private static final String TXT_PEDIR_CONTINUAR = "¿Desea continuar? (S/N): ";

    private static final String TXT_BILLETES = "Billetes de ";
    private static final String TXT_MONEDAS = "Monedas de ";
    private static final String TXT_EURO = "€";
    private static final String SEP = ": ";
    private static final String TXT_ERR_NUM_0 = "Error: El número debe ser mayor que 0";
    private static final String TXT_ERR_NUM = "Error: Número no válido";

    private static Scanner sc;
    private static int c;
    private static int b500;
    private static int b200;
    private static int b100;
    private static int b50;
    private static int b20;
    private static int b10;
    private static int b5;
    private static int m2;
    private static int m1;

    public static void main(String[] args) {
        boolean continuar;
        sc = new Scanner(System.in);
        imprttl();
        do {
            c = pedirC();
            calcDesglose();
            imprDesglose();
            continuar = pedirContinuar();
        } while(continuar);
        sc.close();
    }

    private static void calcDesglose() {
        for(b500 = 0; c >= 500; c -= 500)
            b500++;
        for(b200 = 0; c >= 200; c -= 200)
            b200++;
        for(b100 = 0; c >= 100; c -= 100)
            b100++;
        for(b50 = 0; c >= 50; c -= 50)
            b50++;
        for(b20 = 0; c >= 20; c -= 20)
            b20++;
        for(b10 = 0; c >= 10; c -= 10)
            b10++;
        for(b5 = 0; c >= 5; c -= 5)
            b5++;
        for(m2 = 0; c >= 2; c -= 2)
            m2++;
        for(m1 = 0; c == 1; c -= 1)
            m1++;
    }

    private static void imprDesglose() {
        if(b500 > 0)
            System.out.println(TXT_BILLETES + 500 + TXT_EURO + SEP + b500);
        if(b200 > 0)
            System.out.println(TXT_BILLETES + 200 + TXT_EURO + SEP + b200);
        if(b100 > 0)
            System.out.println(TXT_BILLETES + 100 + TXT_EURO + SEP + b100);
        if(b50 > 0)
            System.out.println(TXT_BILLETES + 50 + TXT_EURO + SEP + b50);
        if(b20 > 0)
            System.out.println(TXT_BILLETES + 20 + TXT_EURO + SEP + b20);
        if(b10 > 0)
            System.out.println(TXT_BILLETES + 10 + TXT_EURO + SEP + b10);
        if(b5 > 0)
            System.out.println(TXT_BILLETES + 5 + TXT_EURO + SEP + b5);
        if(m2 > 0)
            System.out.println(TXT_MONEDAS + 2 + TXT_EURO + SEP + m2);
        if(m1 > 0)
            System.out.println(TXT_MONEDAS + 1 + TXT_EURO + SEP + m1);
        System.out.println();
    }

    private static int pedirC() {
        String input;
        int n = 0;
        while(n <= 0) {
            System.out.print(TXT_PEDIR_C);
            input = sc.nextLine();
            try {
                n = Integer.parseInt(input);
                if(n <= 0)
                    System.out.println(TXT_ERR_NUM_0);
            } catch(NumberFormatException nFE) {
                System.out.println(TXT_ERR_NUM);
            }
            System.out.println();
        }
        return n;
    }

    private static boolean pedirContinuar() {
        String input;
        boolean continuar;
        boolean error;
        do {
            System.out.print(TXT_PEDIR_CONTINUAR);
            input = sc.nextLine();
            if(input.equalsIgnoreCase("S")) {
                continuar = true;
                error = false;
                System.out.println();
            }
            else if(input.equalsIgnoreCase("N")) {
                continuar = false;
                error = false;
            }
            else {
                continuar = true;
                error = true;
                System.out.println("Error: debes introducir S ó N para continuar");
                System.out.println();
            }
        } while(error);
        return continuar;
    }

    private static void imprttl() {
        System.out.println();
        System.out.println(TXT_TITULO);
        System.out.println(TXT_TITULO_SUB);
        System.out.println();
    }
}