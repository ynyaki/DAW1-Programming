package es.iesso.Entregar.U7A1;

public class Contacto {

    private String nombre;
    private String numero;

    private Contacto(String nombre, String numero) {
        this.nombre = nombre.trim();
        this.numero = numero.trim();
    }

    public static Contacto crearContacto(String nombre, String numero) {
        return new Contacto(nombre, numero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero.trim();
    }

    public boolean esIgual(Contacto c) {
        return (this.nombre.equals(c.nombre) || this.numero.equals(c.numero));
    }

    public boolean tieneNombre(String nombre) {
        return (this.nombre.equals(nombre));
    }
}
