package es.iesso.EjsClase.Unidad6.U6A1.U6A1E5yE11;

public class Video {

    protected String titulo;
    protected int minutos;
    protected double precio;

    public Video(String titulo, int minutos, double precio) {
        this.titulo = titulo;
        this.minutos = minutos;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return titulo.toUpperCase() + "\n"
                + "Duración: " + minutos + " min."
                + "Precio: " + precio + " €.";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}