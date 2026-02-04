package es.iesso.EjsClase.Unidad6.U6A3;

import es.iesso.EjsClase.Unidad6.U6A3.U6A3E3.Coche;
import es.iesso.EjsClase.Unidad6.U6A3.U6A3E3.Monovolumen;
import es.iesso.EjsClase.Unidad6.U6A3.U6A3E3.Pickup;
import es.iesso.EjsClase.Unidad6.U6A3.U6A3E3.Todoterreno;
import es.iesso.Impresora;

import java.util.Scanner;

public abstract class U6A3 extends Impresora {

    private static final int N_UD = 6;
    private static final int N_ACT = 3;
    private static final int N_EJS = 3;

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
        imprttl(TITULO_ACT);
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
    }

    private static void ej1() {
        imprln("a)");
        imprln("  - Imprime saludos veraniegos para Amy.");
        imprln("  - Imprime una carta romántica con 3 besos para Bob.");
        imprln("  - Dedica una felicitación por el 17 aniversario de Cindy.");

        linea();
        imprln("b)");
        imprln("- Sí");
        imprln("- No");
        imprln("- Sí");
        imprln("- No ");
    }

    private static void ej2() {
        impr("rod = new Rat()" + ": ");
        imprln("SÍ");
        impr("mou = new Rat()" + ": ");
        imprln("NO");
        impr("rat = new Rodent()" + ": ");
        imprln("NO");
        impr("rat = new FieldMouse()" + ": ");
        imprln("NO");

        impr("rod = new FieldMouse()" + ": ");
        imprln("SÍ");
        impr("mou = new Rodent()" + ": ");
        imprln("NO");
        impr("rat = new LabRat()" + ": ");
        imprln("SÍ");
        impr("rat = new Mouse()" + ": ");
        imprln("NO");
    }

    private static void ej3() {
        Coche p = new Pickup("Ford Ranger", 12);
        Coche t = new Todoterreno("Jaguar F-Pace", 16);
        Coche m = new Monovolumen("Citroën Ë-Berlingo", 16);
        accionar(p);
        accionar(t);
        accionar(m);
    }

    private static void accionar(Coche c) {
        System.out.println("Vamos a probar este " + c.getModelo() + ":");
        c.arrancar();
        c.acelerar();
        c.frenar();
        System.out.println();
    }
}