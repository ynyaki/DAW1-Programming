package es.iesso.Entregar.U4A7E6;

/**
 * Clase EntradaTelefono perteneciente a la entrega del
 * Ejercicio 6 de la Actividad 7 de la Unidad 4 de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public class EntradaTelefono {
    private int numero;
    private String nombre;

    public EntradaTelefono(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
}
