package es.iesso.EjsClase.Unidad3.U3APractica.JuegoChinos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        while(seguir)
            seguir = MenuChinos.ejecutar(sc);
        sc.close();
    }
}