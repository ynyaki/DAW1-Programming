package es.iesso.Entregar.U6A3E4;

public class MainPintura {

    public static void main(String[] args) {
        Pintura p = new Pintura(250);
        Esfera e = new Esfera("Esfera", 15);
        Rectangulo r = new Rectangulo("Rectángulo", 20, 35);
        Cilindro c = new Cilindro("Cilindro", 10, 30);

        System.out.println();
        System.out.println();

        System.out.println(e);
        System.out.println(r);
        System.out.println(c);

        System.out.println("---");
        System.out.println();

        System.out.println(p.toString(e));
        System.out.println();

        System.out.println(p.toString(r));
        System.out.println();

        System.out.println(p.toString(c));
        System.out.println();
    }
}
