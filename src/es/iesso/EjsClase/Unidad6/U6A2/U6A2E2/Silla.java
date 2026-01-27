package es.iesso.EjsClase.Unidad6.U6A2.U6A2E2;

public class Silla {

    private String modelo;
    private String marca;
    private Asiento asiento;
    private Sujecion sujecion;

    public Silla(String modelo, String marca, Asiento asiento,
                 Sujecion sujecion) {
        this.modelo = modelo;
        this.marca = marca;
        this.asiento = asiento;
        this.sujecion = sujecion;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public Sujecion getSujecion() {
        return sujecion;
    }

    public Rueda getRueda(int nRueda) {
        return this.sujecion.getRueda(nRueda);
    }

    public double getAnguloAsiento() {
        return asiento.getAngulo();
    }
}
