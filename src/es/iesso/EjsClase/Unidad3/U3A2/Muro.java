package es.iesso.EjsClase.Unidad3.U3A2;

public class Muro {

    private double ancho;
    private double alto;

    public Muro(double ancho, double alto) {
        this.ancho = corregirMedida(ancho);
        this.alto = corregirMedida(alto);
    }

    public Muro() {
        this(0, 0);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = corregirMedida(ancho);
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = corregirMedida(alto);
    }

    public double getArea() {
        return ancho * alto;
    }

    private static double corregirMedida(double m) {
        if(m < 0)
            return 0;
        else
            return m;
    }
}
