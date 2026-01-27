package es.iesso.Entregar.U6A13;

public class Main {

    public static void main(String[] args) {
        Circulo cr1 = new Circulo(5);
        Cilindro cld1 = new Cilindro(5, 10);

        System.out.println();
        System.out.println("Prueba de clases Círculo y Cilindro".toUpperCase());
        System.out.println();
        imprCirculo(cr1);
        imprCilindro(cld1);
    }

    private static void imprCirculo(Circulo c) {
        System.out.println("Círculo de radio " + c.getRadio() + ":");
        System.out.println("- Perímetro: " + c.getPerimetro());
        System.out.println("- Área: " + c.getArea());
        System.out.println();
    }

    private static void imprCilindro(Cilindro c) {
        System.out.println("Cilindro de radio " + c.getRadio()
                + " y altura " + c.getAltura() + ":");
        System.out.println("- Área del círculo: " + c.getAreaCirculo());
        System.out.println("- Área: " + c.getArea());
        System.out.println("- Volumen: " + c.getVolumen());
        System.out.println();
    }
}
