package es.iesso.Entregar.U7A5;

import java.util.Scanner;

public abstract class Menu {

        // Constantes
        // TODO Cambiar constantes

        private static final String TXT_TITULO = "TÍTULO";
        private static final String SUB_TITULO = "------";

        private static final String SEP = ": ";
        private static final String CURSOR = ">";

        private static final String TXT_ENTER = "(Pulse Enter para continuar)";
        private static final String TXT_FINAL = "Saliendo del programa...";

        private static final String TXT_ERR = "Error";
        private static final String ERR_IN_COM = "Comando desconocido";
        private static final String ERR_IN_INT = "La entrada no es un entero";
        private static final String ERR_IN_NAT = "La entrada no es un natural";

        private static final String TXT_COMS = "Comandos:";
        private static final String TXT_EXIT = "Salir";
        private static final String TXT_COM1 = "Primer comando";
        private static final String TXT_COM2 = "Segundo comando";
        private static final String TXT_COM3 = "Tercer comando";
        private static final String TXT_COM4 = "Cuarto comando";
        private static final String TXT_COM5 = "Quinto comando";

        private static final String COM_EXIT = "0";
        private static final String COM1 = "1";
        private static final String COM2 = "2";
        private static final String COM3 = "3";
        private static final String COM4 = "4";
        private static final String COM5 = "5";

        // Atributos de clase

        private static Scanner sc;

        // Métodos principales

        public static void ejecutar(Scanner sc) {
                Menu.sc = sc;
                boolean seguir = true;
                imprTitulo();
                imprComandos();
                while(seguir)
                        seguir = ejecutarBucle();
                imprFinal();
        }

        private Menu() {
                throw new UnsupportedOperationException();
        }

        private static boolean ejecutarBucle() {
                boolean seguir = true;
                boolean esValido = true;
                String com;
                com = pedirCom();
                switch(com) {
                        case COM_EXIT -> seguir = false;
                        case COM1 -> comando1();
                        case COM2 -> comando2();
                        case COM3 -> comando3();
                        case COM4 -> comando4();
                        case COM5 -> comando5();
                        // TODO Añadir comandos
                        default -> {
                                imprErr(ERR_IN_COM);
                                esValido = false;
                        }
                }
                if(seguir && esValido) {
                        pedirEnter();
                        imprComandos();
                }
                return seguir;
        }

        private static void comando1() {
                linea();
                System.out.println("Ejecutando el primer comando...");
        }

        private static void comando2() {
                linea();
                System.out.println("Ejecutando el segundo comando...");
        }

        private static void comando3() {
                linea();
                System.out.println("Ejecutando el tercer comando...");
        }

        private static void comando4() {
                linea();
                System.out.println("Ejecutando el cuarto comando...");
        }

        private static void comando5() {
                linea();
                System.out.println("Ejecutando el quinto comando...");
        }

        // Entrada del usuario

        private static String pedirCom() {
                String s = "";
                linea();
                while(s.isBlank()) {
                        cursor();
                        s = sc.nextLine().trim();
                }
                return s;
        }

        private static String pedirString(String com) {
                String s = "";
                while(s.isBlank()) {
                        System.out.print(com + SEP);
                        s = sc.nextLine().trim();
                }
                return s;
        }

        private static int pedirInt(String com) {
                int n = Integer.MIN_VALUE;
                String input;
                boolean valido = false;
                while(!valido) {
                        System.out.print(com + SEP);
                        input = sc.nextLine();
                        try {
                                n = Integer.parseInt(input);
                                valido = true;
                        } catch (NumberFormatException nFE) {
                                imprErr(ERR_IN_INT);
                        }
                }
                return n;
        }

        private static int pedirNat(String com) {
                int n = 0;
                String input;
                while(n <= 0) {
                        System.out.print(com + SEP);
                        input = sc.nextLine();
                        try {
                                n = Integer.parseInt(input);
                        } catch (NumberFormatException nFE) {
                                imprErr(ERR_IN_NAT);
                        }
                }
                return n;
        }

        private static void pedirEnter() {
                linea();
                System.out.print(TXT_ENTER + " ");
                sc.nextLine();
        }

        // Imprimir información

        private static void imprTitulo() {
                linea();
                linea();
                System.out.println(TXT_TITULO);
                System.out.println(SUB_TITULO);
        }

        private static void imprComandos() {
                linea();
                System.out.println(TXT_COMS);
                imprCom(COM_EXIT, TXT_EXIT);
                imprCom(COM1, TXT_COM1);
                imprCom(COM2, TXT_COM2);
                imprCom(COM3, TXT_COM3);
                imprCom(COM4, TXT_COM4);
                imprCom(COM5, TXT_COM5);
                // TODO Añadir opciones a mostrar
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

        // Específicos
}
