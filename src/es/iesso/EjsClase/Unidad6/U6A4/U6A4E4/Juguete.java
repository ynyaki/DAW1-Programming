package es.iesso.EjsClase.Unidad6.U6A4.U6A4E4;

import static es.iesso.Impresora.format;

public class Juguete extends Bien implements Imponible {

    protected int edadMinima;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    @Override
    public double calcularImpuesto() {
        return this.precio * Imponible.tasa;
    }

    @Override
    public String toString() {
        double precioReal = precio * calcularImpuesto();
        return "Juguete: " + descripcion + "\n"
                + "Edad mínima: " + edadMinima + " años" + "\n"
                + "Precio: " + format(precioReal, 2) + " €" + "\n";
    }
}
