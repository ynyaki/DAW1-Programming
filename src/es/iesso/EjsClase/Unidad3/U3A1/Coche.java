package es.iesso.EjsClase.Unidad3.U3A1;

public class Coche {
    private int puertas;
    private int peso;
    private int precio;
    private String motor;
    private String modelo;
    private String color;
    private String marca;

    public Coche(int puertas, int peso, int precio, String motor, String modelo, String color, String marca) {
        this.puertas = puertas;
        this.peso = peso;
        this.precio = precio;
        this.motor = motor;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}