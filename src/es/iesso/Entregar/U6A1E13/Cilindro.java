package es.iesso.Entregar.U6A1E13;

public class Cilindro extends Circulo {

    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 0)
            this.altura = 0;
        else
            this.altura = altura;
    }

    @Override
    public double getArea() {
        return (super.getArea() * 2) + (getPerimetro() * altura);
    }

    public double getAreaCirculo() {
        return super.getArea();
    }

    public double getVolumen() {
        return (super.getArea() * altura);
    }
}