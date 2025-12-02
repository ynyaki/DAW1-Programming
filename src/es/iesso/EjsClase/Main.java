package es.iesso.EjsClase;

import es.iesso.EjsClase.Unidad4.U4A1.*;
import es.iesso.EjsClase.Unidad4.U4A2.*;
import es.iesso.EjsClase.Unidad4.U4A3.*;
import es.iesso.EjsClase.Unidad4.U4A4.*;
import es.iesso.EjsClase.Unidad4.U4A5.*;
import es.iesso.EjsClase.Unidad4.U4A6.*;

import es.iesso.Impresora;

import java.util.Scanner;

public class Main extends Impresora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        U4A3.mostrarAct(sc);
        lineas(2);
        U4A6.mostrarEj(3, sc);
        sc.close();
    }
}