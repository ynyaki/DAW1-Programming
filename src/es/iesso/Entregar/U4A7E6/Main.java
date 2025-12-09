package es.iesso.Entregar.U4A7E6;

/**
 * Clase Main (menú principal) perteneciente a la entrega del
 * Ejercicio 6 de la Actividad 7 de la Unidad 4 de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public class Main {

    public static void main(String[] args) {
        EntradaTelefono eBuscada;
        String n1 = "Pancracio Bermúdez";
        String n2 = "Jesús Jones";
        String n3 = "Martín Martínez";
        String n4 = "Patricia Marti";
        String n5 = "Carmen Jedet";
        EntradaTelefono e1 = new EntradaTelefono(123987456, n1);
        EntradaTelefono e2 = new EntradaTelefono(749246781, n2);
        EntradaTelefono e3 = new EntradaTelefono(903218566, n3);
        EntradaTelefono e4 = new EntradaTelefono(738267412, n4);
        EntradaTelefono e5 = new EntradaTelefono(163789403, n5);
        EntradaTelefono[] listaTlf = {e1, e2, e3, e4, e5};
        GuiaTelefonica guia = new GuiaTelefonica(listaTlf);

        System.out.println();
        System.out.println("Buscar nombre en la guía: \"Patricia Marti\"");
        eBuscada = guia.buscarEntradaPorNombre("Patricia Marti");
        if(eBuscada == null)
            System.out.println("La entrada buscada no existe en la guía.");
        else
            System.out.println("Número encontrado: " + eBuscada.getNumero());
    }
}
