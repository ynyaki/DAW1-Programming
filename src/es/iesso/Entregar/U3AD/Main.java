package es.iesso.Entregar.U3AD;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final int ERROR = -1;
    private static final int SALIR = 0;
    private static final Scanner sc = new Scanner(System.in)

    private static boolean seguir = true;
    private static boolean hayErrInput = false;

    public static void main(String[] args) {
        String com;
        mostrarTitulo();
        while(seguir) {
            com = pedirDNI();
            if(com.equalsIgnoreCase("S"))
                seguir = false;
            else
                validarCalcularDNI(com);
        }
    }

    private static void mostrarTitulo() {
        System.out.println();
        System.out.println("CALCULADORA/VALIDADOR DE DNI");
        System.out.println("----------------------------");
        System.out.println();
    }

    private static String pedirDNI() {
        String dni;
        System.out.print("Introduzca un DNI (con o sin letra): ");
        dni = scanDNI();
        if(!hayErrInput)
            System.out.println();
        return dni;
    }

    private static String scanDNI() {
        String dni = null;
        hayErrInput = false;
        dni = sc.next();
        if(!checkDNIsinLetra(dni) && !checkDNIconLetra(dni))
            hayErrInput = true;
        sc.nextLine();
        return dni;
    }

    private static boolean checkDNIsinLetra(String dni) {
        if(dni.length() != 8)
            return false;
        try {
            Integer.parseInt(dni);
            return true;
        } catch(NumberFormatException nFE) {
            return false;
        }
    }

    private static boolean checkDNIconLetra(String dni) {
        char c = dni.charAt(dni.length() - 1);
        if(checkDNIsinLetra(dni.substring(0, dni.length() - 1)))
            return false;
    }
}
