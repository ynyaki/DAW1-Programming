package es.iesso.EjsClase.Unidad6.U6A5.U6A5E456;

public class Triangulo extends Forma {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(3);
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
    public double getPerimetro() {
        return (base + altura + getHipotenusa());
    }

    @Override
    public double getArea() {
        return ((base * altura) / 2);
    }

    public double getHipotenusa() {
        return ((Math.pow(base, 2) + Math.pow(altura, 2)) / 2);
    }
}
