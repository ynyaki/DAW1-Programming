package es.iesso.Entregar.U6A3E4;

import es.iesso.Impresora;

public class Rectangulo extends Forma {

    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura);
    }

    @Override
    public String toString() {
        return (super.getNombre()
                + " de base " + Impresora.format(base, 3)
                + " y altura " + Impresora.format(altura, 3) + "\n"
                + "Área: " + Impresora.format(getArea(), 3) + "\n");
    }
}