package es.iesso.EjsClase.Ficheros.FEjercicios1;

import es.iesso.Impresora;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        pedirEnter();
    }

    private static void pedirEnter() {
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

        for(int i = 1; i <= 100; i++) {
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
        BufferedReader br;
        PrintWriter pw;
        String line;
        ArrayList<String> p = new ArrayList<>();
        String file = PATH + "texto1.txt";

        // 1. Escribir un texto

        pw = setInput(new File(file));
        if(pw == null)
            return;

        pw.println("Este texto está escrito");
        pw.println("con mucha pasión.");
        pw.close();
        imprln("Se ha escrito en el archivo.");

        // 2. Leer y almacenar el texto

        br = setOutput(new File(file));
        if(br == null)
            return;

        try {
            while((line = br.readLine()) != null) {
                line = line.toUpperCase().replaceAll(" ", "");
                p.add(line);
            }
            imprln("Se ha leído el archivo.");
        } catch(IOException e) {
            imprln("Error al leer el archivo.");
        }

        // 3. Escribir el texto transformado

        pw = setInput(new File(file));
        if(pw == null)
            return;

        for(String s : p) {
            pw.println(s);
        }
        pw.close();
        imprln("Se ha vuelto a escribir en el archivo.");
    }

    private static void ej5() {
        boolean hayError;
        ArrayList<String> p;
        hayError = crearArchivo5();
        if(hayError)
            return;
        p = leerArchivo5();
        if(p == null)
            return;
        p = modParr5(p);
        crearNewArchivo5(p);
    }

    private static boolean crearArchivo5() {
        String texto = "esto es un texto normal y corriente";
        PrintWriter in = setInput(new File("texto2.txt"));
        if(in == null)
            return true;

        in.println(texto);
        imprln(texto);
        in.close();
        return false;
    }

    private static ArrayList<String> leerArchivo5() {
        String line;
        ArrayList<String> p = new ArrayList<>();
        BufferedReader out = setOutput(new File("texto2.txt"));
        if(out == null)
            return null;

        try {
            while((line = out.readLine()) != null) {
                p.add(line);
            }
            out.close();
        } catch(IOException e) {
            imprln("Error al leer el archivo.");
        }
        return p;
    }

    private static ArrayList<String> modParr5(ArrayList<String> p) {
        ArrayList<String> newP = new ArrayList<>();
        for(String s : p) {
            s = Stream.of(s.split("")).sorted().collect(Collectors.joining()).trim();
            newP.add(s);
        }
        return newP;
    }

    private static boolean crearNewArchivo5(ArrayList<String> p) {
        PrintWriter in = setInput(new File("texto2_new.txt"));
        if(in == null)
            return true;

        for(String s : p) {
            in.println(s);
            imprln(s);
        }
        return false;
    }

    private static void ej6() {
        crearArchivo6();
        leerArchivo6();
    }

    private static void crearArchivo6() {
        String texto = "esto también es un texto normal y corriente1!1!!";
        PrintWriter in = setInput(new File("texto3.txt"));
        if(in == null)
            return;

        in.println(texto);
        imprln(texto);
        in.close();
    }

    private static void leerArchivo6() {
        String line;
        int num = 0;
        int vow = 0;
        int cons = 0;
        BufferedReader out = setOutput(new File("texto3.txt"));
        if(out == null)
            return;

        try {
            while((line = out.readLine()) != null) {
                line = line.replaceAll(" ", "").toLowerCase();
                for(char c : line.toCharArray()) {
                    if(c >= '0' && c <= '9') {
                        num++;
                    } else if(c >= 'a' && c <= 'z') {
                        if(c == 'a' || c == 'i' || c == 'u'
                                || c == 'e' || c == 'o') {
                            vow++;
                        } else {
                            cons++;
                        }
                    }
                }
            }
            out.close();
            imprln("Números: " + num);
            imprln("Vocales: " + vow);
            imprln("Consonantes: " + cons);
        } catch(IOException e) {
            imprln("Error al leer el archivo.");
        }
        return;
    }

    private static void ej7() {
        String fName = "texto4.txt";
        mostrarFichero(fName);
    }

    private static boolean mostrarFichero(String fileName) {
        String line;
        BufferedReader r = setOutput(new File(PATH + fileName));
        if(r == null)
            return false;
        try {
            while((line = r.readLine()) != null) {
                imprln(line);
            }
        } catch(IOException e) {
            imprln("Error al leer el archivo.");
        }
        return true;
    }

    private static void ej8() {
        String fName = "textoEJ8.txt";
        String word = "de";
        System.out.println("Simulación de: $ java mostrarFichero "
                        + fName + " " + word);

        String line;
        StringTokenizer st;
        int count = 0;
        BufferedReader r = setOutput(new File(PATH + fName));

        try {
            while((line = r.readLine()) != null) {
                st = new StringTokenizer(line, " ,.;");
                while(st.hasMoreTokens()) {
                    if(st.nextToken().equals(word)) {
                        count++;
                    }
                }
            }
            System.out.println("Veces que aparece \"" + word + "\": " + count);
            r.close();
        } catch(IOException _) {
            imprln("Error al leer el archivo.");
        }
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