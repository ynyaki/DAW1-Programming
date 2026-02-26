package es.iesso.Entregar.U7A2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

        private String nombre;
        private String artista;
        private ArrayList<Cancion> canciones;

        public Album(String nombre, String artista) {
                this.nombre = nombre;
                this.artista = artista;
                canciones = new ArrayList<>();
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getArtista() {
                return artista;
        }

        public void setArtista(String artista) {
                this.artista = artista;
        }

        public boolean addCancion(String titulo, double duracion) {
                if(findCancion(titulo) != null)
                        return false;
                else
                        return canciones.add(new Cancion(titulo, duracion));
        }

        public boolean addToPlaylist(int num, LinkedList<Cancion> playlist) {
                Cancion cBusc = canciones.get(num);
                if(cBusc == null)
                        return false;
                else
                        return playlist.add(cBusc);
        }

        public boolean addToPlaylist(String titulo, LinkedList<Cancion> playlist) {
                Cancion cBusc = findCancion(titulo);
                if(cBusc == null)
                        return false;
                else
                        return playlist.add(cBusc);
        }

        private Cancion findCancion(String titulo) {
                Cancion cBusc = null;
                for(Cancion c : canciones)
                        if(c.getTitulo().equals(titulo))
                                cBusc = c;
                return cBusc;
        }

        public ArrayList<String> toArrayListString() {
                ArrayList<String> l = new ArrayList<>();
                for(Cancion cancion : canciones)
                        l.add(cancion.toString());
                return l;
        }
}
