package es.iesso.EjsClase.Unidad3.U3A1;

import es.iesso.Impresora;

import java.util.Scanner;

public abstract class U3A1 extends Impresora {

    // TODO Cambiar valores
    private static final int N_UD = 3;
    private static final int N_ACT = 1;
    private static final int N_EJS = 4;

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

    public static void mostrar(Scanner scIn) {
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
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        Coche c = new Coche(4, 5000, 20000, "estándar", "Sorento", "gris", "Kia");
        imprln("Modelo: " + c.getMarca() + " " + c.getModelo() + " (" + c.getColor() + ")");
        imprln("Precio: " + c.getPrecio());
        imprln("Peso: " + c.getPeso());
    }

    private static void ej2() {
        Calculadora calc = new Calculadora ();
        calc.setN1(5.0);
        calc.setN2(4);
        imprln(calc.getN1() + " + " + calc.getN2() + " = " + calc.suma());
        imprln(calc.getN1() + " - " + calc.getN2() + " = " + calc.resta());
        calc.setN1(5.25);
        calc.setN2(0);
        imprln(calc.getN1() + " * " + calc.getN2() + " = " + calc.multiplicacion());
        imprln(calc.getN1() + " / " + calc.getN2() + " = " + calc.division());
    }

    private static void ej3() {
        Persona p = new Persona();
        p.setNombre("");   // nombre is set to empty string
        p.setApellido("");    // apellido is set to empty string
        p.setEdad(10);
        imprln("Nombre completo: " + p.getNombreCompleto());
        imprln("¿Es adolescente? " + p.esAdolescente());
        p.setNombre("Patri");    // nombre is set to Patri
        p.setEdad(18);
        imprln("Nombre completo: " + p.getNombreCompleto());
        imprln("¿Es adolescente? " + p. esAdolescente ());
        p.setApellido("Guerrero"); // se establece apellido a Guerrero
        imprln("Nombre completo: " + p.getNombreCompleto());

        p.setNombre("");
        p.setApellido("Delgado");
        p.setEdad(20);
        imprln("Nombre completo: " + p.getNombreCompleto());
        imprln("Edad: " + p.getEdad());
        imprln("¿Adolescente? " + p.esAdolescente());
    }

    private static void ej4() {

        Pokemon p1 = new Pokemon("Meganium", Pokemon.Tipo.PLANTA, null, 3,
                (float) 1.8, "Verde", "Cuadrúpeda", "Bayleef", null, "JEDET",
                34, 24071, 10638, "Osada", "Espesura", "Gigadrenado",
                "Brillo mágico", "Terratemblor", "Pantalla de luz", 80, 82,
                100, 83, 100, 80, 4, 1, 2, 1, 2, 1, true, Pokemon.Tipo.PLANTA,
                Pokemon.Tipo.HADA, "Clorofila",0, 10, 15, 60, 15, 0);

        imprar(p1.mostrarInfo().toArray());
        imprln("\n---\n");
        imprar(p1.mostrarInfoMega().toArray());
        imprln("\n---\n");
        p1.subirNiveles(66);
        imprar(p1.mostrarInfo().toArray());
        imprln("\n---\n");
        imprar(p1.mostrarInfoMega().toArray());
    }
}