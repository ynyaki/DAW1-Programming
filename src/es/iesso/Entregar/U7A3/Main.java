package es.iesso.Entregar.U7A3;

import java.util.Scanner;

public abstract class Main {

    private Main() {
        throw new UnsupportedOperationException();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        Menu.ejecutar(sc);
    }
}
