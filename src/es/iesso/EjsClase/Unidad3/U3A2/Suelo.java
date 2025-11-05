package es.iesso.EjsClase.Unidad3.U3A2;

public class Suelo {

    private double ancho;
    private double largo;

    public Suelo(double ancho, double largo) {
        this.ancho = corregirMedida(ancho);
        this.largo = corregirMedida(largo);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getArea() {
        return ancho * largo;
    }

    private static double corregirMedida(double m) {
        if(m < 0)
            return 0;
        else
            return m;
    }
}