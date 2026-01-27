package es.iesso.EjsClase.Unidad6.U6A2.U6A2E2;

public class Asiento {

    private String material;
    private double longitud;
    private double anchura;
    private double altura;
    private double angulo;
    private Sujecion sujecion;

    public Asiento(String material, double longitud, double anchura,
                   double altura, double angulo, Sujecion sujecion) {
        this.material = material;
        this.longitud = longitud;
        this.anchura = anchura;
        this.altura = altura;
        this.angulo = angulo;
        this.sujecion = sujecion;
    }

    public String getMaterial() {
        return material;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public double getAltura() {
        return altura;
    }

    public double getAngulo() {
        return angulo;
    }

    public Sujecion getSujecion() {
        return sujecion;
    }
}
