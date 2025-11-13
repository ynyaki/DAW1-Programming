package es.iesso.EjsClase.Unidad3.U3APractica.JuegoChinos;

public class Jugador {

    private static int nJugs = 0;

    private final boolean esCPU;
    private final int nJug;

    private String nombre;
    int monedas;
    int apuesta;
    int puntos;

    public Jugador() {
        nJugs++;
        this.esCPU = true;
        this.nombre = "CPU " + nJugs;
        this.nJug = nJugs;
        this.monedas = 0;
        this.apuesta = 0;
        this.puntos = 0;
    }

    public Jugador(boolean esCPU, String nombre, int nJug) {
        nJugs++;
        this.esCPU = esCPU;
        this.nombre = nombre;
        this.nJug = nJug;
        this.monedas = 0;
        this.apuesta = 0;
        this.puntos = 0;
    }

    public boolean isEsCPU() {
        return esCPU;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank())
            resetNombre();
        else
            this.nombre = nombre;
    }

    public int getNJug() {
        return nJug;
    }

    public int getMonedas() {
        return monedas;
    }

    public int getApuesta() {
        return apuesta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void resetNombre() {
        nJugs++;
        this.nombre = "Jugador " + nJugs;
    }

    public void resetJugador() {
        this.monedas = 0;
        this.apuesta = 0;
        this.puntos = 0;
    }

    public void apostar(int monedas, int apuesta) {
        this.monedas = monedas;
        this.apuesta = apuesta;
    }

    public void ganarRonda() {
        this.puntos++;
    }
}