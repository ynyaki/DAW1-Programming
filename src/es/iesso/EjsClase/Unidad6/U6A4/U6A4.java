package es.iesso.EjsClase.Unidad6.U6A4;

import es.iesso.Impresora;

import java.util.Scanner;

public abstract class U6A4 extends Impresora {

    private static final int N_UD = 6;
    private static final int N_ACT = 4;
    private static final int N_EJS = 5;

    private static final String TITULO_ACT = "UNIDAD " + N_UD + " - ACTIVIDAD " + N_ACT;
    private static final String TITULO_EJ = "U" + N_UD + "A" + N_ACT + ". Ejercicio ";
    private static final String COM_ENTRAR = "(Pulsa Entrar para continuar...) ";

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
    }

    private static void ej1() {
        imprln("a) No, ya que no se puede instanciar una clase.");
        imprln("b) La herencia puede instanciar métodos no estáticos" +
                " y variables (constructor y setters).");
        imprln("c) Porque los métodos de la interfaz se declaran para ser" +
                " implementados por una clase.");
        imprln("d) No, porque habría ambigüedad en este valor.");
        imprln("   Corrección: sí, la ambigüedad se resuelve especificando" +
                " de qué interfaz se toma el valor.");
        imprln("e) Sí, es su principal función.");
        imprln("f) No, ya que no hay comportamiento ambiguo.");
    }

    private static void ej2() {
        imprln("Interfaz creada.");
    }

    private static void ej3() {
        imprln("No se ha instanciado \"y\".");
    }

    private static void ej4() {
        imprln("a) Bienes: clase madre");
        imprln("b) Comida: clase hija");
        imprln("c) Juguete: clase hija, implementa Imponible");
        imprln("d) Libro: clase hija, implementa Imponible");
        imprln("e) Imponible: interfaz");
    }

    private static void ej5() {
        imprln("b) y c) Podría crearse un array de Imponible" +
                " con Juguete y Libro.");
        imprln("d) Llamarán a sus propias implementaciones de \"toString()\".");
    }
}