package es.iesso.EjsClase.Unidad6.U6A1;

import es.iesso.EjsClase.Unidad6.U6A1.U6A1E5.Pelicula;
import es.iesso.Impresora;

import java.util.Scanner;

public abstract class U6A1 extends Impresora {

    private static final int N_UD = 6;
    private static final int N_ACT = 1;
    private static final int N_EJS = 13;

    private static final String TITULO_ACT = "UNIDAD " + N_UD + " - ACTIVIDAD " + N_ACT;
    private static final String TITULO_EJ = "U" + N_UD + "A" + N_ACT + ". Ejercicio ";
    private static final String COM_ENTRAR = "(Pulsa Entrar para continuar...) ";
    private static final String ERR_EJ = "Error: Ejercicio no disponible";

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
        else if(n == 4)
            ej4();
        else if(n == 5)
            ej5();
        else if(n == 6)
            ej6();
        else if(n == 7)
            ej7();
        else if(n == 8)
            ej8();
        else if(n == 9)
            ej9();
        else if(n == 10)
            ej10();
        else if(n == 11)
            ej11();
        else if(n == 12)
            ej12();
        else if(n == 13)
            ej13();
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        imprln("a) Hay un tipo de automóvil.");
        imprln("b) Hay tres objetos de tipo automóvil.");
    }

    private static void ej2() {
        imprln("a) Nissan es clase hija de Automobile.");
        imprln("b) Nissan es clase madre de Sentra.");
        imprln("c) Ford no tiene clases hijas.");
        imprln("d) Sentra heredará los atributos de Automobile y Nissan.");
        imprln("e) Cada clase solo puede tener una clase madre, por lo que" +
                " Ford no podría heredar de Automobile y Truck a la vez.");
    }

    private static void ej3() {
        imprln("a) y b) Una clase hija hereda los atributos y métodos" +
                " de la clase madre, aunque solo son accesibles los" +
                " públicos o protegidos.");
        imprln("c) Para invocar al constructor de la clase madre" +
                " se utiliza \"super()\"");
        imprln("d) Un constructor de una clase hija no tiene por qué" +
                " llamar al de la clase madre");
        imprln("e) Si una clase hija llama al constructor de la clase" +
                " madre, aunque esta no tenga un constructor programado," +
                " utilizará el constructor por defecto de la misma.");
    }

    private static void ej4() {
        imprln("Coche -> Ford, Nissan, Opel");
        imprln("Producto -> Libro, Periférico, Prenda");
        imprln("Animal -> Perro, Lobo, Oveja");
    }

    private static void ej5() {
        Pelicula p = new Pelicula("El Diablo sobre Ruedas", "Steven Spielberg",
                91, 7.3);
        imprln("Imprimiendo objeto Película:");
        imprln(p);
    }

    private static void ej6() {
        imprln("Si una clase fuera hija de dos clases, habría ambigüedad" +
                " a la hora de llamar a \"super()\", \"@Override\", etc.");
    }

    private static void ej7() {
        // TODO Por hacer
    }

    private static void ej8() {
        // TODO Por hacer
    }

    private static void ej9() {
        // TODO Por hacer
    }

    private static void ej10() {
        // TODO Por hacer
    }

    private static void ej11() {
        // TODO Por hacer
    }

    private static void ej12() {
        // TODO Por hacer
    }

    private static void ej13() {
        // TODO Por hacer
    }
}