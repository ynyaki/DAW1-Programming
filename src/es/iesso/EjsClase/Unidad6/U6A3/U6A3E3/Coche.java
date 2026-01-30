package es.iesso.EjsClase.Unidad6.U6A3.U6A3E3;

public class Coche {

    private String modelo;
    private boolean motor;
    private final int nRuedas;
    private int nCilindros;

    public Coche(String modelo, int nCilindros) {
        this.modelo = modelo;
        this.nRuedas = 4;
        setNumCilindros(nCilindros);
        this.motor = checkMotor();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumCilindros() {
        return nCilindros;
    }

    public void setNumCilindros(int nCilindros) {
        this.nCilindros = Math.max(0, nCilindros);
        this.motor = checkMotor();
    }

    public boolean hayMotor() {
        return motor;
    }

    public int getNumRuedas() {
        return nRuedas;
    }

    public void arrancar() {
        System.out.println("Arrancando el coche...");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frenar() {
        System.out.println("Frenando el coche...");
    }

    private boolean checkMotor() {
        return (this.nCilindros > 0);
    }
}
