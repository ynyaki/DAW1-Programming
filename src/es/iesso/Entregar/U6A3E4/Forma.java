package es.iesso.Entregar.U6A3E4;

public class Forma {

    private String nombre;

    protected Forma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return 0;
    }

    public double getVolumen() {
        return 0;
    }

    @Override
    public String toString() {
        return nombre;
    }
}