package es.iesso.Entregar.U2A9;

import java.util.InputMismatchException;
import java.util.Scanner;

// TODO Probar todas las funciones y casos límite (con checklist)
// TODO Preparar ejemplos en un TXT
// TODO Ejecutar ejemplos y guardar en PDF
// TODO Copiar JAVA y quitar link al package

/**
 * Ejercicio 1 de la Actividad 9 de la Unidad 2 de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public abstract class Main {

    private static final int ERROR = -1;
    private static final int SALIR = 0;
    private static final Scanner sc = new Scanner(System.in);

    private static boolean seguir = true;
    private static boolean hayErrInput = false;

    static void main() {
        int opcion;
        imprTitulo();
        while(seguir) {
            imprMenu();
            opcion = introOpcionMenu();
            seguir = ejecOpcion(opcion);
        }
        sc.close();
    }

    private static void imprTitulo() {
        System.out.println();
        System.out.println("FUNCIONES CON NÚMEROS NATURALES");
        System.out.println("-------------------------------");
        System.out.println();
    }

    private static void imprMenu() {
        System.out.println("Opciones disponibles:");
        System.out.println("0.  Salir del programa");
        System.out.println("1.  Es capicúa");
        System.out.println("2.  Es primo");
        System.out.println("3.  Siguiente primo");
        System.out.println("4.  Potencia");
        System.out.println("5.  Núm. de dígitos");
        System.out.println("6.  Voltear núm.");
        System.out.println("7.  Dígito N");
        System.out.println("8.  Posición de dígito");
        System.out.println("9.  Quitar por detrás");
        System.out.println("10. Quitar por delante");
        System.out.println("11. Pega por detrás");
        System.out.println("12. Pega por delante");
        System.out.println("13. Trozo de núm.");
        System.out.println("14. Juntar núms.");
        System.out.println();
    }

    private static boolean ejecOpcion(int opcion) {
        switch (opcion) {
            case SALIR:
                System.out.println("Saliendo del programa...");
                return false;
            case 1:
                ejecEsCapicua();
                break;
            case 2:
                ejecEsPrimo();
                break;
            case 3:
                ejecSiguientePrimo();
                break;
            case 4:
                ejecPotencia();
                break;
            case 5:
                ejecDigitos();
                break;
            case 6:
                ejecVoltea();
                break;
            case 7:
                ejecDigitoN();
                break;
            case 8:
                ejecPosicionDeDigito();
                break;
            case 9:
                ejecQuitaPorDetras();
                break;
            case 10:
                ejecQuitaPorDelante();
                break;
            case 11:
                ejecPegaPorDetras();
                break;
            case 12:
                ejecPegaPorDelante();
                break;
            case 13:
                ejecTrozoDeNumero();
                break;
            case 14:
                ejecJuntaNumeros();
                break;
            default:
                if(!hayErrInput)
                    System.out.println("Error: ninguna opción válida seleccionada");
        }
        if(!hayErrInput)
            System.out.println();
        System.out.print("(Pulse Entrar para continuar...) ");
        sc.nextLine();
        System.out.println();
        return true;
    }

    private static int introOpcionMenu() {
        int n;
        System.out.print("Introduzca su opción: ");
        n = scanNat();
        if(!hayErrInput)
            System.out.println();
        return n;
    }

    private static int pedirNat(String txt) {
        int n = ERROR;
        while(n == ERROR) {
            System.out.print("Introduzca un número natural (" + txt + "): ");
            n = scanNat();
        }
        return n;
    }

    private static int pedirNat() {
        int n = ERROR;
        while(n == ERROR) {
            System.out.print("Introduzca un número natural: ");
            n = scanNat();
        }
        return n;
    }

    private static int scanNat() {
        int n = ERROR;
        hayErrInput = false;
        try {
            n = sc.nextInt();
            if(n < 0)
                throw new InputMismatchException();
        } catch(InputMismatchException iME) {
            hayErrInput = true;
            System.out.println();
            System.out.println("Error: el valor introducido no es un número natural");
            System.out.println();
        }
        sc.nextLine();
        return n;
    }

    // FUNCIONES (MENÚ)

    // Función Menú 1
    private static void ejecEsCapicua() {
        int n;
        boolean r;
        System.out.println("¿Es un número capicúa?");
        n = pedirNat();
        r = esCapicua(n);
        if(r)
            System.out.println(n + " es capicúa");
        else
            System.out.println(n + " no es capicúa");
    }

    // Función Menú 2
    private static void ejecEsPrimo() {
        int n;
        boolean r;
        System.out.println("¿Es un número primo?");
        n = pedirNat();
        r = esPrimo(n);
        if(r)
            System.out.println(n + " es primo");
        else
            System.out.println(n + " no es primo");
    }

    // Función Menú 3
    private static void ejecSiguientePrimo() {
        int n;
        int r;
        System.out.println("Siguiente número primo");
        n = pedirNat();
        r = siguientePrimo(n);
        System.out.println("El siguiente primo después de " + n + " es " + r);
    }

    // Función Menú 4
    private static void ejecPotencia() {
        int n;
        int e;
        int r;
        System.out.println("Potencia de un número");
        n = pedirNat("base");
        e = pedirNat("exponente");
        r = potencia(n, e);
        System.out.println(n + " elevado a " + e + " es " + r);
    }

    // Función Menú 5
    private static void ejecDigitos() {
        int n;
        int r;
        System.out.println("Contar dígitos de un número");
        n = pedirNat();
        r = digitos(n);
        System.out.println(n + " tiene " + r + " dígito/s");
    }

    // Función Menú 6
    private static void ejecVoltea() {
        int n;
        int r;
        System.out.println("Voltear un número");
        n = pedirNat();
        r = voltea(n);
        System.out.println(n + " volteado es " + r);
    }

    // Función Menú 7
    private static void ejecDigitoN() {
        int n;
        int d;
        int r;
        System.out.println("Dígito en la posición N");
        n = pedirNat();
        d = pedirNat("posición [1ª pos. = 0]");
        try {
            r = digitoN(n, d);
            System.out.println("El dígito " + d + " del número " + n + " es " + r);
        } catch(InputMismatchException iME) {
            System.out.println("Error: no existe la posición " + d + " en el número " + n);
        }
    }

    // Función Menú 8
    private static void ejecPosicionDeDigito() {
        int n;
        int d;
        int r;
        System.out.println("Posición del dígito N");
        n = pedirNat();
        d = pedirNat("dígito N");
        r = posicionDeDigito(n, d);
        if(r == ERROR)
            System.out.println("El dígito " + d + " del número " + n + " está en la posición " + r);
    }

    // Función Menú 9
    private static void ejecQuitaPorDetras() {
        int n;
        int d;
        int r;
        System.out.println("Quitar N dígitos por detrás de un número");
        n = pedirNat();
        d = pedirNat("N");
        r = quitaPorDetras(n, d);
        System.out.println("El número" + n + " con " + d + " cifras menos por detrás resulta " + r);
    }

    // Función Menú 10
    private static void ejecQuitaPorDelante() {
        int n;
        int d;
        int r;
        System.out.println("Quitar N dígitos por delante de un número");
        n = pedirNat();
        d = pedirNat("N");
        r = quitaPorDelante(n, d);
        System.out.println("El número" + n + " con " + d + " cifras menos por delante resulta " + r);
    }

    // Función Menú 11
    private static void ejecPegaPorDetras() {
        int n;
        int d;
        int r;
        System.out.println("Pegar un dígito por detrás de un número");
        n = pedirNat();
        d = pedirNat("solo se tomará el 1º díg.");
        r = pegaPorDetras(n, d);
        System.out.println("El número " + n + " más " + d + " por detrás resulta " + r);
    }

    // Función Menú 12
    private static void ejecPegaPorDelante() {
        int n;
        int d;
        int r;
        System.out.println("Pegar un dígito por delante de un número");
        n = pedirNat();
        d = pedirNat("solo se tomará el 1º díg.");
        r = pegaPorDelante(n, d);
        System.out.println("El número " + n + " más " + d + " por delante resulta " + r);
    }

    // Función Menú 13
    private static void ejecTrozoDeNumero() {
        int n;
        int i;
        int f;
        int r;
        System.out.println("Trozo de un número");
        n = pedirNat();
        i = pedirNat("pos. inicial [1ª pos. = 0]");
        f = pedirNat("pos. final [máx. = nº dígitos]");
        r = trozoDeNumero(n, i, f);
        System.out.println("El resultado es " + r);
    }

    // Función Menú 14
    private static void ejecJuntaNumeros() {
        int a;
        int b;
        int r;
        System.out.println("Juntar dos números");
        a = pedirNat("N1");
        b = pedirNat("N2");
        r = juntaNumeros(a, b);
        System.out.println("El resultado es " + r);
    }

    // FUNCIONES PRINCIPALES

    // Función 1
    public static boolean esCapicua(int n) {
        int m = voltea(n);
        return (n == m);
    }

    // Función 2
    public static boolean esPrimo(int n) {
        boolean primo = true;
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

    // Función 3
    public static int siguientePrimo(int n) {
        int i = n + 1;
        while(!esPrimo(i))
            i++;
        return i;
    }

    // Función 4
    public static int potencia(int n, int e) {
        int r;
        if(e == 0)
            r = 1;
        else {
            r = n;
            for(int i = 1; i < e; i++)
                r *= n;
        }
        return r;
    }

    // Función 5
    public static int digitos(int n) {
        return (String.valueOf(n).length());
    }

    // Función 6
    public static int voltea(int n) {
        String tInic = String.valueOf(n);
        String tFin = "";
        for(int i = tInic.length() - 1; i >= 0; i--)
            tFin = tFin.concat(String.valueOf(tInic.charAt(i)));
        return Integer.parseInt(tFin);
    }

    // Función 7
    public static char digitoN(int n, int i) {
        String nT = String.valueOf(n);
        if(i > nT.length())
            throw new InputMismatchException();
        else
            return nT.charAt(i);
    }

    // Función 8
    public static int posicionDeDigito(int n, int d) {
        char cN;
        int i = 0;
        boolean isDig = false;
        String nT = String.valueOf(n);
        char cD = String.valueOf(d).charAt(0);
        while(!isDig && i < nT.length()) {
            cN = nT.charAt(i);
            if(cN == cD) {
                i = ERROR;
                isDig = true;
            }
            else
                i++;
        }
        return i;
    }

    // Función 9
    public static int quitaPorDetras(int n, int d) {
        String num = String.valueOf(n);
        return Integer.parseInt(num.substring(0, num.length() - d));
    }

    // Función 10
    public static int quitaPorDelante(int n, int d) {
        String num = String.valueOf(n);
        return Integer.parseInt(num.substring(d));
    }

    // Función 11
    public static int pegaPorDetras(int n, int x) {
        char cX = String.valueOf(x).charAt(0);
        String nT = String.valueOf(n);
        return Integer.parseInt(nT.concat(String.valueOf(cX)));
    }

    // Función 12
    public static int pegaPorDelante(int x, int n) {
        char cX = String.valueOf(x).charAt(0);
        String nT = String.valueOf(n);
        return Integer.parseInt(String.valueOf(cX).concat(nT));
    }

    // Función 13
    public static int trozoDeNumero(int n, int i, int f) {
        String nTxt = String.valueOf(n);
        return Integer.parseInt(nTxt.substring(i, f));
    }

    // Función 14
    public static int juntaNumeros(int a, int b) {
        return Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
    }
}