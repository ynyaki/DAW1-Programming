package es.iesso.Otros.actividad7;

import java.util.Scanner;

/**
 * Actividad 7 de Programación, por Iñaki Bazán Fernández, 1ºJ (DAW),
 * IES Severo Ochoa, Elche
 */
public class Main {

    private static Scanner sc;
    private static boolean isError = false;
    private static int nComandos = 0;
    private static int nDec = 3;

    private static final String infoNEnt = " (núm. enteros)";
    private static final String infoNDec = " (núm. decimales)";
    private static final String mensNEnt = " (solo núm. enteros)";
    private static final String mensNDec = " (decimales en formato \"0,0\")";
    private static final String errorVEntrada = "Valor de entrada no permitido (el resultado será erróneo)";

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        boolean salirPrograma = false;

        System.out.println();
        System.out.println("PROGRAMA DE CÁLCULO DE PERÍMETROS Y ÁREAS");
        System.out.println("-----------------------------------------");

        while(!salirPrograma)
            salirPrograma = bucleMenuPrincipal();
    }

    private static boolean bucleMenuPrincipal() {

        boolean salirPrograma = false;
        String opcionTxt;
        int opcion = -1;

        if(nComandos > 0 && !isError) {
            System.out.print("(Pulsa Enter para continuar...) ");
            sc.nextLine();
        }
        isError = false;

        System.out.println();
        System.out.println("Escriba el n.º de la opción deseada:");
        System.out.println("1. Área de un cuadrado" + infoNEnt);
        System.out.println("2. Área de un rectángulo" + infoNEnt);
        System.out.println("3. Área de un triángulo" + infoNDec);
        System.out.println("4. Área de un círculo" + infoNDec);
        System.out.println("5. Perímetro de un círculo" + infoNDec);
        System.out.println("0. Salir del programa");
        System.out.print("Ejecutar: ");

        try {
            opcionTxt = sc.next();
            opcion = Integer.parseInt(opcionTxt);
            System.out.println();
        } catch (Exception e) {
            isError = true;
            System.out.println();
            System.out.println("Valor de entrada no permitido");
        }
        sc.nextLine();

        switch(opcion) {
            case 0:
                salirPrograma = true;
                System.out.println("Saliendo del programa...");
                break;
            case 1:
                pedirYCalcACuad();
                break;
            case 2:
                pedirYCalcARect();
                break;
            case 3:
                pedirYCalcATri();
                break;
            case 4:
                pedirYCalcACirc();
                break;
            case 5:
                pedirYCalcPCirc();
                break;
            default:
                System.out.println("Comando no reconocido");
                isError = true;
                break;
        }
        nComandos++;
        return salirPrograma;
    }

    // Métodos para la interfaz de cálculo de áreas y perímetros

    private static void pedirYCalcACuad() {
        long lado;
        long area;
        System.out.println("Calcular el área de un cuadrado" + mensNEnt);
        System.out.print("Lado: ");
        lado = pedirInt();
        area = areaCuadrado(lado);
        System.out.println("Área del cuadrado = " + area);

    }

    private static void pedirYCalcARect() {
        long base;
        long altura;
        long area;
        System.out.println("Calcular el área de un rectángulo" + mensNEnt);
        System.out.print("Base: ");
        base = pedirInt();
        System.out.print("Altura: ");
        altura = pedirInt();
        area = areaRectangulo(base, altura);
        System.out.println("Área del rectángulo = " + area);
    }

    private static void pedirYCalcATri() {
        double base;
        double altura;
        double area;
        System.out.println("Calcular el área de un triángulo" + mensNDec);
        System.out.print("Base: ");
        base = pedirDouble();
        System.out.print("Altura: ");
        altura = pedirDouble();
        area = roundN(areaTriangulo(base, altura));
        System.out.println("Área del triángulo = " + area);
    }

    private static void pedirYCalcACirc() {
        double radio;
        double area;
        System.out.println("Calcular el área de un círculo" + mensNDec);
        System.out.print("Radio: ");
        radio = pedirDouble();
        area = roundN(areaCirculo(radio));
        System.out.println("Área del círculo = " + area);
    }

    private static void pedirYCalcPCirc() {
        double radio;
        double perimetro;
        System.out.println("Calcular el perímetro de un círculo" + mensNDec);
        System.out.print("Radio: ");
        radio = pedirDouble();
        perimetro = roundN(perimetroCirculo(radio));
        System.out.println("Perímetro del círculo = " + perimetro);
    }

    // Métodos para el cálculo de áreas y perímetros

    public static long areaCuadrado(long lado) {
        return (lado * lado);
    }

    public static long areaRectangulo(long base, long altura) {
        return (base * altura);
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura / 2);
    }

    public static double areaCirculo(double radio) {
        return (Math.PI * radio * radio);
    }

    public static double perimetroCirculo(double radio) {
        return (2 * Math.PI * radio);
    }

    private static long pedirInt() {
        long i;
        double d;
        try {
            d = sc.nextDouble();

            // Módulo de n
            if(d < 0)
                d *= -1;

            i = (long) d;
            if(d != i) {
                isError = true;
                throw new Exception(errorVEntrada);
            }

        } catch (Exception e) {
            isError = true;
            System.out.println(errorVEntrada);
            i = 0;
        }
        sc.nextLine();
        return i;
    }

    private static double pedirDouble() {
        double n;
        try {
            n = sc.nextDouble();

            // Módulo de n
            if(n < 0)
                n *= -1;

        } catch (Exception e) {
            isError = true;
            System.out.println(errorVEntrada);
            n = 0;
        }
        sc.nextLine();
        return n;
    }

    private static double roundN(double n) {
        return Math.round(n * Math.pow(10, nDec)) / Math.pow(10, nDec);
    }
}