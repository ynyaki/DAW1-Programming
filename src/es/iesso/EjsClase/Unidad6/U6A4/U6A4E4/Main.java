package es.iesso.EjsClase.Unidad6.U6A4.U6A4E4;

public class Main {

    static void main() {
        Comida c = new Comida("Burger", 5, 500);
        Juguete j = new Juguete("Monopoly", 20, 0);
        Libro l = new Libro("El Capital", 60, "Karl Marx y Friedrich Engels");

        System.out.println();
        System.out.println();
        System.out.println(c);
        System.out.println(j);
        System.out.println(l);
    }
}