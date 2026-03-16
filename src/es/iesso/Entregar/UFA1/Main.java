package es.iesso.Entregar.UFA1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Error: el programa debe iniciarse con 2 argumentos.");
            return;
        }

        String fName = args[0];
        String word = args[1];
        String line;
        StringTokenizer st;
        int count = 0;
        BufferedReader r = setOutput(new File(fName));
        if(r == null)
            return;

        try {
            while((line = r.readLine()) != null) {
                st = new StringTokenizer(line, " ,.;-");
                while(st.hasMoreTokens()) {
                    if(st.nextToken().equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            System.out.println("Veces que aparece \"" + word + "\": " + count);
            r.close();
        } catch(IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

    private static BufferedReader setOutput(File f) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
        } catch(FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
        }
        return br;
    }
}
