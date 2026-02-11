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

    static void main() {
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
        com = pedirInput();
        System.out.println();
        switch(com) {
            case OPC_SALIR -> seguir = false;
            case OPC_IMPR -> imprContactos();
            case OPC_ADD -> menuAddContacto();
            case OPC_UPDATE -> menuUpdateContacto();
            case OPC_BORRAR -> menuBorrarContacto();
            case OPC_BUSCAR -> menuBuscarContacto();
            default -> System.out.println("Error: comando no detectado");
        }
        if(seguir) {
            System.out.println();
            pedirEnter();
            System.out.println();
        }
        return seguir;
    }

    private static void imprContactos() {
        if(t.estaVacio())
            System.out.println("La lista de contactos está vacía");
        else {
            System.out.println("Lista de contactos");
            t.imprContactos();
        }
    }

    private static void menuAddContacto() {
        boolean isAdded;
        String newNombre;
        String newNumero;

        System.out.println("Añadir contacto");
        newNombre = pedirInput("Introduzca el nombre:");
        newNumero = pedirInput("Introduzca el número:");
        isAdded = t.addContacto(newNombre, newNumero);

        if(isAdded)
            System.out.println("Contacto añadido");
        else
            System.out.println("No se pudo añadir el contacto");
    }

    private static void menuUpdateContacto() {
        boolean isUpdated;
        String nombreUpd;
        String newNombre;
        String newNumero;
        Contacto c;
        Contacto newC;

        System.out.println("Actualizar contacto");
        nombreUpd = pedirInput("Introduzca el nombre a buscar:");
        c = t.queryContacto(nombreUpd);
        if(c == null) {
            System.out.println("No se pudo encontrar el contacto");
            return;
        }

        newNombre = pedirInput("Introduzca el nuevo nombre:");
        newNumero = pedirInput("Introduzca el nuevo número:");
        newC = Contacto.crearContacto(newNombre, newNumero);
        isUpdated = t.updateContacto(c, newC);

        if(isUpdated)
            System.out.println("Contacto actualizado");
        else
            System.out.println("No se pudo actualizar el contacto");
    }

    private static void menuBorrarContacto() {
        boolean estaBorrado;
        String nombreBorr;
        Contacto c;

        System.out.println("Borrar contacto");
        nombreBorr = pedirInput("Introduzca el nombre a buscar:");
        c = t.queryContacto(nombreBorr);
        if(c == null) {
            System.out.println("No se pudo encontrar el contacto");
            return;
        }
        estaBorrado = t.borrarContacto(c);

        if(estaBorrado)
            System.out.println("Contacto borrado");
        else
            System.out.println("No se pudo borrar el contacto");
    }

    private static void menuBuscarContacto() {
        String nombreBorr;
        Contacto c;

        nombreBorr = pedirInput("Introduzca el nombre a buscar:");
        c = t.queryContacto(nombreBorr);
        if(c == null)
            System.out.println("No se pudo encontrar el contacto");
        else {
            System.out.println("Contacto encontrado");
            System.out.println(c);
        }
    }

    private static void imprSalir() {
        System.out.println("Saliendo del programa...");
        System.out.println();
    }

    private static String pedirInput(String msg) {
        String in = "";
        System.out.println(msg);
        while(in.isBlank()) {
            System.out.print("> ");
            in = sc.nextLine().trim();
        }
        return in;
    }

    private static String pedirInput() {
        String in = "";
        while(in.isBlank()) {
            System.out.print("> ");
            in = sc.nextLine().trim();
        }
        return in;
    }

    private static void pedirEnter() {
        System.out.print("(Pulse Enter para continuar...) ");
        sc.nextLine();
    }

    private Main() {
        throw new UnsupportedOperationException();
    }
}
