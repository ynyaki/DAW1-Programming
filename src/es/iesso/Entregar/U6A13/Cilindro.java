package es.iesso.Entregar.U6A13;

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
        return ((calcAreaCirculo() * 2) + (getPerimetro() * altura));
    }

    public double getAreaCirculo() {
        return calcAreaCirculo();
    }

    public double getVolumen() {
        return (calcAreaCirculo() * altura);
    }
}