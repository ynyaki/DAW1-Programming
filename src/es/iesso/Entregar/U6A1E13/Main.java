package es.iesso.Entregar.U6A1E13;

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
        System.out.println("Círculo de radio " + format(c.getRadio(), 3) + ":");
        System.out.println("- Perímetro: " + format(c.getPerimetro(), 3));
        System.out.println("- Área: " + format(c.getArea(), 3));
        System.out.println();
    }

    private static void imprCilindro(Cilindro c) {
        System.out.println("Cilindro de radio " + c.getRadio()
                + " y altura " + format(c.getAltura(), 3) + ":");
        System.out.println("- Área del círculo del cilindro: " + format(c.getArea(), 3));
        System.out.println("- Área: " + format(c.getArea(), 3));
        System.out.println("- Volumen: " + format(c.getVolumen(), 3));
        System.out.println();
    }

    private static String format(double num, int nDec) {
        if(num == (long) num)
            return String.format("%d", (long) roundN(num, nDec));
        else
            return String.format("%s", roundN(num, nDec));
    }

    private static double roundN(double num, int nDec) {
        return Math.round(num * Math.pow(10, nDec)) / Math.pow(10, nDec);
    }
}
