package es.iesso.EjsClase.Unidad6.U6A1.U6A1E12;

public class Vehiculo {

    public enum Tipo {
        BICICLETA,
        MOTO,
        COCHE,
        CAMION,
        BARCO,
        AVION,
    }

    protected Tipo tipo;
    protected int nRuedas;
    protected String marca;
    protected String modelo;
    protected double velocidad;

    protected Vehiculo(Tipo tipo, String marca, String modelo, int nRuedas) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.nRuedas = nRuedas;
    }

    protected void mover(double velocidad) {
        this.velocidad = velocidad;
    }

    protected void acelerar(double velocidad) {
        this.velocidad += velocidad;
    }

    protected void desacelerar(double velocidad) {
        this.velocidad -= velocidad;
    }

    protected void frenar() {
        this.velocidad = 0;
    }
}
