package es.iesso.Entregar.U2A9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final int ERROR = -1;
    private static final int SALIR = 0;
    private static final Scanner sc = new Scanner(System.in);

    private static boolean seguir = true;
    private static boolean hayErrInput = false;

    public static void main(String[] args) {
        int opcion;
        imprTitulo();
        while(seguir) {
            imprMenu();
            opcion = introOpcion();
            seguir = ejecOpcion(opcion);
        }
        sc.close();
    }

    private static void imprTitulo() {
        System.out.println();
        System.out.println("FUNCIONES");
        System.out.println("---------");
        System.out.println();
    }

    private static void imprMenu() {
        System.out.println("Opciones disponibles:");
        System.out.println("0. Salir del programa");
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
        System.out.print("Introduzca su opción: ");
    }

    private static int introOpcion() {
        int opcion = -1;
        hayErrInput = false;
        try {
            opcion = sc.nextInt();
        } catch(InputMismatchException iME) {
            hayErrInput = true;
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

    private static int pedirInt(String in, String txt) {
        return 0;
    }

    private static void ejecEsCapicua() {
        System.out.println("¿Es un número capicúa?");
    }

    private static void ejecEsPrimo() {
        System.out.println("¿Es un número primo?");
    }

    private static void ejecSiguientePrimo() {
        System.out.println("Siguiente número primo");
    }

    private static void ejecPotencia() {
        System.out.println("Potencia de un número");
    }

    private static void ejecDigitos() {
        System.out.println("Contar dígitos de un número");
    }

    private static void ejecVoltea() {
        System.out.println("Voltear un número");
    }

    private static void ejecDigitoN() {
        System.out.println("Dígito en la posición N");
    }

    private static void ejecPosicionDeDigito() {
        System.out.println("Posición del dígito N");
    }

    private static void ejecQuitaPorDetras() {
        System.out.println("Quitar un dígito por detrás de un número");
    }

    private static void ejecQuitaPorDelante() {
        System.out.println("Quitar un dígito por delante de un número");
    }

    private static void ejecPegaPorDetras() {
        System.out.println("Pegar un dígito por detrás de un número");
    }

    private static void ejecPegaPorDelante() {
        System.out.println("Pegar un dígito por delante de un número");
    }

    private static void ejecTrozoDeNumero() {
        System.out.println("Trozo de un número");
    }

    private static void ejecJuntaNumeros() {
        System.out.println("Juntar dos números");
    }

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
        int r = n;
        for(int i = 1; i < e; i++)
            r *= n;
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
        return String.valueOf(n).charAt(i);
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
            if(cN == cD)
                isDig = true;
            else
                i++;
        }
        if(isDig)
            return i;
        else
            return -1;
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
        return Integer.parseInt(String.valueOf(n).concat(String.valueOf(x)));
    }

    // Función 12
    public static int pegaPorDelante(int x, int n) {
        return Integer.parseInt(String.valueOf(x).concat(String.valueOf(n)));
    }

    // Función 13
    public static int trozoDeNumero(int n, int i, int f) {
        String nTxt = String.valueOf(n);
        return Integer.parseInt(nTxt.substring(i, f));
    }

    // Función 14
    public static String juntaNumeros(int a, int b) {
        return String.valueOf(a).concat(String.valueOf(b));
    }
}
