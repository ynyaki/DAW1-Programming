package es.iesso.EjsClase.Unidad3.U3A2;

public class Calculadora {

    private Suelo s;
    private Alfombra a;

    public Calculadora(double ancho, double alto, double coste) {
        this.s = new Suelo(ancho, alto);
        this.a = new Alfombra(coste);
    }

    public double getCosteTotal() {
        return s.getArea() * a.getCoste();
    }
}