package es.iesso.Otros.PracticaExamen1.Chinos;

public class Jugador {

    private static int nCPU = 0;
    private static int nJug = 0;

    private final boolean esCPU;

    private String nombre;
    private int monedas;
    private int apuesta;
    private int puntos;

    public Jugador(boolean esCPU) {
        this.esCPU = esCPU;
        this.nombre = nombreGenerico(esCPU);
        this.monedas = 0;
        this.apuesta = 0;
        this.puntos = 0;
    }

    public Jugador(boolean esCPU, String nombre) {
        this.esCPU = esCPU;
        this.nombre = checkNombre(nombre, this.esCPU);
        this.monedas = 0;
        this.apuesta = 0;
        this.puntos = 0;
    }

    private static String checkNombre(String nombre, boolean esCPU) {
        if(nombre == null || nombre.isBlank())
            return nombreGenerico(esCPU);
        else
            return nombre;
    }

    private static String nombreGenerico(boolean esCPU) {
        String nomGen;
        if(esCPU) {
            nCPU++;
            nomGen = "CPU " + nCPU;
        } else {
            nJug++;
            nomGen = "Jugador " + nJug;
        }
        return nomGen;
    }

    public boolean esCPU() {
        return esCPU;
    }

    public String getNombre() {
        return nombre;
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

    public void setNombre(String nombre) {
        this.nombre = checkNombre(nombre, this.esCPU);
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}