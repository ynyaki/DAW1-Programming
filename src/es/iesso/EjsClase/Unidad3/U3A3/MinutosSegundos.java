package es.iesso.EjsClase.Unidad3.U3A3;

public abstract class MinutosSegundos {

    private static final String VAL_INV = "Valor inválido";

    public static String obtenerMensajeDuracion(int min, int s) {
        int minRest;
        int h;
        if(!validarMin(min) || !validarS(s))
            return VAL_INV;
        minRest = min % 60;
        h = min / 60;
        return (h + "h " + minRest + "m " + s + "s");
    }

    public static String obtenerMensajeDuracion(int s) {
        int sRest;
        int min;
        int minRest;
        int h;
        min = s / 60;
        sRest = s % 60;
        if(!validarMin(min) || !validarS(sRest))
            return VAL_INV;
        minRest = min % 60;
        h = min / 60;
        return (h + "h " + minRest + "m " + sRest + "s");
    }

    private static boolean validarMin(int min) {
        return (min >= 0);
    }

    private static boolean validarS(int s) {
        return (s >= 0 && s < 60);
    }
}
