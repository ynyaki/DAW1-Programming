package es.iesso.EjsClase.Unidad4.U4A5;

import es.iesso.Impresora;

import java.util.Arrays;
import java.util.Scanner;

public abstract class U4A5 extends Impresora {

    private static final int N_UD = 4;
    private static final int N_ACT = 5;
    private static final int N_EJS = 10;

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
        else if(n == 8)
            ej8();
        else if(n == 9)
            ej9();
        else if(n == 10)
            ej10();
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        imprln("String arr = new String[1000];");
    }

    private static void ej2() {
        imprln("arr[0] = \"Programación\";");
    }

    private static void ej3() {
        imprln("Cada String puede tener su propia longitud independiente.");
    }

    private static void ej4() {
        imprln("arr[999] = \"Java\"");
    }

    private static void ej5() {
        String[] s = new String[3];
        imprln("Respuesta: Se inicializan con valor \"\", es decir, vacíos.");
        imprln("Comprobación: " + s[0]);
    }

    private static void ej6() {
        imprln("Para cada iteración, imprimirá \"\".");
        imprln("Corrección: da excepción.");
    }

    private static void ej7() {
        String[] s = new String[5];
        s[0] = "Pera";
        s[1] = "Manzana";
        s[4] = "Naranja";
        printArray(s);
    }

    private static void printArray(String[] s) {
        for(int i = 0; i < s.length; i++) {
            System.out.print("[" + i + "]: ");
            if(s[i].isEmpty())
                System.out.print("-");
            else
                System.out.print(s[i]);
            System.out.println();
        }
    }

    private static void ej8() {
        imprln("a) Se han pasado 4 parámetros.");
        imprln("b) Cada argumento se separa con un espacio.");
    }

    private static void ej9() {
        int suma = 0;
        String[] args = {"15", "79", "34", "68", "-20"};
        for(int i = 0; i < args.length; i++)
            suma += Integer.parseInt(args[i]);
        imprln(Arrays.toString(args));
        imprln("Suma = " + suma);
    }

    private static void ej10() {
        imprln("a) 5 * sizeof(int)");
        imprln("b) 10 * sizeof(double)");
        imprln("c) 30 * sizeof(char)");
        imprln("d) 10 * sizeof(String)");
        imprln("e) 5 * sizeof(Persona)");
    }
}