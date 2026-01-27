package es.iesso.EjsClase.Unidad6.U6A2.U6A2E1;

public class Main {

    public static void main(String[] args) {
        Habitacion h = new Habitacion("Dormitorio de Pepa",
                new Pared("Norte"), new Pared("Sur"),
                new Pared("Este"), new Pared("Oeste"),
                new Techo(2, 999),
                new Cama("Minimalista", 4, 1, 2, 1),
                new Lampara("Lava", false, 10));

        h.getLampara().encender();
    }
}
