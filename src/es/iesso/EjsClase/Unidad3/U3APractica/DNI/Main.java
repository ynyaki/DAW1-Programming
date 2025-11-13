package es.iesso.EjsClase.Unidad3.U3APractica.DNI;

import java.util.Scanner;

public class Main {

    private static final String TITULO = "VALIDADORA/CALCULADORA DE DNI";
    private static final String SUBTTL = "-----------------------------";
    private static final String SEP = ": ";
    private static final String TXT_PEDIR_INPUT = "Introduzca un DNI válido";
    private static final String TXT_IN_LETRA = " (con o sin letra)";
    private static final String TXT_IN_SALIR = " (\"S\" para salir)";
    private static final String TXT_ERR = "Error" + SEP;
    private static final String ERR_DNI = "DNI inválido";
    private static final String TXT_DNI_VAL = "Un DNI válido está compuesto" +
            " de ocho números y una letra";
    private static final String TXT_LETRA_OPC = "(introducir la letra es opcional)";
    private static final String TXT_DNI_LETRA = "El DNI con letra es ";
    private static final String TXT_LETRA_CORR = "La letra del DNI es correcta";
    private static final String TXT_DNI_VAL_ES = "El DNI válido es ";
    private static final String ERR_LETRA = "Letra del DNI incorrecta";
    private static final String COM_SALIR = "S";
    private static final String TXT_FIN = "(Terminando programa...)";

    public static void main(String[] args) {
        boolean seguir;
        seguir = true;
        Scanner sc = new Scanner(System.in);
        mostrarTitulo();
        while(seguir) {
            seguir = ejecPrograma(sc);
        }
        sc.close();
    }

    private static void mostrarTitulo() {
        System.out.println();
        System.out.println();
        System.out.println(TITULO);
        System.out.println(SUBTTL);
        System.out.println();
    }

    private static boolean ejecPrograma(Scanner sc) {

        boolean seguir;
        String dni;
        String dniNum;
        char dniCh;

        seguir = true;
        dni = pedirInput(sc);

        // Caso: DNI sin letra
        if(esDNIsinLetra(dni)) {
            dniNum = dni.substring(0, 8);
            System.out.println(TXT_DNI_LETRA + dniNum + getLetraDNI(dniNum));

        // Caso: DNI con letra
        } else if(esDNIconLetra(dni)) {
            dniNum = dni.substring(0, 8);
            dniCh = dni.charAt(8);

            // Caso: DNI con letra correcta
            if(dniCh == getLetraDNI(dniNum)) {
                System.out.println(TXT_LETRA_CORR);

            // Caso: DNI con letra incorrecta
            } else {
                System.out.println(ERR_LETRA);
                System.out.println(TXT_DNI_VAL_ES + dniNum + getLetraDNI(dniNum));
            }

        // Caso: salir del programa
        } else if(dni.equalsIgnoreCase(COM_SALIR)) {
            seguir = false;
            System.out.println(TXT_FIN);

        // Caso: error de input
        } else {
            System.out.println(TXT_ERR + ERR_DNI);
            System.out.println(TXT_DNI_VAL);
            System.out.println(TXT_LETRA_OPC);
        }

        System.out.println();
        return seguir;
    }

    private static String pedirInput(Scanner sc) {
        String input;
        System.out.print(TXT_PEDIR_INPUT + TXT_IN_LETRA + TXT_IN_SALIR + SEP);
        input = sc.next();
        sc.nextLine();
        return input.trim();
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
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', '\n'};
        return letras[r];
    }
}
