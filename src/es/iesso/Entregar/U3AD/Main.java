package es.iesso.Entregar.U3AD;

import java.util.Scanner;

public class Main {

    // private static final String
    private static final String TXT_PEDIR_INPUT = "Introduzca un DNI válido";
    private static final String TXT_CON_SIN_LETRA = " (con o sin letra)";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }

    private static String pedirInput(Scanner sc) {
        String input;
        System.out.print(TXT_PEDIR_INPUT + ": ");
        input = sc.next();
        sc.nextLine();
        return input;
    }

    private static boolean esDNIsinLetra(String dni) {
        boolean esValido = true;
        if(dni.length() == 8) {
            try {
                Integer.parseInt(dni);
            } catch(NumberFormatException nFE) {
                esValido = false;
            }
        } else
            esValido = false;
        return esValido;
    }

    private static boolean esDNIconLetra(String dni) {
        boolean esValido = true;
        String dniNum;
        char dniCh;
        if(dni.length() == 9) {
            dniNum = dni.substring(0, 8);
            dniCh = dni.charAt(8);
            if(!esDNIsinLetra(dniNum) || !Character.isLetter(dniCh))
                esValido = false;
        } else
            esValido = false;
        return esValido;
    }

    private static char getLetraDNI(String dni) {
        int dniInt = Integer.parseInt(dni);
        int r = dniInt % 23;
        return switch(r) {
            case 0 -> 'T';
            case 1 -> 'R';
            case 2 -> 'W';
            case 3 -> 'A';
            case 4 -> 'G';
            case 5 -> 'M';
            case 6 -> 'Y';
            case 7 -> 'F';
            case 8 -> 'P';
            case 9 -> 'D';
            case 10 -> 'X';
            case 11 -> 'B';
            case 12 -> 'N';
            case 13 -> 'J';
            case 14 -> 'Z';
            case 15 -> 'S';
            case 16 -> 'Q';
            case 17 -> 'V';
            case 18 -> 'H';
            case 19 -> 'L';
            case 20 -> 'C';
            case 21 -> 'K';
            case 22 -> 'E';
            default -> '\n';
        };
    }
}
