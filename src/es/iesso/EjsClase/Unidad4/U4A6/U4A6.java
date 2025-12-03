package es.iesso.EjsClase.Unidad4.U4A6;

import es.iesso.Impresora;

import java.util.Scanner;

public abstract class U4A6 extends Impresora {

    private static final int N_UD = 4;
    private static final int N_ACT = 5;
    private static final int N_EJS = 11;

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

    public static void mostrarAct(Scanner scIn) {
        sc = scIn;
        lineas(2);
        imprttl(TITULO_ACT);
        for(int i = 1; i <= N_EJS; i++)
            mostrarEj(i, sc);
    }

    public static void mostrarEj(int n, Scanner scIn) {
        sc = scIn;
        if(0 < n && n <= N_EJS)
            imprttl(TITULO_EJ + n);

        ej(n);
        linea();
        impr(COM_ENTRAR);
        sc.nextLine();
        linea();
    }

    private static void ej(int n) {
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
        else
            imprln(ERR_EJ);
    }

    private static void ej1() {
        imprln("a) gradeTable[0][0]: 99");
        imprln("   gradeTable[1][1]: 91");
        imprln("   gradeTable[3][4]: 78");
        imprln("   gradeTable[5][2]: 92");
        imprln("b) gradeTable[3][5] = 0;");
        imprln("c) int[][] gradeTable = new int[7][5];");
        imprln("d)   i. Suma 1 a gT[3][4].");
        imprln("d)  ii. value = 40");
        imprln("d) iii. Excepción IndexOutOfBounds");
        imprln("d)  iv. Error de compilación.");
        imprln("d)   v. Error de compilación.");
    }

    private static void ej2() {
        int[][] myArray = {{8, 1, 2, 2, 9}, {1, 9, 4, 0, 3},
                {0, 3, 0, 0, 7}};
        imprln("myArray[1][2] = " + myArray[1][2]);
    }

    private static void ej3() {
        int[][] mEj = {{1, 0, 0}, {0, 1, 0}, null};
        imprln("a) m[0][2] = 4");
        imprln("   m[1][1] = 2");
        imprln("   m[1][2]: Excepción IOOB");
        imprln("b) Tiene longitud 3");
        imprln("c) Se obtiene con m[i].length, siendo i un nº natural" +
                " dentro de los límites del array.");
        imprln("d) m[i] = new int[n]");
        imprln("e)");
        imprMatriz(mEj);
    }

    private static void ej4() {
        int[][] matriz = {null, {1, 1}, {0, 3}, {0, 1, 2, 3, 4}, null};
        imprMatriz(matriz);
    }

    private static void ej5() {
        int[][] int2d = new int[5][10];
        imprMatriz(int2d);
    }

    private static void ej6() {
        int[][] int2d = new int[5][10];
        imprln(int2d[2][int2d.length - 1]);
        int2d[int2d.length - 1][int2d[0].length - 1] = 100;
        imprln(int2d[int2d.length - 1][int2d[0].length - 1]);
    }

    private static void ej7() {
        int[][] int2d = new int[5][10];
        int2d[int2d.length - 1][int2d[0].length - 1] = 100;
        imprMatriz(int2d);
    }

    private static void ej8() {
        int[][] int2d = new int[52][7];
        imprMatriz(int2d);
    }

    private static void ej9() {
        imprln("Método \"promedio\" añadido.");
        imprln(promedio(new int[] {1, 2, 3, 4, 5, 6, 7}));
    }

    private static double promedio(int[] a) {
        double p = 0;
        for(int i = 0; i < a.length; i++)
            p += a[i];
        return p / a.length;
    }

    private static void ej10() {
        imprln("Método \"promDiaSemana\" añadido.");
    }

    private static double promDiaSemana(int[][] m, int dia) {
        double p = 0;
        for(int i = 0; i < m.length; i++)
            p += m[i][dia];
        return p;
    }

    private static void ej11() {
        imprln("int[][][] m3d = new int[x][y][z];");
    }

    private static void imprMatriz(int[][] m) {
        for(int i = 0; i < m.length; i++) {
            if(m[i] != null) {
                for(int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j]);
                    if(j < m[i].length - 1)
                        System.out.print(" ");
                }
            }
            else
                System.out.println("Fila vacía");
            if(i < m.length - 1)
                System.out.println();
        }
    }

    private static int[][] copy(int[][] m) {
        int[][] c = new int[m.length][];
        for(int i = 0; i < m.length; i++)
            c[i] = new int[m[i].length];
        for(int i = 0; i < c.length; i++)
            for(int j = 0; j < c[i].length; j++)
                c[i][j] = m[i][j];
        return c;
    }
}
