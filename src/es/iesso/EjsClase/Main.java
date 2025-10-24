package es.iesso.EjsClase;

import es.iesso.EjsClase.Unidad2.*;
import es.iesso.Impresora;

import java.util.Scanner;

public class Main extends U2A9 { // TODO cambiar a impresora

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // U2A9.mostrar(sc);
        imprFunc(posicionDeDigito(327828666, 3), "posicionDeDigito", "327828666, 3");
        sc.close();
    }
}