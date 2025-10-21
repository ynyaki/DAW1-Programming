package es.iesso.Entregar.U2A8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 11 de la Actividad 8 de la Unidad 2 de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public abstract class Main {

    private static final int ERROR = -1;
    private static final int SALIR = 0;
    private static final String OP_VALIDA = "[Opción válida]";

    private static final Scanner sc = new Scanner(System.in);
    private static boolean hayInputError = false;
    private static boolean seguir = true;

    public static void main(String[] args) {
        int opcion;
        mostrarTitulo();
        while(seguir) {
            mostrarMenu();
            opcion = introOpcion();
            seguir = ejecOpcion(opcion);
        }
        sc.close();
    }

    private static void mostrarTitulo() {
        System.out.println();
        System.out.println("PROGRAMA DE OPCIONES");
        System.out.println("--------------------");
        System.out.println();
    }

    private static void mostrarMenu() {
        System.out.println("Opciones disponibles:");
        System.out.println("0. Salir del programa");
        System.out.println("1. Rosa");
        System.out.println("2. Azul");
        System.out.println("3. Verde");
        System.out.println("4. Amarillo");
        System.out.println();
        System.out.print("Introduzca su opción: ");
    }

    private static int introOpcion() {
        int opcion = ERROR;
        hayInputError = false;
        try {
            opcion = sc.nextInt();
        } catch(InputMismatchException iME) {
            hayInputError = true;
            System.out.println();
            System.out.println("Error: el valor introducido no es un número entero");
        }
        sc.nextLine();
        System.out.println();
        return opcion;
    }

    private static boolean ejecOpcion(int opcion) {
        switch (opcion) {
            case SALIR:
                System.out.println("Saliendo del programa...");
                return false;
            case 1:
                System.out.println(OP_VALIDA);
                break;
            case 2:
                System.out.println(OP_VALIDA);
                break;
            case 3:
                System.out.println(OP_VALIDA);
                break;
            case 4:
                System.out.println(OP_VALIDA);
                break;
            default:
                if(!hayInputError)
                    System.out.println("Error: ninguna opción válida seleccionada");
        }
        if(!hayInputError)
            System.out.println();
        System.out.print("(Pulse Entrar para continuar...) ");
        sc.nextLine();
        System.out.println();
        return true;
    }
}