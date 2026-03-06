package es.iesso.Entregar.U7A4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Main {

        private static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
        private static Set<CuerpoCeleste> planetas = new HashSet<>();

        private Main() {
        throw new UnsupportedOperationException();
    }

        public static void main() {
                inicPlanetas();
                inicLunas();
                inicSatelites();

                System.out.println("Cuerpos celestes:");
                for(CuerpoCeleste cc : planetas)
                        System.out.println(cc);

                imprPlaneta("Marte");
        }

        private static void inicPlanetas() {
                addPlaneta("Mercurio", 88);
                addPlaneta("Venus", 225);
                addPlaneta("La Tierra", 365);
                addPlaneta("Marte", 687);
                addPlaneta("Júpiter", 4332);
                addPlaneta("Saturno", 10759);
                addPlaneta("Urano", 30660);
                addPlaneta("Neptuno", 165);
                addPlaneta("Plutón", 248);
        }

        private static void imprPlaneta(String nombre) {
                Planeta p = (Planeta) sistemaSolar.get(nombre);
                System.out.println("Planeta " + p.getNombre());
                System.out.println("Satélites:");
                for(CuerpoCeleste cc : p.getSatelites())
                        System.out.println(cc);
        }

        private static void inicLunas() {
                addLuna("Luna", 27);
                addLuna("Deimos", 1.3);
                addLuna("Phobos", 0.3);
                addLuna("Io", 1.8);
                addLuna("Europa", 3.5);
                addLuna("Ganymede", 7.1);
                addLuna("Callisto", 16.7);
        }

        private static void inicSatelites() {
                addSatelite("Luna", "La Tierra");
                addSatelite("Deimos", "Marte");
                addSatelite("Phobos", "Marte");
                addSatelite("Io", "Júpiter");
                addSatelite("Europa", "Júpiter");
                addSatelite("Ganymede", "Júpiter");
                addSatelite("Callisto", "Júpiter");
        }

        private static void addPlaneta(String nombre, double perOrb) {
                Planeta p = new Planeta(nombre, perOrb);
                sistemaSolar.put(p.getNombre(), p);
                planetas.add(p);
        }

        private static void addLuna(String nombre, double perOrb) {
                Luna p = new Luna(nombre, perOrb);
                sistemaSolar.put(p.getNombre(), p);
                planetas.add(p);
        }

        private static void addSatelite(String nLuna, String nPlaneta) {
                Map<String, CuerpoCeleste> s = sistemaSolar;
                s.get(nPlaneta).addSatelite(s.get(nLuna));
        }
}
