package es.iesso.Otros.pruebas;

import es.iesso.Impresora;

import java.util.Scanner;

public class Main extends Impresora {

    private static final String reyTxt = "Puede moverse en todas direcciones, pero solo avanza una posición";
    private static final String damaTxt = "Puede moverse en todas direcciones una posición," +
            " además de a lo largo de todas las casillas en línea recta y diagonales";
    private static final String cabTxt = "Puede moverse en forma de L saltando piezas";
    private static final String torreTxt = "Puede moverse a lo largo de todas las casillas en línea recta";
    private static final String alfilTxt = "Puede moverse a lo largo de todas las diagonales";
    private static final String peonTxt = "Puede moverse dos casillas hacia la" +
            " primera vez, y una sola en las siguientes. Puede comer piezas que" +
            " estén en sus casillas diagonales más próximas (solo hacia delante).";

    private static final int VAINILLA = 0;
    private static final int CHOCOLATE = 1;
    private static final int FRESA = 2;

    private static final double NUM_PI = 3.141592653589793238462643;
    private static final double NUM_E = 2.718281828459045235360;
    private static final double NUM_PHI = 1.618033988749895;

    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        linea();
        imprln("···");
        lineas(2);

        // ejercicios();
        // pruebas();
        // pruebasClase();
        // u2act1();
        u2act2();

