package es.iesso.Entregar.U7A3;

import java.util.HashMap;
import java.util.Map;

public class Ubicacion {

    int id;
    String desc;
    Map<String, Integer> exits;

    public Ubicacion(int id, String desc) {
        this.id = id;
        this.desc = desc;
        exits = new HashMap<>();
    }

    public int getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    public void addExit(String dir, int idUbic) {
        exits.put(dir, idUbic);
    }
}
