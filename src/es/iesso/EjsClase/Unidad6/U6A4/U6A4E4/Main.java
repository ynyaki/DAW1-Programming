package es.iesso.EjsClase.Unidad6.U6A4.U6A4E4;

public class Main {

    static void main() {
        Comida c = new Comida("Burger", 5, 500);
        Juguete j = new Juguete("Monopoly", 20, 0);
        Libro l = new Libro("El Capital", 60, "Karl Marx, Friedrich Engels");

        Bien[] b = new Bien[3];
        b[0] = c;
        b[1] = j;
        b[2] = l;

        Imponible[] i = new Imponible[2];
        i[0] = j;
        i[1] = l;

        Libro l2 = (Libro) i[1];

        System.out.println();
        System.out.println();
        System.out.println(c);
        System.out.println(j);
        System.out.println(l);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(l2.getAutor());
        System.out.println();
    }
}