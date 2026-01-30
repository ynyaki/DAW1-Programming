package es.iesso.Entregar.U6A3E4;

import es.iesso.Impresora;

public class Cilindro extends Forma {

    private double radio;
    private double altura;

    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double alto) {
        this.altura = alto;
    }

    @Override
    public double getArea() {
        return ((Math.PI * Math.pow(radio, 2) * 2)
                + (2 * Math.PI * radio * altura));
    }

    @Override
    public double getVolumen() {
        return (Math.PI * Math.pow(radio, 2) * altura);
    }

    @Override
    public String toString() {
        return (super.getNombre()
                + " de radio " + Impresora.format(radio, 3)
                + " y altura " + Impresora.format(altura, 3) + "\n"
                + "Área: " + Impresora.format(getArea(), 3) + "\n"
                + "Volumen: " + Impresora.format(getVolumen(), 3) + "\n");
    }
}