        imprln("···");
    }

    // Grupos de ejercicios

    private static void u2act1() {
        imprttl("UD2 ACTIVIDAD 1");
        u2act_1_1();
        u2act_1_2();
        u2act_1_3();
        u2act_1_4();
        u2act_1_5(30, 20, 10);
        u2act_1_6();
        u2act_1_7();
        lineas(2);
    }

    private static void u2act2() {
        imprttl("UD2 ACTIVIDAD 2");
        u2act_2_1();
        u2act_2_2();
        u2act_2_3();
        u2act_2_4();
        lineas(2);
    }

    private static void pruebasClase() {
        // Lugar para cualquier trozo de código interesante a probar
        pruebaClase1();
    }

    private static void pruebasMath() {
        pruebaMath1();
        pruebaMath2(-100, 10);
    }

    private static void ejercicios() {
        practica5();
        practica6();
    }

    private static void practica5() {
        actividad_5_3();
        actividad_5_5();
        actividad_5_6();
    }

    private static void practica6() {
        actividad_6_1();
        actividad_6_2();
        actividad_6_3();
        actividad_6_4();
        actividad_6_5();
        actividad_6_6();
        actividad_6_7();
        actividad_6_8();
        actividad_6_9();
    }

    // Ejercicios

    private static void u2act_1_1() {
        boolean isOwner;
        imprttl("Ejercicio 1.1");
        impr("¿Eres el/la propietario/a de la máquina? ");
        isOwner = sc.nextBoolean();
        sc.nextLine();
        if(isOwner)
            imprln("Hola, bienvenido/a al sistema");
        else
            imprln("No tiene permiso para acceder al sistema. Saliendo...");
        linea();
    }

    private static void u2act_1_2() {
        int age;
        imprttl("Ejercicio 1.2");
        impr("Introduce tu edad: ");
        age = sc.nextInt();
        sc.nextLine();

        lnimpr("Se le aplicará la tarifa de ");
        if(age < 13)
            imprln("niño");
        else
            imprln("adulto");
        linea();
    }

    private static void u2act_1_3() {
        double n;
        imprttl("Ejercicio 1.3");
        impr("Introduce un número: ");
        n = sc.nextDouble();
        sc.nextLine();
        if(n > 0) {
            imprln("El número " + n + " es positivo");
            imprln("Todos los números positivos son mayores que 0");
        } else if(n < 0) {
            imprln("El número " + n + " es negativo");
            imprln("Todos los números negativos son menores que 0");
        } else {
            imprln("Por definición, el número " + n + " no es ni positivo ni negativo");
        }
        linea();
    }

    private static void u2act_1_4() {
        double precio;
        double impuesto = 0;
        double total = 0;
        imprttl("Ejercicio 1.4");
        impr("Introduzca el precio del aparato: ");
        precio = sc.nextDouble();
        sc.nextLine();
        if(precio >= 300)
            impuesto = 0.05;
        else
            impuesto = 0;
        total += precio * (1 + impuesto);
        imprln("El artículo tiene un precio total de " + total + " €");
        linea();
    }

    private static void u2act_1_5(int a, int b, int c) {
        imprttl("Ejercicio 1.5");
        String esMayor = " es el mayor";
        if(a > b && a > c)
            imprln("A" + esMayor);
        else if(b > a && b > c)
            imprln("B" + esMayor);
        else
            imprln("C" + esMayor);
        linea();
    }

    private static void u2act_1_6() {
        String pieza;
        imprttl("Ejercicio 1.6");
        impr("Introduce la inicial del nombre de la pieza de ajedrez: ");
        pieza = sc.next();
        sc.nextLine();
        if(pieza.equals("K")) // King/Rey
            imprln(reyTxt);
        else if(pieza.equals("Q")) // Queen/Dama
            imprln(damaTxt);
        else if(pieza.equals("N")) // Knight/Caballo
            imprln(cabTxt);
        else if(pieza.equals("R")) // Rook/Torre
            imprln(torreTxt);
        else if(pieza.equals("B")) // Bishop/Alfil
            imprln(alfilTxt);
        else if(pieza.equals("P")) // Pawn/Peón
            imprln(peonTxt);
        linea();
    }

    private static void u2act_1_7() {
        String pieza;
        String piezaInfo;
        imprttl("Ejercicio 1.7");
        impr("Introduce la inicial del nombre de la pieza de ajedrez: ");
        pieza = sc.next();
        sc.nextLine();
        piezaInfo = switch(pieza) {
            case "K" -> reyTxt;
            case "Q" -> damaTxt;
            case "N" -> cabTxt;
            case "R" -> torreTxt;
            case "A" -> alfilTxt;
            case "P" -> peonTxt;
            default -> "Identificador de pieza erróneo";
        };
        imprln(piezaInfo);
        linea();
    }

    private static void u2act_2_1() {
        int edad;
        double credito;
        imprttl("Ejercicio 2.1");
        impr("Introduzca su edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        impr("Introduzca su crédito: ");
        credito = sc.nextDouble();
        sc.nextLine();
        if(edad >= 21 && credito >= 10000) {
            imprln("Usted es apto/a para el crédito");
        } else {
            imprln("Lo sentimos mucho, usted no es apto/a para obtener el crédito");
        }
        linea();
    }

    private static void u2act_2_2() {
        imprttl("Ejercicio 2.2");

        imprln("a)");
        int kA = 0;
        switch (kA) {
            case 0:
                imprln("zero");
                break;
            case 1:
                imprln("one");
                break;
            default:
                imprln("default");
                break;
        }
        linea();

        imprln("b)");
        int kB = 0;
        switch (kB + 1) {
            case 0:
                imprln("zero");
                break;
            case 1:
                imprln("one");
                break;
            default:
                imprln("default");
                break;
        }
        linea();

        /*
        imprln("c)");
        int kC = 6;
        switch (kC / 3.0) { // No se puede operar con un int y un double
            case 2:
                imprln("zero");
                break;
            case 3:
                imprln("one");
                break;
            default:
                imprln("default");
                break;
        }
        linea();
        */

        imprln("d)");
        int kD = 6;
        switch (kD / 3) {
            case 1:
                imprln("zero");
                break;
            case 3:
                imprln("one");
                break;
        }
        linea();

        imprln("e)");
        int kE = 3;
        switch (kE) {
            case 1:
                imprln("one");
            case 2:
                imprln("two");
            case 3:
                imprln("three");
            case 4:
                imprln("four");
            default:
                imprln("default");
        }
        linea();

        imprln("f)");
        int kF = 3;
        switch (kF) {
            case 1:
                imprln("one");
            case 2:
                imprln("two");
            case 3:
                imprln("three");
            case 4:
                imprln("four");
                break;
            default:
                imprln("default");
        }
        linea();

        imprln("g)");
        int kG = 1;
        switch (kG) {
            case 1:
            case 2:
                imprln("one");
                imprln("two");
                break;
            case 3:
                imprln("three");
            case 4:
                imprln("four");
                break;
            default:
                imprln("default");
        }
        linea();

        /*
        imprln("h)");
        int kH = 1;
        switch (kH) {
            case 1:
            case 2: // Caso duplicado
                imprln("one");
                imprln("two");
                break;
            case 3:
                System.out.println("three");
            case 2: // Caso duplicado
                System.out.println("four");
                break;
        }
        linea();
        */

        /*
        imprln("i)");
        int kI = 1;
        switch (kI) {
            case 1:
            case 2:
                imprln("one");
                imprln("two");
                break;
            imprln("four"); // Sentencia inalcanzable
        }
        linea();
        */
    }

    private static void u2act_2_3() {
        int sabor;
        String respuesta;
        imprttl("Ejercicio 2.3");
        imprln("Elija su sabor de helado:");
        imprln("0. Vainilla");
        imprln("1. Chocolate");
        imprln("2. Fresa");
        impr("Sabor: ");
        sabor = sc.nextInt();
        sc.nextLine();
        respuesta = switch(sabor) {
            case 0 -> "Vainilla";
            case 1 -> "Chocolate";
            case 2 -> "Fresa";
            default -> "Error";
        };
        imprln("Sabor elegido: " + respuesta);
        linea();
    }

    private static void u2act_2_4() {
        int sabor;
        String respuesta;
        imprttl("Ejercicio 2.4");
        imprln("Elija su sabor de helado:");
        imprln("0. Vainilla");
        imprln("1. Chocolate");
        imprln("2. Fresa");
        impr("Sabor: ");
        sabor = sc.nextInt();
        sc.nextLine();
        respuesta = switch(sabor) {
            case VAINILLA -> "Vainilla";
            case CHOCOLATE -> "Chocolate";
            case FRESA -> "Fresa";
            default -> "Error";
        };
        imprln("Sabor elegido: " + respuesta);
        linea();
    }

    private static void pruebaClase1() {
        String respuesta;
        System.out.print("¿Está lloviendo? (Y or N): ");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("Y")) {
            System.out.println("Activa limpiaparabrisas");
        } else if(respuesta.equalsIgnoreCase("N")) {
            System.out.println("Desactiva limpiaparabrisas");
        } else
            System.out.println("No se reconoció el comando");
    }

    private static void actividad_5_3() {
        imprttl("Actividad 5.3");

        // Inicialización de variables
        float lcuad = 5;
        float brect = 8;
        float hrect = 4;
        float btri = 18;
        float htri = 15;
        float pi = 3.141592f;
        float rcirc = 7.5f;

        // Cálculos
        float acuad = lcuad * lcuad;
        float prect = brect * hrect;
        float atri = btri * htri;
        float acirc = pi * rcirc * rcirc;
        float pcirc = 2 * pi * rcirc;

        imprln("a) Área del cuadrado = " + acuad);
        imprln("b) Perímetro del rectángulo = " + prect);
        imprln("c) Área del triángulo = " + atri);
        imprln("d) Área del círculo = " + acirc);
        imprln("   Perímetro del círculo = " + pcirc);

        lineas(2);
    }

    private static void actividad_5_5() {
        imprttl("Actividad 5.5");

        int i=10;
        int y=10;

        int sumai = i++ + ++i;
        int sumay = y++ + y++;

        imprln("Para i = 10, i++ + ++i = " + sumai);
        imprln("Para y = 10, y++ + y++ = " + sumay);

        lineas(2);
    }

    private static void actividad_5_6() {
        imprttl("Actividad 5.6");

        int i, z, w, t, j, c;

        // Apartado a)
        i = 0;
        i = i++ - --i + ++i - i--;
        imprln("a) Para i = 0, i++ - --i + ++i - i-- = " + i);

        // Apartado b)
        z=9;
        w=19;
        t = z-- - z++ + --w - ++w + --z - w-- + ++z - w++;
        imprln("b) z = " + z);
        imprln("   w = " + w);
        imprln("   t = " + t);

        // Apartado c)
        imprln("c) Para i = 7, la expresión \"j = ++(i--)\" da error de compilación");

        // Apartado D
        c = 1;
        c = c++ + ++c * c-- - --c;
        imprln("d) c = " + c);

        lineas(2);
    }

    private static void actividad_6_1() {
        imprttl("Actividad 6.1");

        int e1 = 12 / 3;
        int e2 = 12 / 8;
        double e3 = 11.0 / 6.0;
        double e4 = 1.0 / 2.0;
        int e5 = 12 / 6;
        int e6 = 11 / 2;
        double e7 = 2.0 / 4.0;

        imprln("12 / 3 = " + e1 + " (int)");
        imprln("12 / 8 = " + e2 + " (int)");
        imprln("11.0 / 6.0 = " + e3 + " (double)");
        imprln("1.0 / 2.0 = " + e4 + " (double)");
        imprln("12 / 6 = " + e5 + " (int)");
        imprln("11 / 2 = " + e6 + " (int)");
        imprln("2.0 / 4.0 = " + e7 + " (double)");

        lineas(2);
    }

    private static void actividad_6_2() {
        imprttl("Actividad 6.2");
        imprln("1/2 + 1/2 = " + (1/2 + 1/2));

        // Suma de n fracciones hasta 1
        int n = 4;
        float suma = 0;
        imprln("Suma de n fracciones hasta 1");
        impr("Para n = " + n + ", ");
        for(int i = 1; i <= n; i++) {
            suma += 1/n;
            impr("1/" + n);
            if(i != n) {
                impr(" + ");
            } else {
                impr(" = ");
            }
        }
        imprln(suma);

        lineas(2);
    }

    private static void actividad_6_3() {
        imprttl("Actividad 6.3");

        float n1 = (float) -9/10;
        float n2 = (float) 9/10;
        imprln(n1 + " y " + n2);

        lineas(2);
    }

    private static void actividad_6_4() {
        imprttl("Actividad 6.4");

        double n = (35 + 0.0) / 7;
        imprln("(35 + 0.0) / 7 = " + n + " (double)");

        lineas(2);
    }

    private static void actividad_6_5() {
        imprttl("Actividad 6.5");

        double n = (3/4 + 6.4) / 3.0;
        imprln("1ª op.: 3/4 (int)");
        linea();
        imprln("2ª op.: (0 + 6.4) (double)");
        imprln("3ª op.: 6.4 / 3.0 (double)");

        lineas(2);
    }

    private static void actividad_6_6() {
        imprttl("Actividad 6.6");

        int entero = 10;
        double decimal = 20.0;
        double resultado = (decimal / entero - 2) / 4;
        imprln("(decimal / entero - 2) / 4 = " + resultado);

        lineas(2);
    }

    private static void actividad_6_7() {
        imprttl("Actividad 6.7");

        double e1 = 5.6 + -14;
        double e2 = (12 + 0.01) / 3;
        double e3 = (18.0 - 23.3) / (64 - 13);
        double e4 = -23.49 * 3.5;
        double e5 = (34 -12) * (9 / 10) + 1.2;
        double e6 = -8 / 16 + 3.5;

        imprln("5.6 + -14 = " + e1);
        imprln("(12 + 0.01) / 3 = " + e2);
        imprln("(18.0 - 23.3) / (64 - 13) = " + e3);
        imprln("-23.49 * 3.5 = " + e4);
        imprln("(34 -12) * (9 / 10) + 1.2 = " + e5);
        imprln("-8 / 16 + 3.5 = " + e6);
        linea();
        imprln("Todas las expresiones devuelven double.");

        lineas(2);
    }

    private static void actividad_6_8() {
        imprttl("Actividad 6.8");

        int r1 = 10 % 5;
        int r2 = -3 % 2;
        int r3 = -8 % 4;
        int r4 = 7 % 2;
        int r5 = 100 % 3;

        imprln("10 % 5 = " + r1);
        imprln("-3 % 2 = " + r2);
        imprln("-8 % 4 = " + r3);
        imprln("7 % 2 = " + r4);
        imprln("100 % 3 = " + r5);

        lineas(2);
    }

    private static void actividad_6_9() {
        imprttl("Actividad 6.9");

        imprln("Constantes declaradas:");
        imprln(" · Pi (π) = " + NUM_PI);
        imprln(" · E (e) = " + NUM_E);
        imprln(" · Phi (Φ) = " + NUM_PHI);

        lineas(2);
    }

    private static void pruebaMath1() {
        imprttl("EJEMPLOS DE MÉTODOS DE MATH");

        imprln("Math.abs(-10) = " + Math.abs(-10));
        imprln("Math.ceil(1.4) = " + Math.ceil(1.4));
        imprln("Math.floor(1.6) = " + Math.ceil(1.6));
        imprln("Math.max(10.0, 20) = " + Math.max(10.0, 20));
        imprln("Math.pow(2, 10) = " + Math.pow(2, 10));
        imprln("Math.round(2.71) = " + Math.round(2.71));
        imprln("Math.sqrt(81) = " + Math.sqrt(81));

        lineas(2);
    }

    private static void pruebaMath2(double x, double y) {
        imprttl("PRUEBA: VECTOR MÓD. 1");

        double hip = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double angRad = Math.atan(hip);
        double ang360 = Math.toDegrees(angRad);

        imprln("Cálculo de ángulo de vector módulo 1 dado el vector (" +
                format(x) + ", " + format(y) + ")");
        imprln("Todos los ángulos se tratarán como del primer cuadrante.");
        imprln("Ángulo en radianes = " + roundN(angRad, 2) + " rad");
        imprln("Ángulo en grados = " + roundN(ang360, 2) + "º");

        lineas(2);
    }
}