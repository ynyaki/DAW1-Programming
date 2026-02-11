package es.iesso.EjsClase;

import es.iesso.EjsClase.Unidad6.U6A1.*;
import es.iesso.EjsClase.Unidad6.U6A2.*;
import es.iesso.EjsClase.Unidad6.U6A3.*;
import es.iesso.EjsClase.Unidad6.U6A4.*;
import es.iesso.EjsClase.Unidad6.U6A5.*;

import es.iesso.Impresora;

import java.util.Scanner;

public class Main extends Impresora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lineas(2);
        U6A5.mostrarEj(7, sc); // FIXME Cambiar cuando esté corregido
        sc.close();
    }
}
