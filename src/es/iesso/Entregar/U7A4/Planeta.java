package es.iesso.Entregar.U7A4;

public class Planeta extends CuerpoCeleste {

        public Planeta(String nombre, double perOrb) {
                super(nombre, perOrb, Tipo.PLANETA);
        }

        @Override
        public boolean addSatelite(CuerpoCeleste s) {
                if(s != null && s.getTipoCuerpo().equals(Tipo.LUNA)) {
                        getSatelites().add(s);
                        return true;
                }
                else
                        return false;
        }
}
