package es.iesso;

/**
 * Clase abstracta que contiene métodos para imprimir por consola.
 *
 * @author Iñaki Bazán Fernández
 *
 * @version 0.1 (septiembre de 2025)
 * @since 0.1 (septiembre de 2025)
 */
public abstract class Impresora {

    /**
     * Imprime un objeto usando su propio {@link #toString toString}.
     * @param obj Objeto a representar en formato {@code String}.
     */
    public static void impr(Object obj) {
        System.out.print(obj.toString());
    }

    /**
     * Imprime un objeto usando su propio {@link #toString toString} y
     * después hace un salto de línea.
     * @param obj Objeto a representar en formato {@code String}.
     */
    public static void imprln(Object obj) {
        System.out.println(obj.toString());
    }

    /**
     * Imprime un salto de línea y después un objeto usando su propio
     * {@link #toString toString}.
     * @param obj Objeto a representar en formato {@code String}.
     */
    public static void lnimpr(Object obj) {
        System.out.println();
        System.out.print(obj.toString());
    }

    /**
     * Imprime un objeto usando su propio {@link #toString toString}, y
     * después hace un subrayado del tamaño del texto y un salto de línea.
     * @param obj Objeto a representar en formato {@code String}.
     */
    public static void imprttl(Object obj) {
        System.out.println(obj.toString());

        for(int i = 0; i < obj.toString().length(); i++) {
            System.out.print('-');
        }
        System.out.println();
        System.out.println();
    }

    /** Imprime un salto de línea. */
    public static void linea() {
        System.out.println();
    }

    /**
     * Imprime n saltos de línea.
     * @param n Número de saltos de línea.
     */
    public static void lineas(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    /*
     * Redondea un número decimal y lo devuelve como {@code String}.
     * @param num Número decimal a redondear.
     * @param nDec N.º de cifras decimales a las que redondear.
     *             Si es menor o igual a 0, se devuelve el número
     *             en texto sin cifras decimales.
     * @return Valor decimal redondeado en formato {@code String}.
     */

    /**
     * Formatea un decimal {@code float}, eliminando los ceros sobrantes
     * (incluyendo el punto decimal si el número es equivalente
     * a un entero).
     * @param num Número decimal a formatear.
     * @return Valor del número sin ceros sobrantes.
     */
    public static String format(float num) {
        if(num == (long) num)
            return String.format("%d", (long) num);
        else
            return String.format("%s", num);
    }

    /**
     * Formatea un decimal {@code double}, eliminando los ceros sobrantes
     * (incluyendo el punto decimal si el número es equivalente
     * a un entero).
     * @param num Número decimal a formatear.
     * @return Valor del número sin ceros sobrantes.
     */
    public static String format(double num) {
        if(num == (long) num)
            return String.format("%d", (long) num);
        else
            return String.format("%s", num);
    }

    /**
     * Redondea un decimal {@code float} y lo devuelve como {@code String}.
     * @param num Número decimal a redondear.
     * @param nDec N.º de cifras decimales a las que redondear.
     *             Imprime las cifras significativas especificadas.
     * @return Valor decimal redondeado en formato {@code String}.
     */
    public static String roundTxt(float num, int nDec) {
        return Float.toString(roundN(num, nDec));
    }

    /**
     * Redondea un decimal {@code double} y lo devuelve como {@code String}.
     * @param num Número decimal a redondear.
     * @param nDec N.º de cifras decimales a las que redondear.
     *             Imprime las cifras significativas especificadas.
     * @return Valor decimal redondeado en formato {@code String}.
     */
    public static String roundTxt(double num, int nDec) {
        return Double.toString(roundN(num, nDec));
    }

    /**
     * Redondea un número decimal y lo devuelve como {@code float}.
     * @param num Número decimal a redondear.
     * @param nDec N.º de cifras decimales a las que redondear.
     * @return Valor decimal redondeado.
     */
    public static float roundN(float num, int nDec) {
        return (float) (Math.round(num * Math.pow(10, nDec)) / Math.pow(10, nDec));
    }

    /**
     * Redondea un número decimal y lo devuelve como {@code double}.
     * @param num Número decimal a redondear.
     * @param nDec N.º de cifras decimales a las que redondear.
     * @return Valor decimal redondeado.
     */
    public static double roundN(double num, int nDec) {
        return Math.round(num * Math.pow(10, nDec)) / Math.pow(10, nDec);
    }
}