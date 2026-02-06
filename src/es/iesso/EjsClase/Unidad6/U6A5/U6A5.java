package es.iesso.EjsClase.Unidad6.U6A5;

import es.iesso.EjsClase.Unidad6.U6A5.U6A5E1.*;
import es.iesso.EjsClase.Unidad6.U6A5.U6A5E2.*;
import es.iesso.EjsClase.Unidad6.U6A5.U6A5E456.*;
import es.iesso.EjsClase.Unidad6.U6A5.U6A5E7.*;

import es.iesso.Impresora;

import java.util.Arrays;
import java.util.Scanner;

public abstract class U6A5 extends Impresora {

    private static final int N_UD = 6;
    private static final int N_ACT = 5;
    private static final int N_EJS = 7;

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
        else if(n == 6)
            ej6();
        else if(n == 7)
            ej7();
    }

    private static void ej1() {
        SubClase sub = new SubClase();
        sub.abstract_method();
        sub.method();
    }

    private static void ej2() {
        HourlyEmployee he = new HourlyEmployee("Patricio", "Becario", 1.5, 100);
        SalaryEmployee se = new SalaryEmployee("Bob", "Cocinero", 300);
        imprln(he.getNombre() + ", " + he.getCargo()
                + ": " + he.calculateWeeklyPay());
        imprln(se.getNombre() + ", " + se.getCargo()
                + ": " + se.calculateWeeklyPay());
    }

    private static void ej3() {
        imprln("a) Tiene un constructor, pero no se puede instanciar la clase." +
                " Su constructor solo puede ser invocado a través de una clase hija.");
        imprln("b) La clase abstracta sigue siendo una clase, por lo que tiene" +
                " funcionalidad propia. La interfaz no contiene lógica" +
                " (salvo con métodos estáticos).");
        imprln("c) Sï poede.");
    }

    private static void ej4() {
        imprln("Clases Forma, Rectángulo y Triángulo creadas.");
    }

    private static void ej5() {
        Rectangulo r = new Rectangulo(2, 3);
        imprln(r);
        r.redimensionar(2);
        imprln(r);
    }

    private static void ej6() {
        Rectangulo[] ra = new Rectangulo[] {
            new Rectangulo(1, 3),
            new Rectangulo(2, 4),
            new Rectangulo(4, 2),
            new Rectangulo(3, 4),
            new Rectangulo(4, 5),
            new Rectangulo(6, 4),
            new Rectangulo(9, 1),
            new Rectangulo(8, 1),
            new Rectangulo(5, 5),
            new Rectangulo(8, 8)
        };
        Arrays.sort(ra);
        imprar(ra);
    }

    private static void ej7() {
        Estudiante[] lEst = new Estudiante[] {
            new Estudiante("Patri", 170, 12),
            new Estudiante("Manuel", 173, 43),
            new Estudiante("Javier", 189, 72),
            new Estudiante("Javier", 188, 31),
            new Estudiante("Javier", 187, 72)
        };
        imprln("Array creado:");
        imprar(lEst);
        linea();
        Arrays.sort(lEst);
        imprln("Array ordenado:");
        imprar(lEst);
    }
}