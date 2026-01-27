package es.iesso.EjsClase.Unidad6.U6A2.U6A2E1;

public class Lampara {

    private String estilo;
    private boolean bateria;
    private int calificacion;

    public Lampara(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }

    public void encender() {
        bateria = true;
        System.out.println("Se ha encendido la lámpara.");
    }

    public String getEstilo() {
        return estilo;
    }

    public boolean hayBateria() {
        return bateria;
    }

    public int getCalificacion() {
        return calificacion;
    }
}