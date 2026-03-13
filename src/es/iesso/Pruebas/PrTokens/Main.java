package es.iesso.Pruebas.PrTokens;

import java.util.StringTokenizer;

public class Main {

        static void main() {
                String linea = "Hola a todes";
                StringTokenizer st = new StringTokenizer(linea, " ");
                while(st.hasMoreTokens()) {
                        System.out.println(st.nextToken());
                }
        }
}
