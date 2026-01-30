package es.iesso.Entregar.U6A3E4;

import es.iesso.Impresora;

public class Esfera extends Forma {

    private double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return (4 * Math.PI * Math.pow(radio, 2));
    }

    @Override
    public double getVolumen() {
        return ((double) (4 / 3) * Math.PI * Math.pow(radio, 3));
    }

    @Override
    public String toString() {
        return (super.getNombre() + " de radio "
                + Impresora.format(radio, 3) + "\n"
                + "Área: " + Impresora.format(getArea(), 3) + "\n"
                + "Volumen: " + Impresora.format(getVolumen(), 3) + "\n");
    }
}