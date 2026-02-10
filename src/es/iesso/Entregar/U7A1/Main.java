package es.iesso.Entregar.U7A1;

import java.util.Scanner;

public final class Main {

    private static final String OPC_SALIR = "0";
    private static final String OPC_IMPR = "1";
    private static final String OPC_ADD = "2";
    private static final String OPC_UPDATE = "3";
    private static final String OPC_BORRAR = "4";
    private static final String OPC_BUSCAR = "5";

    private static final Scanner sc = new Scanner(System.in);

    private static TelefonoMovil t;

    public static void main() {
        boolean seguir = true;
        imprTitulo();
        crearTelefonoMovil();
        crearContactosPrueba();
        imprTitulo();
        while(seguir)
            seguir = ejecBucleMenu();
        imprSalir();
    }

    // DELETE Método de prueba
    private static void crearContactosPrueba() {
        t.addContacto("Emergencias", "112");
        t.addContacto("Hospital", "16370251461920572006190");
        t.addContacto("Mecánico", "628012839");
    }

    private static void imprTitulo() {
        System.out.println();
        System.out.println();
        System.out.println("AGENDA TELEFÓNICA");
        System.out.println("-----------------");
        System.out.println();
    }

    private static void imprComandos() {
        System.out.println("Elija uno de los siguientes comandos:");
        System.out.println("  (0) Salir");
        System.out.println("  (1) Mostrar contactos");
        System.out.println("  (2) Añadir contacto");
        System.out.println("  (3) Actualizar contacto");
        System.out.println("  (4) Eliminar contacto");
        System.out.println("  (5) Buscar contacto");
        System.out.println();
    }

    private static void crearTelefonoMovil() {
        String com = "";
        while(com.isBlank()) {
            System.out.print("Por favor, añada su número de teléfono: ");
            com = sc.nextLine().trim();
            if(com.isBlank())
                System.out.println();
        }
        t = new TelefonoMovil(com);
    }

    private static boolean ejecBucleMenu() {
        boolean seguir = true;
        String com;
        imprComandos();
        com = pedirCom();
        switch(com) {
            case OPC_SALIR -> seguir = false;
            case OPC_IMPR -> imprContactos();
            case OPC_ADD -> menuAddContacto();
            case OPC_UPDATE -> menuUpdateContacto();
            case OPC_BORRAR -> menuBorrarContacto();
            default -> imprErrorCom();
        }
        System.out.println();
        return seguir;
    }

    private static String pedirCom() {
        String com = "";
        while(com.isBlank()) {
            System.out.print("> ");
            com = sc.nextLine().trim();
        }
        return com;
    }

    private static void imprErrorCom() {
        System.out.println("Error: comando no detectado");
        pedirEnter();
        System.out.println();
    }

    private static void imprContactos() {
        if(t.estaVacio())
            System.out.println("La lista de contactos está vacía");
        else {
            System.out.println("Lista de contactos");
            t.imprContactos();
        }
        System.out.println();
    }

    private static void menuAddContacto() {}

    private static void menuUpdateContacto() {}

    private static void menuBorrarContacto() {}

    private static void imprSalir() {
        System.out.println("Saliendo del programa...");
        System.out.println();
    }

    private static void pedirEnter() {
        System.out.print("(Pulse Enter para continuar...) ");
        sc.nextLine();
    }

    private Main() {
        throw new UnsupportedOperationException();
    }
}
