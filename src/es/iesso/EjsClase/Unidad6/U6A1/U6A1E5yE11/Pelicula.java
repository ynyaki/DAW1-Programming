package es.iesso.EjsClase.Unidad6.U6A1.U6A1E5yE11;

public class Pelicula extends Video {

    protected String director;
    protected double valoracion;

    public Pelicula(String titulo, String director, int minutos,
                    double valoracion, double precio) {
        super(titulo, minutos, precio);
        this.director = director;
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return titulo.toUpperCase() + "\n"
                + "Director: " + director + "\n"
                + "Duración: " + minutos + " min." + "\n"
                + "Valoración: " + valoracion + "\n"
                + "Precio: " + precio + " €.";
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
}