package es.iesso.Entregar.U7A3;

import java.util.*;

public abstract class Menu {

        // Constantes

        private static final String TXT_TITULO = "JUEGO DE AVENTURAS";
        private static final String SUB_TITULO = "------------------";
        private static final String SEP = ": ";
        private static final String CURSOR = ">";
        private static final String TXT_FINAL = "Saliendo...";
        private static final String TXT_ERR = "Error";

        // Atributos de clase
        // TODO Añadir atributos

        private static Scanner sc;
        private static Map<Integer, Ubicacion> mapa;

        // Métodos principales

        public static void ejecutar(Scanner sc) {
                Menu.sc = sc;
                Ubicacion ubAct;
                Integer newUb;
                String com;
                boolean seguir = true;
                boolean esUbVal = false;

                inicUbics();
                ubAct = mapa.get(0);
                imprTitulo();

                while(seguir) {
                        linea();
                        System.out.println(ubAct.getDesc());
                        System.out.print("Salidas: ");
                        imprSalidas(ubAct.getExits());
                        com = null;
                        while(com == null || !esUbVal) {
                                com = pedirString("Ir a");
                                esUbVal = ubAct.exits.containsKey(com);
                                if(!esUbVal) {
                                        linea();
                                        System.out.println("Salida inválida");
                                }
                        }
                        newUb = ubAct.exits.get(com);
                        ubAct = mapa.get(newUb);
                        if(ubAct.equals(mapa.get(0)))
                                seguir = false;
                }
                imprFinal();
        }

        private Menu() {
                throw new UnsupportedOperationException();
        }

        // Específicos
        // TODO Añadir métodos

        private static void imprSalidas(Map<String, Integer> m) {
                Set<String> ss = m.keySet();
                ArrayList<String> ls = new ArrayList<>(ss);
                for(String s : ls) {
                        System.out.print(s);
                        if(!s.equals(ls.getLast()))
                                System.out.print(", ");
                }
                linea();
        }

        private static void inicUbics() {
                Ubicacion ubic;

                Ubicacion prog = new Ubicacion(
                                0, "Estás sentado en la clase de programación");
                Ubicacion mont = new Ubicacion(
                                1, "Estás en la cima de una montaña");
                Ubicacion playa = new Ubicacion(
                                2, "Estás bañándote en la playa");
                Ubicacion edif = new Ubicacion(
                                3, "Estás dentro de un edificio muy alto");
                Ubicacion puente = new Ubicacion(
                                4, "Estás de pie en un puente");
                Ubicacion bosque = new Ubicacion(
                                5, "Estás en un bosque");

                mapa = new HashMap<>();
                mapa.put(prog.getID(), prog);
                mapa.put(mont.getID(), mont);
                mapa.put(playa.getID(), playa);
                mapa.put(edif.getID(), edif);
                mapa.put(puente.getID(), puente);
                mapa.put(bosque.getID(), bosque);

                // 0. Clase de programación
                prog.addExit("1", 1);
                prog.addExit("2", 2);
                prog.addExit("3", 3);
                prog.addExit("4", 4);
                prog.addExit("5", 5);

                // 1. Montaña
                mont.addExit("N", 5);
                mont.addExit("O", 2);
                mont.addExit("E", 3);
                mont.addExit("S", 4);

                // 2. Playa
                playa.addExit("N", 5);

                // 3. Edificio
                edif.addExit("O", 1);

                // 4. Puente
                puente.addExit("N", 1);
                puente.addExit("O", 2);

                // 5. Bosque
                bosque.addExit("O", 2);
                bosque.addExit("S", 1);

                for(int i = 0; i < mapa.size(); i++) {
                        ubic = mapa.get(i);
                        ubic.addExit("Q", 0);
                }
        }

        // Entrada del usuario

        private static String pedirCom() {
                String s = "";
                linea();
                while(s.isBlank()) {
                        cursor();
                        s = sc.nextLine().trim().toUpperCase();
                }
                return s;
        }

        private static String pedirString(String com) {
                String s = "";
                System.out.print(com + SEP);
                s = sc.nextLine().trim().toUpperCase();
                return s;
        }

        // Imprimir información

        private static void imprTitulo() {
                linea();
                linea();
                System.out.println(TXT_TITULO);
                System.out.println(SUB_TITULO);
        }

        private static void cursor() {
                System.out.print(CURSOR + " ");
        }

        private static void imprCom(String com, String txtCom) {
                System.out.println(com + SEP + txtCom);
        }

        private static void imprErr(String msg) {
                System.out.println(TXT_ERR + SEP + msg);
        }

        private static void imprFinal() {
                linea();
                System.out.println(TXT_FINAL);
                linea();
        }

        private static void linea() {
                System.out.println();
        }
}
