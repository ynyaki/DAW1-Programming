package es.iesso.EjsClase.Unidad6.U6A4.U6A4E4;

import static es.iesso.Impresora.format;

public class Libro extends Bien implements Imponible {

    protected String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    @Override
    public double calcularImpuesto() {
        return this.precio * Imponible.tasa;
    }

    @Override
    public String toString() {
        double precioReal = precio * calcularImpuesto();
        return "Juguete: " + descripcion + "\n"
                + "Autor: " + autor + "\n"
                + "Precio: " + format(precioReal, 2) + " €" + "\n";
    }
}
