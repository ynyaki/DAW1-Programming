package es.iesso.Otros.PrimeraEv;

import java.util.Scanner;

/**
 * Clase para el examen de la primera evaluación de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public class Menu {

    private static Scanner sc;

    public static void ejecutar(Scanner scanner) {
        boolean seguir = true;
        String input;
        sc = scanner;
        imprTitulo();
        while(seguir) {
            input = pedirInput();
            seguir = validarYCrearIPv4(input);
        }
    }

    private static boolean validarYCrearIPv4(String input) {
        boolean seguir;
        if(IPv4.esIPv4valida(input)) {
            System.out.println(new IPv4(input).getClaseString());
            seguir = true;
        }
        else if(input.trim().equalsIgnoreCase("EXIT")) {
            System.out.println();
            System.out.println("Saliendo del programa...");
            seguir = false;
        }
        else {
            System.out.println("Inválida");
            seguir = true;
        }
        System.out.println();
        return seguir;
    }

    private static String pedirInput() {
        String input;
        System.out.print("Introduzca la dirección de red (XXX.XXX.XXX.XXX/YY)" +
                " (\"EXIT\" para salir): ");
        input = sc.next();
        sc.nextLine();
        return input.trim();
    }

    private static void imprTitulo() {
        System.out.println();
        System.out.println();
        System.out.println("VALIDADOR DE DIRECCIONES IPV4");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("  Por Iñaki Bazán");
        System.out.println("  ---------------");
        System.out.println();
        System.out.println();
    }
}