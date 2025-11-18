package es.iesso.PrimeraEv;

import java.util.Scanner;

/**
 * Clase para el examen de la primera evaluación de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu.ejecutar(sc);
        sc.close();
    }

    /*
    // Main usado para hacer pruebas
    public static void main(String[] args) {

        IPv4 ip1 = new IPv4("137.12.123.255//17");
        IPv4 ip2 = new IPv4("137.12.123.255/17/");
        IPv4 ip3 = new IPv4("137.12.123.255/");

        IPv4 ip4 = new IPv4("192.168.034.45/24");
        IPv4 ip5 = new IPv4("123.256.23/12");
        IPv4 ip6 = new IPv4("172.12.34.54/31");
        IPv4 ip7 = new IPv4("0224.254.123.23/9");
        IPv4 ip8 = new IPv4("23.34.23.255/4Z");
        IPv4 ip9 = new IPv4("30.0.0.1/8");
        IPv4 ip10 = new IPv4("8.8.8.08/8");
        IPv4 ip11 = new IPv4("10.0.0.254/33");

        IPv4 ip12 = new IPv4("172.16.34.254/16");
        IPv4 ip13 = new IPv4("242.12.34.55/23");
        IPv4 ip14 = new IPv4("300.12.23.24/24");
        IPv4 ip15 = new IPv4("199.23.43.45/20");
        IPv4 ip16 = new IPv4(".192.168.72.23/12");
        IPv4 ip17 = new IPv4("23..168.72.33/15");
        IPv4 ip18 = new IPv4("192.45A.23.24/22");

        System.out.println(ip1);
        System.out.println(ip2);
        System.out.println(ip3);
        System.out.println();
        System.out.println(ip4);
        System.out.println(ip5);
        System.out.println(ip6);
        System.out.println(ip7);
        System.out.println(ip8);
        System.out.println(ip9);
        System.out.println(ip10);
        System.out.println(ip11);
        System.out.println();
        System.out.println(ip12);
        System.out.println(ip13);
        System.out.println(ip14);
        System.out.println(ip15);
        System.out.println(ip16);
        System.out.println(ip17);
        System.out.println(ip18);
    }
    */
}