package es.iesso.EjsClase;

import es.iesso.EjsClase.Unidad2.*;
import es.iesso.EjsClase.Unidad3.U3A1.*;
import es.iesso.Impresora;

import java.util.Scanner;

public class Main extends Impresora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        U2A9.imprEj(4, sc);
        U2A9.imprEj(5, sc);
        U2A9.imprEj(6, sc);
        sc.close();
    }
}