package es.iesso;

/**
 * Clase abstracta que contiene métodos para imprimir por consola.
 *
 * @author Iñaki Bazán Fernández
 *
 * @version 0.4 (noviembre de 2025)
 * @since 0.1 (septiembre de 2025)
 */
public abstract class Impresora {

    /**
     * Imprime un objeto usando su propio método {@link #toString toString}.
     * @param obj Objeto a representar en formato {@code String}.
     */
    public static void impr(Object obj) {
        System.out.print(obj.toString());
    }

    /**
     * Imprime un objeto usando su propio método {@link #toString toString},
     * y después hace un salto de línea.
     * @param obj Objeto a representar en formato {@code String}.
     */
    public static void imprln(Object obj) {
        System.out.println(obj.toString());
    }

    /**
     * Imprime un salto de línea y después un objeto usando su propio
     * método {@link #toString toString}.
     * @param obj Objeto a representar en formato {@code String}.
     */
    public static void lnimpr(Object obj) {
        System.out.println();
        System.out.print(obj.toString());
    }

    /**
     * Imprime un {@code array} de objetos usando sus propios
     * métodos {@link #toString toString}.
     * @param objA Array de objetos, representándose cada elemento
     * en formato {@code String}.
     */
    public static void imprar(Object[] objA) {
        for(Object o : objA)
            System.out.println(o.toString());
    }

    /**
     * Imprime un {@code array} de tipo {@code int}.
     * @param intA Array de tipo {@code int}.
     */
    public static void imprar(int[] intA) {
        impr("[");
        for(int i = 0; i < intA.length; i++) {
            System.out.print(intA[i]);
            if(i < intA.length - 1)
                impr(" ");
        }
        impr("]");
    }
    /**
     * Imprime un {@code array} de tipo {@code double}.
     * @param doubleA Array de tipo {@code double}.
     */
    public static void imprar(double[] doubleA) {
        impr("[");
        for(int i = 0; i < doubleA.length; i++) {
            System.out.print(doubleA[i]);
            if(i < doubleA.length - 1)
                impr(" ");
        }
        impr("]");
    }

    /**
     * Imprime un {@code array} de tipo {@code int} y después
     * un salto de línea.
     * @param intA Array de tipo {@code int}.
     */
    public static void imprarln(int[] intA) {
        imprar(intA);
        System.out.println();
    }

    /**
     * Imprime un {@code array} de tipo {@code double} y después
     * un salto de línea.
     * @param doubleA Array de tipo {@code double}.
     */
    public static void imprarln(double[] doubleA) {
        imprar(doubleA);
        System.out.println();
    }

    /**
     * Imprime un objeto usando su propio método {@link #toString toString},
     * y después hace un subrayado del tamaño del texto y un salto de línea.
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

    /** Imprime una regla horizontal (de 16 caracteres por defecto). */
    public static void hrule() {
        System.out.println();
        System.out.println("----------------");
        System.out.println();
    }

    /** Imprime una regla horizontal corta (de 3 caracteres por defecto). */
    public static void shrule() {
        System.out.println();
        System.out.println("---");
        System.out.println();
    }

    /**
     * Imprime una regla horizontal de tamaño n.
     * @param n Nº de caracteres '-' que se imprimirá como regla horizontal.
     */
    public static void hrule(int n) {
        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();
    }

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
        double nD = num;
        return roundTxt(nD, nDec);
    }

    /**
     * Redondea un decimal {@code double} y lo devuelve como {@code String}.
     * @param num Número decimal a redondear.
     * @param nDec N.º de cifras decimales a las que redondear.
     *             Imprime las cifras significativas especificadas.
     * @return Valor decimal redondeado en formato {@code String}.
     */
    public static String roundTxt(double num, int nDec) {
        int posP;
        int nCeros;
        int nDecR = 0;
        String ceros;
        String txtR;
        String txt = Double.toString(num);

        posP = txt.indexOf('.');
        for(int i = posP + 1; i < txt.length(); i++)
            nDecR++;
        if(nDec < nDecR)
            txtR = txt.substring(0, posP + nDec + 1);
        else if(nDec > nDecR) {
            nCeros = nDec - nDecR;
            ceros = "";
            for(int i = 1; i <= nCeros; i++)
                ceros = ceros.concat("0");
            txtR = txt.concat(ceros);
        } else
            txtR = txt;
        return txtR;
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