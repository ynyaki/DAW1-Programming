package es.iesso.Entregar.U6A2E3;

public class MainEncapsulacion {

    public static void main(String[] args) {
        Impresora pr1 = new Impresora("Expression Home XP-2200", "Epson",
                true, 1526, 55.24);
        Impresora pr2 = new Impresora("EcoTank ET-1810", "Epson",
                false, 32);
        Impresora pr3 = new Impresora("DeskJet", null, false, 95.345);
        Impresora pr4 = new Impresora("", "Canon", false);

        System.out.println();
        System.out.println();
        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);
        System.out.println(pr4);
    }
}
