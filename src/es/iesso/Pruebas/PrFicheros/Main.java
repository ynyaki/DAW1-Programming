package es.iesso.Pruebas.PrFicheros;

import java.io.*;

public abstract class Main {

        private static PrintWriter setInput(File f) {
                PrintWriter pw = null;
                try {
                        pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
                } catch(IOException e) {
                        System.out.println("No pudo abrirse el archivo");
                }
                return pw;
        }

        private static BufferedReader setOutput(File f) {
                BufferedReader br = null;
                try {
                        br = new BufferedReader(new FileReader(f));
                } catch(FileNotFoundException e) {
                        System.out.println("No se encontró el archivo");
                }
                return br;
        }
}
