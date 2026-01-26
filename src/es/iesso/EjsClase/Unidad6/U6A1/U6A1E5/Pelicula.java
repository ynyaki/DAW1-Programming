package es.iesso.EjsClase.Unidad6.U6A1.U6A1E5;

public class Pelicula extends Video {

    protected String director;
    protected double valoracion;

    public Pelicula(String titulo, String director, int minutos,
                    double valoracion) {
        this.titulo = titulo;
        this.director = director;
        this.minutos = minutos;
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return titulo.toUpperCase() + "\n"
                + "Director: " + director + "\n"
                + "Duración: " + minutos + " min." + "\n"
                + "Valoración: " + valoracion;
    }
}