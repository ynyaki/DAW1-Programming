package es.iesso.EjsClase;

import es.iesso.EjsClase.Unidad4.U4A1.*;
import es.iesso.EjsClase.Unidad4.U4A2.*;

import es.iesso.Impresora;

import java.util.Scanner;

public class Main extends Impresora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        U4A2.mostrarAct(sc);
//        for(int i = 8; i <= U4A2.getNEjs(); i++)
//            U4A2.mostrarEj(i, sc);
        imprln(roundTxt2(6.1213128, 3));
        imprln(roundTxt2(1.20000, 3));
        imprln(roundTxt2(1.206, 2));
        sc.close();
    }
}