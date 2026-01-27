package es.iesso.Entregar.U6A13;

public class Circulo {

    protected double radio;

    public Circulo(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        if(radio < 0)
            this.radio = 0;
        else
            this.radio = radio;
    }

    public double getPerimetro() {
        return (2 * Math.PI * this.radio);
    }

    public double getArea() {
        return calcAreaCirculo();
    }

    protected double calcAreaCirculo() {
        return (Math.PI * Math.pow(this.radio, 2));
    }
}
