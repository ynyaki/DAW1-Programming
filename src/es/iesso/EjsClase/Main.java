package es.iesso.EjsClase;

import es.iesso.EjsClase.Ficheros.FEjercicios1.UFA1;
import es.iesso.Impresora;

import java.util.Scanner;

public class Main extends Impresora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lineas(2);
        UFA1.mostrarEj(8, sc);
        sc.close();
    }
}
