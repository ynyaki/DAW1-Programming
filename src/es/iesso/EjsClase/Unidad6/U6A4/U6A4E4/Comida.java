package es.iesso.EjsClase.Unidad6.U6A4.U6A4E4;

import static es.iesso.Impresora.format;

public class Comida extends Bien {

    protected double calorias;

    public Comida(String descripcion, double precio, double calorias) {
        super(descripcion, precio);
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Libro: " + descripcion + "\n"
                + "Valor energético: " + format(calorias, 1) + " kcal" + "\n"
                + "Precio: " + format(precio, 2) + " €" + "\n";
    }
}
