package es.iesso.EjsClase;

import es.iesso.EjsClase.Unidad2.*;
import es.iesso.EjsClase.Unidad3.U3A1.*;
import es.iesso.Impresora;

import java.util.Scanner;

public class Main extends Impresora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        U3A1.mostrar(sc);
        sc.close();
    }
}