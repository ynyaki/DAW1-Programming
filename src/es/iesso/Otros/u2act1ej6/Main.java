package es.iesso.Otros.u2act1ej6;

import java.util.Scanner;

/**
 * Actividad 6 de Programación, por Iñaki Bazán Fernández, 1ºJ (DAW),
 * IES Severo Ochoa, Elche
 */
public class Main {

    private static final Scanner sc = new Scanner(System.in);

    private static final String TITULO =     "DICCIONARIO DE PIEZAS: AJEDREZ";
    private static final String SUBR_TITULO = "------------------------------";
    private static final String INSTRUCCIONES = "Elige la pieza sobre la que" +
            " quieras obtener información:";
    private static final String TXT_COM = "Comando: ";
    private static final String INS_ENTER = "(Pulsa Enter para continuar) ";
    private static final String TXT_SALIENDO = "Saliendo del programa...";
    private static final String ERROR_COM = "Identificador de pieza desconocido";

    private static final String COM_SALIR_PR = "0";
    private static final String COM_REY = "K";
    private static final String COM_DAMA = "Q";
    private static final String COM_CAB = "N";
    private static final String COM_TORRE = "R";
    private static final String COM_ALFIL = "B";
    private static final String COM_PEON = "P";

    private static final String SEP = ". ";
    private static final String TXT_SALIR_PR = "Salir";
    private static final String TXT_REY = "Rey";
    private static final String TXT_DAMA = "Dama";
    private static final String TXT_CAB = "Caballo";
    private static final String TXT_TORRE = "Torre";
    private static final String TXT_ALFIL = "Alfil";
    private static final String TXT_PEON = "Peón";

    private static final String DESC_REY = "Rey: \"Puede moverse en todas" +
            " direcciones, pero solo avanza una posición\"";
    private static final String DESC_DAMA = "Dama: \"Puede moverse en todas" +
            " direcciones una posición, además de a lo largo de todas las" +
            " casillas en línea recta y diagonales\"";
    private static final String DESC_CAB = "Caballo: \"Puede moverse en forma" +
            " de L saltando piezas\"";
    private static final String DESC_TORRE = "Torre: \"Puede moverse a lo largo" +
            " de todas las casillas en línea recta\"";
    private static final String DESC_ALFIL = "Alfil: \"Puede moverse a lo largo" +
            " de todas las diagonales\"";
    private static final String DESC_PEON = "Peón: \"Puede moverse dos casillas" +
            " hacia la primera vez, y una sola en las siguientes. Puede comer" +
            " piezas que estén en sus casillas diagonales más próximas" +
            " (solo hacia delante).\"";

    private static int nEjec = 0;

    public static void main(String[] args) {
        boolean salirPrograma = false;
        while(!salirPrograma)
            salirPrograma = menuPrincipal();
        sc.close();
    }

    private static boolean menuPrincipal() {
        String comando;
        String infoPieza;
        if(nEjec == 0) {
            System.out.println();
            System.out.println(TITULO);
            System.out.println(SUBR_TITULO);
        }
        System.out.println();
        System.out.println(INSTRUCCIONES);
        imprComandos();
        System.out.print(TXT_COM);
        comando = sc.nextLine();
        comando = comando.trim().toUpperCase();

        // ¿Salir?
        if(comando.equals(COM_SALIR_PR)) {
            System.out.println(TXT_SALIENDO);
            return true;
        }

        // Identificar comando
        infoPieza = switch(comando) {
            case COM_REY -> DESC_REY;
            case COM_DAMA -> DESC_DAMA;
            case COM_CAB -> DESC_CAB;
            case COM_TORRE -> DESC_TORRE;
            case COM_ALFIL -> DESC_ALFIL;
            case COM_PEON -> DESC_PEON;
            default -> ERROR_COM;
        };
        System.out.println(infoPieza);
        System.out.print(INS_ENTER);
        sc.nextLine();
        nEjec++;
        return false;
    }

    private static void imprComandos() {
        System.out.println(COM_REY + SEP + TXT_REY);
        System.out.println(COM_DAMA + SEP + TXT_DAMA);
        System.out.println(COM_CAB + SEP + TXT_CAB);
        System.out.println(COM_TORRE + SEP + TXT_TORRE);
        System.out.println(COM_ALFIL + SEP + TXT_ALFIL);
        System.out.println(COM_PEON + SEP + TXT_PEON);
        System.out.println(COM_SALIR_PR + SEP + TXT_SALIR_PR);
    }
}
