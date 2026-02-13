package es.iesso.Entregar.U7A1;

import java.util.ArrayList;

public class TelefonoMovil {

    private static final int NOT_FOUND = -1;

    private String miNumero;
    private final ArrayList<Contacto> misContactos;

    public TelefonoMovil(String miNumero) {
        this.miNumero = miNumero;
        misContactos = new ArrayList<>();
    }

    public String getMiNumero() {
        return miNumero;
    }

    public void setMiNumero(String miNumero) {
        this.miNumero = miNumero;
    }

    public boolean estaVacio() {
        return misContactos.isEmpty();
    }

    public int getSize() {
        return misContactos.size();
    }

    public boolean addContacto(Contacto c) {
        if(noExisteContacto(c)) {
            misContactos.add(c);
            return true;
        }
        else
            return false;
    }

    public boolean addContacto(String nombre, String numero) {
        Contacto newC = Contacto.crearContacto(nombre, numero);
        if(noExisteContacto(newC)) {
            misContactos.add(newC);
            return true;
        }
        else
            return false;
    }

    public boolean updateContacto(Contacto oldC, Contacto newC) {
        if(existeContacto(oldC)) {
            borrarContacto(oldC);
            if(noExisteContacto(newC)) {
                addContacto(newC);
                return true;
            }
        }
        return false;
    }

    public boolean borrarContacto(Contacto c) {
        if(existeContacto(c)) {
            misContactos.remove(this.indexOf(c));
            return true;
        }
        else
            return false;
    }

    public int indexOf(Contacto c) {
        for(Contacto i : misContactos)
            if(i.esIgual(c))
                return misContactos.indexOf(i);
        return NOT_FOUND;
    }

    public boolean existeContacto(Contacto c) {
        return (buscarContacto(c) != NOT_FOUND);
    }

    public boolean noExisteContacto(Contacto c) {
        return (buscarContacto(c) == NOT_FOUND);
    }

    public Contacto queryContacto(String nombre) {
        for(Contacto c : misContactos)
            if(c.tieneNombre(nombre))
                return c;
        return null;

        // Implementación con "for" clásico
//        for(int i = 0; i < misContactos.size(); i++) {
//            cL = misContactos.get(i);
//            if(cL.tieneNombre(nombre))
//                return cL;
//        }
    }

    public Contacto buscarContacto(int index) {
        return misContactos.get(index);
    }

    public int buscarContacto(Contacto c) {
        int cIndex = NOT_FOUND;
        Contacto cL;

        // Implementación con enhanced "for"
//        for(Contacto c : misContactos) {
//            if(c.tieneMismoNombre(newC) || c.tieneMismoNumero(newC))
//                return misContactos.indexOf(c);

        for(int i = 0; i < misContactos.size(); i++) {
            cL = misContactos.get(i);
            if(cL.esIgual(c))
                cIndex = i;
        }
        return cIndex;
    }

    public ArrayList<String> toArrayListString() {
        ArrayList<String> l = new ArrayList<>();
        for(Contacto c : misContactos)
            l.add((misContactos.indexOf(c) + 1) + ". " + c.toString());
        return l;
    }

    @Override
    public String toString() {
        String s = "";
        ArrayList<String> l = this.toArrayListString();
        for(String li : l)
            s = s.concat(li) + "\n";
        return s;
    }

    public void imprContactos() {
        System.out.print(this);
    }
}
