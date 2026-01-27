package es.iesso.EjsClase.Unidad6.U6A1.U6A1E5yE11;

public class VideoMusical extends Video {

    private String artistas;
    private String categoria;
    private String productora;

    public VideoMusical(String titulo, String artistas, String categoria,
                        String productora, int minutos, double precio) {
        super(titulo, minutos, precio);
        this.artistas = artistas;
        this.categoria = categoria;
        this.productora = productora;
    }

    @Override
    public String toString() {
        return titulo.toUpperCase() + "\n"
                + "Artista/s: " + artistas + "\n"
                + "Categoría: " + categoria + "\n"
                + "Duración: " + minutos + " min." + "\n"
                + "Precio: " + precio + " €.";
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }
}