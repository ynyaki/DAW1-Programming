package es.iesso.EjsClase.Unidad6.U6A5.U6A5E456;

public class Rectangulo extends Forma implements
        Redimensionable, Comparable<Rectangulo> {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super(4);
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
        return (base * 2 + altura * 2);
    }

    @Override
    public double getArea() {
        return (base * altura);
    }

    @Override
    public String toString() {
        return ("Rectángulo: perímetro " + this.getPerimetro()
                + ", área " + this.getArea() + ".");
    }

    @Override
    public void redimensionar(int x) {
        this.base *= x;
        this.altura *= x;
    }

    @Override
    public int compareTo(Rectangulo r) {
        return Double.compare(this.getArea(), r.getArea());
    }
}
