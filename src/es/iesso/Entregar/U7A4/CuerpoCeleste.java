package es.iesso.Entregar.U7A4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class CuerpoCeleste {

        public enum Tipo {
                ESTRELLA,
                PLANETA,
                PLANETA_ENANO,
                LUNA,
                COMETA,
                ASTEROIDE
        }

        private final String nombre;
        private final double perOrb;
        private final Set<CuerpoCeleste> satelites;
        private final Tipo tipoCuerpo;

        public CuerpoCeleste(String nombre, double perOrb, Tipo tipoCuerpo) {
                this.nombre = nombre;
                this.perOrb = perOrb;
                satelites = new HashSet<>();
                this.tipoCuerpo = tipoCuerpo;
        }

        public String getNombre() {
                return nombre;
        }

        public double getPerOrb() {
                return perOrb;
        }

        public Set<CuerpoCeleste> getSatelites() {
                return new HashSet<>(satelites);
        }

        public boolean addSatelite(CuerpoCeleste cc) {
                return satelites.add(cc);
        }

        public Tipo getTipoCuerpo() {
                return tipoCuerpo;
        }

        public boolean equals(CuerpoCeleste cc) {
                boolean mismoNombre;
                boolean mismoPerOrb;
                mismoNombre = this.nombre.equals(cc.nombre);
                mismoPerOrb = this.perOrb == cc.perOrb;
                return (mismoNombre && mismoPerOrb);
        }

        @Override
        public String toString() {
                return nombre + ": "+ getTipoCuerpo().toString().toLowerCase()
                                + ", " + perOrb;
        }

        @Override
        public int hashCode() {
                return Objects.hash(nombre, tipoCuerpo, new Random().nextInt(10, 99));
        }
}
