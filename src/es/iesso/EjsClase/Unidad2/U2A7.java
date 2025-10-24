package es.iesso.EjsClase.Unidad2;

import es.iesso.Impresora;

import java.util.Scanner;

public abstract class U2A7 extends Impresora {

    private static final int N_UD = 2;
    private static final int N_ACT = 7;
    private static final int N_EJS = 8;

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
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        imprln("No tiene sentido usar continue simplemente para avanzar de un IF.");
    }

    private static void ej2() {
        imprln("0");
        imprln("10");
        imprln("210");
        imprln("3210");
        linea();
        imprln("Comprobación:");
        for (int i=0; i<4; i++) {
            for (int j=i; j>=0; j--)
                impr(j);
            linea();
        }
    }

    private static void ej3() {
        imprln("1");
        imprln("12");
        linea();
        imprln("1234");
        linea();
        imprln("Comprobación:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                if(i == 4)
                    break;
                impr(j);
            }
            linea();
        }
    }

    private static void ej4() {
        int nFil;
        int nCol;
        impr("Nº. de filas: ");
        nFil = sc.nextInt();
        sc.nextLine();
        impr("Nº. de columnas: ");
        nCol = sc.nextInt();
        sc.nextLine();
        linea();
        for(int i = 1; i <= nFil; i++) {
            for(int j = 1; j <= nCol; j++)
                impr("# ");
            linea();
        }
    }

    private static void ej5() {
        imprln("a)");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++)
                impr("*");
            linea();
        }
        linea();
        imprln("b)");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                if(i == j)
                    impr("*");
                else
                    impr(" ");
            }
            linea();
        }
        linea();
        imprln("c)");
        for(int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--)
                impr(j + " ");
            linea();
        }
        linea();
        imprln("d)");
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i + j > 5)
                    impr("*");
                else
                    impr(" ");
            }
            linea();
        }
    }

    private static void ej6() {
        int nFil;
        int nCol;
        impr("Nº. de filas: ");
        nFil = sc.nextInt();
        sc.nextLine();
        impr("Nº. de columnas: ");
        nCol = sc.nextInt();
        sc.nextLine();
        linea();
        for(int i = 1; i <= nFil; i++) {
            for(int j = 1; j <= nCol; j++) {
                if((i == 1 && j == 1) || (i == nFil && j == 1) ||
                        (i == 1 && j == nCol) || (i == nFil && j == nCol))
                    impr("+");
                else if(j == 1 || j == nCol)
                    impr("|");
                else if(i == 1 || i == nFil)
                    impr("<>");
                else
                    impr("  ");
            }
            linea();
        }
    }

    private static void ej7() {
        int c = 1;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                if(c % 2 == 0)
                    impr("0 ");
                else
                    impr("* ");
                c++;
            }
            linea();
        }
    }

    private static void ej8() {
        int nCero;
        imprln("Lista de los 50 primeros primos:");
        for(int i = 1; i <= 50; i++) {
            nCero = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0)
                    nCero++;
                if(nCero > 2)
                    break;
            }
            if(nCero <= 2)
                imprln("(" + i + ")");
        }
    }
}