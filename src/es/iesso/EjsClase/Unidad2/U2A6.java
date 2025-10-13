package es.iesso.EjsClase.Unidad2;

import es.iesso.Impresora;

import java.util.Scanner;

public final class U2A6 extends Impresora {

    private static final int N_UD = 2;
    private static final int N_ACT = 6;
    private static final int N_EJS = 12;

    private static final String TITULO_ACT = "UNIDAD " + N_UD + " - ACTIVIDAD " + N_ACT;
    private static final String TITULO_EJ = "U" + N_UD + "A" + N_ACT + ". Ejercicio ";
    private static final String COM_ENTRAR = "(Pulsa Entrar para continuar...) ";
    private static final String ERR_EJ = "Error: Ejercicio no disponible";

    private static Scanner sc;

    public static int getNUd() {
        return N_UD;
    }

    public static int getNAct() {
        return N_ACT;
    }

    public static int getNEjs() {
        return N_EJS;
    }

    public static void mostrar(Scanner scIn) {
        sc = scIn;
        lineas(2);
        imprttl(TITULO_ACT);
        for(int i = 1; i <= N_EJS; i++)
            imprEj(i, sc);
    }

    public static void imprEj(int n, Scanner scIn) {
        sc = scIn;
        if(0 < n && n <= N_EJS)
            imprttl(TITULO_EJ + n);

        ej(n);
        linea();
        impr(COM_ENTRAR);
        sc.nextLine();
        linea();
    }

    public static void ej(int n) {
        if(n == 1)
            ej1();
        else if(n == 2)
            ej2();
        else if(n == 3)
            ej3();
        else if(n == 4)
            ej4();
        else if(n == 5)
            ej5();
        else if(n == 6)
            ej6();
        else if(n == 7)
            ej7();
        else if(n == 8)
            ej8();
        else if(n == 9)
            ej9();
        else if(n == 10)
            ej10();
        else if(n == 11)
            ej11();
        else if(n == 12)
            ej12();
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        imprln("a) El bucle for necesita dos puntos y comas para separar sus tres elementos.");
        imprln("   Por tanto, no puede haber comas ni un punto y coma después del modificador.");
    }

    private static void ej2() {
        imprln("a) \"k\" no incrementa");
        imprln("b) No puede haber bucle porque k siempre debe ser 100");
        imprln("c) El bucle terminará correctamente");
        imprln("d) k debe incrementar su valor");
        imprln("e) Un modificador n/2 solo admite como límite las potencias de 2");
        imprln("f) k siempre será impar, por lo que nunca será 100");
        imprln("g) k debería multiplicarse por 2 para poder llegar a 10");
    }

    private static void ej3() {
        imprln("La j no llega a inicializarse, lo que daría un error de compilación.");
    }

    private static void ej4() {
        int suma = 0;
        for (int i = 1; i <= 6; i++) {
            suma += i;
            impr(i + " ");
        }
        imprln("Suma = " + suma);
        imprln("El bucle for resulta ser más compacto que el while con un contador entero.");
    }

    private static void ej5() {
            for(int i = 1; i <= 9; i += 2)
                impr(i + " ");
            for(int j = 1; j <= 16; j *= 2)
                impr(j + " ");
    }

    private static void ej6() {
        double l;
        double s;
        impr("Introduce el límite: ");
        l = sc.nextDouble();
        sc.nextLine();
        impr("Introduce el incremento: ");
        s = sc.nextDouble();
        sc.nextLine();
        for(double i = 1; i <= l; i += s)
            impr(i + " ");
    }

    private static void ej7() {
        int c;

        imprln("Bucle con c--");
        for(c = 10; c >= 0; c--)
            impr(c + " ");
        imprln("Fin del bucle. c = " + c);

        imprln("Bucle con --c");
        for(c = 10; c >= 0; --c)
            impr(c + " ");
        imprln("Fin del bucle. c = " + c);
    }

    private static void ej8() {
        imprln("- Con un \";\" al principio del bucle puedes sacar fuera el inicializador,");
        imprln("  siempre que se especifique antes del bucle para no provocar un error de compilación.");
        imprln("- Con un \";\" al final del bucle puedes sacar fuera el modificador,");
        imprln("  siempre que se especifique dentro del bucle para no hacerlo infinito.");
    }

    private static void ej9() {
        double i;
        impr("Introduzca un valor o -1 para salir: ");
        i = sc.nextDouble();
        sc.nextLine();
        for (; i >= 0.0 ;) {
            imprln("La raíz cuadrada de " + i + " es " + Math.sqrt(i));
            impr("Introduzca un valor o -1 para salir: ");
            i = sc.nextDouble();
            sc.nextLine();
        }
        imprln("a) El código es correcto, aunque el for debería sustituirse por un while");
        imprln("b) for(;;) simplemente no hace nada.");
    }

    private static void ej10() {
        int suma = 0;
        for(int j = 0; j < 8; j++)
            suma += j;
        imprln("Suma total = " + suma);
        imprln("No se puede imprimir j fuera del bucle.");
    }

    private static void ej11() {
        int sumEven = 0;
        int sumOdd  = 0;
        int j;
        for (j = 0;  j < 8; j+=2 )
            sumEven += j;
        imprln(sumEven);
        for ( j = 1; j < 8; j+=2)
            sumOdd += j;
        imprln(sumOdd );
        imprln("La corrección se aplica sacando la declaración de j fuera del bucle.");
    }

    private static void ej12() {
        String guess;
        imprln("Poyo! (Guess my name!)");
        for(guess = sc.nextLine(); guess.equals("Kirby"); guess = sc.nextLine());
        imprln("Poyo!! (Congratulations, you guessed my name correctly!!)");
    }
}