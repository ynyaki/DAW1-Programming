package es.iesso.EjsClase.Unidad4.U4A4;

import java.util.Scanner;

public class MesTester {

    public static void main( String[] args) {
        int dia;
        int temperatura;
        Scanner sc = new Scanner( System.in);
        MesCollector enero = new MesCollector(1, 2021);
        String respuesta = "Y";

        while (respuesta.toUpperCase().charAt(0) == 'Y') {
            System.out.print("Inserta día: ");
            dia = sc.nextInt();
            System.out.print("Inserta temperatura: ");
            temperatura = sc.nextInt();
            if (enero.getTemperatura(dia) == -1)
                System.out.println("Error de entrada");
            else
                enero.setTemperatura(dia, temperatura);
            System.out.print("Continuar (Y/N)? ");
            respuesta = sc.next();
        }
        System.out.println(enero);
    }
}
