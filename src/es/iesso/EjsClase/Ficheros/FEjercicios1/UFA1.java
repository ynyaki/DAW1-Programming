package es.iesso.EjsClase.Ficheros.FEjercicios1;

import es.iesso.Impresora;

import java.io.*;
import java.util.Scanner;

public abstract class UFA1 extends Impresora {

    public static final String N_UD = "F";
    public static final String N_ACT = "1";
    public static final int N_EJS = 10;

    private static final String TITULO_ACT = "UNIDAD " + N_UD + " - ACTIVIDAD " + N_ACT;
    private static final String TITULO_EJ = "U" + N_UD + "A" + N_ACT + ". Ejercicio ";
    private static final String COM_ENTRAR = "(Pulsa Entrar para continuar...) ";

    private static final String PATH =
                    "/home/inaki/Documents/DAW/PRG/DAW1-Programming/files/ficheros/";

    private static Scanner sc;

    private UFA1() {
        throw new UnsupportedOperationException();
    }

    public static void mostrarAct(Scanner scIn) {
        sc = scIn;
        lineas(2);
        imprttl(TITULO_ACT, '=');
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
    }

    private static void ej1() {
        PrintWriter pr = setInput(new File(PATH + "numNaturales.txt"));
        if(pr == null)
            return;

        for(int i = 1; i <= 200; i++) {
            pr.println(i);
        }
        imprln("FIN");
        pr.close();
    }

    private static void ej2() {
        String fName = "numNaturales.txt";
        imprln("Suma de números del archivo \""
                        + fName + "\" = " + getSumaFromFile(fName));
    }

    private static int getSumaFromFile(String fName) {
        String linea;
        int suma = 0;
        File f = new File(PATH + fName);
        BufferedReader br = setOutput(f);
        if(br == null)
            return 0;

        try {
            while((linea = br.readLine()) != null) {
                suma += Integer.parseInt(linea);
            }
            br.close();
        } catch(NumberFormatException nFE) {
            imprln("Error: no número encontrado");
        } catch(IOException ioE) {
            imprln("Error al leer el archivo.");
        }
        return suma;
    }

    private static void ej3() {
        boolean esPrimo;
        String linea;
        File f = new File(PATH + "primos.dat");
        PrintWriter pw = setInput(f);
        BufferedReader br;
        if(pw == null)
            return;

        for(int i = 1; i <= 500; i++) {
            esPrimo = true;
            for(int j = 2; esPrimo && (j <= 500); j++) {
                if((i != j) && (i % j == 0)) {
                    esPrimo = false;
                }
            }
            if(esPrimo) {
                pw.println(i);
            }
        }
        pw.close();

        br = setOutput(f);
        if(br == null)
            return;

        try {
            while((linea = br.readLine()) != null) {
                imprln(linea);
            }
            br.close();
        } catch(NumberFormatException nFE) {
            imprln("Error: no número encontrado");
        } catch(IOException ioE) {
            imprln("Error al leer el archivo.");
        }
    }

    private static void ej4() {
        // TODO Por hacer
    }

    private static void ej5() {
        // TODO Por hacer
    }

    private static void ej6() {
        // TODO Por hacer
    }

    private static void ej7() {
        // TODO Por hacer
    }

    private static void ej8() {
        // TODO Por hacer
    }

    private static void ej9() {
        // TODO Por hacer
    }

    private static void ej10() {
        // TODO Por hacer
    }

    private static PrintWriter setInput(File f) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
        } catch(IOException e) {
            imprln("No pudo abrirse el archivo.");
        }
        return pw;
    }

    private static BufferedReader setOutput(File f) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
        } catch(FileNotFoundException e) {
            imprln("No se encontró el archivo.");
        }
        return br;
    }
}