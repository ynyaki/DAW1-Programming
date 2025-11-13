package es.iesso.EjsClase.Unidad3.U3APractica.JuegoChinos;

import java.util.Scanner;

public class PartidaChinos {

    private final int nRondas;
    private final Jugador j1;
    private final Jugador j2;

    private Scanner sc;

    public PartidaChinos(int nRondas, Jugador j1, Jugador j2, Scanner sc) {
        this.nRondas = nRondas;
        this.j1 = j1;
        this.j2 = j2;
        this.sc = sc;
    }

    public int getNRondas() {
        return nRondas;
    }

    public Jugador getJ1() {
        return j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public Scanner getScanner() {
        return sc;
    }

    public void setScanner(Scanner sc) {
        this.sc = sc;
    }

    public void jugarPartida() {
        for(int i = 1; i < nRondas; i++)
            jugarRonda();
        imprResultado();
    }

    private static void pedirApuesta(Jugador j) {
        // TODO
    }

    private void jugarRonda() {
        // TODO
    }

    private void imprRonda() {
        // TODO
    }

    private void imprResultado() {
        // TODO
    }
}