package es.iesso.Entregar.U4A7E6;

/**
 * Clase GuiaTelefonica, perteneciente a la entrega del
 * Ejercicio 6 de la Actividad 7 de la Unidad 4 de Programación,
 * por Iñaki Bazán Fernández,
 * DAW (1º J), IES Severo Ochoa, Elche.
 */
public class GuiaTelefonica {

    private EntradaTelefono[] listaTlf;

    public GuiaTelefonica(EntradaTelefono[] listaTlf) {
        this.listaTlf = listaTlf;
    }

    public EntradaTelefono[] getListaTlf() {
        return listaTlf;
    }

    public void setListaTlf(EntradaTelefono[] listaTlf) {
        this.listaTlf = listaTlf;
    }

    public EntradaTelefono buscarEntradaPorNombre(String nombre) {
        for(EntradaTelefono e : listaTlf)
            if(e.getNombre().equals(nombre))
                return e;
        return null;
    }
}
