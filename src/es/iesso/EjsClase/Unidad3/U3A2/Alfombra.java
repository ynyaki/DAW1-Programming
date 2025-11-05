package es.iesso.EjsClase.Unidad3.U3A2;

public class Alfombra {

    private double coste;

    public Alfombra(double coste) {
        this.coste = coste;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = corregirPositivo(coste);
    }

    private static double corregirPositivo(double n) {
        if(n < 0)
            return 0;
        else
            return n;
    }
}