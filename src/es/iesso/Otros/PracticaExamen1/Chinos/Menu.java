package es.iesso.Otros.PracticaExamen1.Chinos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private Jugador j1;
    private Jugador j2;
    private int nRondas;
    private int ronda;
    private int turno;

    public Menu(Scanner sc, Jugador j1, Jugador j2, int nRondas) {
        this.sc = sc;
        this.j1 = j1;
        this.j2 = j2;
        this.nRondas = nRondas;
        this.ronda = 0;
    }

    public Scanner getScanner() {
        return sc;
    }

    public Jugador getJ1() {
        return j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public int getNRondas() {
        return nRondas;
    }

    public int getRonda() {
        return ronda;
    }

    public void setScanner(Scanner sc) {
        this.sc = sc;
    }

    private void jugarRonda() {
        int ganador;
        ronda++;
        getInput(j1);
        getInput(j2);
        ganador = calcularGanador();
    }

    private void getInput(Jugador j) {
        int monedas;
        int apuesta;
        if(j.esCPU()) {
            monedas = (int) (Math.random() * 6);
            apuesta = monedas + (int) (Math.random() * 6);
        } else {
            System.out.println("Turno de " + j.getNombre());
            monedas = pedirNat("Elija el nº de monedas (0 - 6)");
            apuesta = pedirNat("Elija su apuesta total");
        }
        j.setMonedas(monedas);
        j.setApuesta(apuesta);
    }

    private int pedirNat(String mensaje) {
        int n = -1;
        while(n < 0) {
            System.out.print(mensaje + ": ");
            try {
                n = sc.nextInt();
            } catch(InputMismatchException iME) {
                System.out.println("Error: número natural no válido");
                n = -1;
            }
        }
        return n;
    }

    private int calcularGanador() {
        return 0;
    }

    private void apuntarGanador() {
        //
    }
}