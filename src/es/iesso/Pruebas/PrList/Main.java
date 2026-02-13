package es.iesso.Pruebas.PrList;

import es.iesso.Impresora;

import java.util.ArrayList;
import java.util.LinkedList;

public final class Main {

        private static final int TAM_PROB = 10000000;
        private static final int TAM_ADD = 100;
        private static final String ELEM = "Mensaje inútil de prueba";

        static void main() {
                LinkedList<String> ll = new LinkedList<>();
                ArrayList<String> al = new ArrayList<>();
                init(ll);
                init(al);
                System.out.println("Comenzando prueba...");
                System.out.println();
                int sizeLL = ll.size();
                int sizeAL = al.size();
                int halfSizeLL = ll.size() / 2;
                int halfSizeAL = al.size() / 2;

                long startTimeLL = System.nanoTime();
                exec(ll, halfSizeLL);
                long endTimeLL = System.nanoTime();
                double durationLL = (double) (endTimeLL - startTimeLL) / 1000000;

                System.out.println("Duración LL: " + durationLL + " ms");

                long startTimeAL = System.nanoTime();
                exec(al, halfSizeAL);
                long endTimeAL = System.nanoTime();
                double durationAL = (double) (endTimeAL - startTimeAL) / 1000000;

                System.out.println("Duración AL: " + durationAL + " ms");
                printRatio(durationLL, durationAL);
        }

        private static void printRatio(double dur1, double dur2) {
                System.out.println("Ratio: " + Impresora.format(dur1 / dur2, 2));
        }

        private static void init(LinkedList<String> ll) {
        for(int i = 0; i < TAM_PROB; i++)
                ll.add(ELEM);
        }

        private static void init(ArrayList<String> al) {
                for(int i = 0; i < TAM_PROB; i++)
                        al.add(ELEM);
                }

        private static void exec(LinkedList<String> ll, int index) {
                for(int i = 0; i < TAM_ADD; i++)
                        ll.add(index, ELEM);
        }

        private static void exec(ArrayList<String> al, int index) {
                for(int i = 0; i < TAM_ADD; i++)
                        al.add(index, ELEM);
        }

        private Main() {
                throw new UnsupportedOperationException();
        }
}
