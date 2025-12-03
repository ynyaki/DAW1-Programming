package es.iesso.EjsClase.Unidad4.U4A3;

import java.util.InputMismatchException;

/**
 * Clase abstracta con métodos que manejan, crean y cambian arrays de enteros.
 * @author Iñaki Bazán
 * @version 1.0 (diciembre de 2025)
 */
public abstract class ArrayOperations {

    /**
     * Imprime el array pasado por parámetro, entre corchetes y con comas
     * para separar los elementos.
     * @param array Array a imprimir.
     */
    public static void print(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }

    /**
     * Revierte el orden de todos los elementos del array, cambiando
     * el primero por el último, el segundo por el penúltimo, etc.
     * @param array Array a revertir.
     */
    public static void reverse(int[] array) {
        int j = array.length - 1;
        for(int i = 0; i < j; i++) {
            swap(array, i, j);
            j--;
        }
    }

    /**
     * Devuelve el valor máximo dentro del array.
     * @param array Array del que extraer el máximo.
     * @return Valor más alto del array.
     */
    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int n : array)
            if(max < n)
                max = n;
        return max;
    }

    /**
     * Devuelve el valor mínimo dentro del array.
     * @param array Array del que extraer el mínimo.
     * @return Valor más bajo del array.
     */
    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int n : array)
            if(min > n)
                min = n;
        return min;
    }

    /**
     * Devuelve la suma de todos los valores del array.
     * @param array Array con los valores a sumar.
     * @return Suma del array.
     */
    public static int sum(int[] array) {
        int sum = 0;
        for(int n : array)
            sum += n;
        return sum;
    }

    /**
     * Comprueba si dos arrays son iguales, es decir, con el mismo valor en
     * cada posición.
     * @param a Array A.
     * @param b Array B.
     * @return Verdadero o falso según sean o no iguales.
     */
    public static boolean equals(int[] a, int[] b) {
        int nIguales = 0;
        if(a.length != b.length)
            return false;
        for(int i = 0; i < a.length; i++)
            if(a[i] == b[i])
                nIguales++;
        return (nIguales == a.length);
    }

    /**
     * Comprueba si dos arrays son iguales sin tener en cuenta el orden,
     * es decir, si tienen los mismos valores aunque sea en distintas
     * posiciones. Su funcionamiento es similar a <code>equals</code>
     * con ambos arrays ordenados.
     * @param a Array A.
     * @param b Array B.
     * @return Verdadero o falso según sean o no iguales sin contar el orden.
     */
    public static boolean equalsWithoutOrder(int[] a, int[] b) {
        int nIguales = 0;
        int[] oa;
        int[] ob;
        if(a.length != b.length)
            return false;
        oa = copy(a);
        ob = copy(b);
        sort(oa);
        sort(oa);
        for(int i = 0; i < a.length; i++)
            if(oa[i] == ob[i])
                nIguales++;
        return (nIguales == a.length);
    }

    /**
     * Comprueba que el array A esté contenido dentro del array B, es decir,
     * que todos los valores de A estén dentro de B.
     * @param a Array A, del que se buscarán sus valores en el array B.
     * @param b Array B, del que se comprobará que contenga todos los valores
     *          del array A.
     * @return Si es verdadero o falso que A está contenido en B.
     */
    public static boolean isArrayOn(int[] a, int[] b) {
        int nConten = 0;
        int[] oa;
        int[] ob;
        if(a.length > b.length)
            return false;
        oa = copy(a);
        ob = copy(b);
        sort(oa);
        sort(oa);
        for(int i = 0; i < a.length; i++)
            if(oa[i] == ob[i])
                nConten++;
        return (nConten == a.length);
    }

    /**
     * Ordena el array pasado por parámetro en orden ascendente.
     * @param array Array a ordenar.
     */
    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++)
            for(int j = i; j < array.length; j++)
                if(array[i] > array[j])
                    swap(array, i, j);
    }

    /**
     * Crea y devuelve una copia del array pasado por parámetro.
     * @param array Array a copiar.
     * @return Nueva copia del array.
     */
    public static int[] copy(int[] array) {
        int[] c = new int[array.length];
        for(int i = 0; i < array.length; i++)
            c[i] = array[i];
        return c;
    }

    /**
     * Borra los números impares del array, es decir, cambia su valor a 0.
     * @param array Array a modificar.
     */
    public static void removeOddNumbers(int[] array) {
        for(int i = 0; i < array.length; i++)
            if(array[i] % 2 != 0)
                array[i] = 0;
    }

    /**
     * Imprime un array de enteros en el rango [<code>start</code>,
     * <code>end</code>].
     * @param array Array a imprimir.
     * @param start Posición del primer valor.
     * @param end Posición del último valor.
     */
    public static void printRange(int[] array, int start, int end) {
        if(start < 0 || start >= array.length)
            throw(new ArrayIndexOutOfBoundsException(
                    "Posición inicial " + end + " no encontrada en el array"));
        else if(end < 0 || end >= array.length)
            throw(new ArrayIndexOutOfBoundsException(
                    "Posición final " + end + " no encontrada en el array"));
        else if(start > end)
            throw(new InputMismatchException(
                    "La posición inicial es mayor que la final"));

        System.out.print("[");
        for(int i = start; i <= end; i++) {
            System.out.print(array[i]);
            if(i < end)
                System.out.print(", ");
        }
        System.out.print("]");
    }

    /**
     * Borra todos los números enteros del array con un solo dígito, es decir,
     * aquellos comprendidos entre -9 y 9, devolviendo un nuevo array sin
     * esos números.
     * @param array Array del que se creará una copia para modificar.
     * @return Nuevo array con los valores de un dígito borrados.
     */
    public static int[] deleteOneDigitNumbers(int[] array) {
        int[] a;
        int n1d = 0;
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] / 10 != 0)
                n1d++;
        }
        a = new int[n1d];
        for(int i = 0; i < array.length; i++) {
            if(array[i] / 10 != 0) {
                a[j] = array[i];
                j++;
            }
        }
        return a;
    }

    /**
     * Busca el primer valor igual a <code>n</code> dentro del array pasado
     * como parámetro. Si no lo encuentra, devuelve <code>-1</code>.
     * @param array Array en el que buscar <code>n</code>.
     * @param n Valor a buscar en el array.
     * @return Posición del número buscado (<code>-1</code> si no es
     * encontrado).
     */
    public static int searchFirst(int[] array, int n) {
        for(int i = 0; i < array.length; i++)
            if(array[i] == n)
                return i;
        return -1;
    }

    private static void swap(int[] array, int a, int b) {
        int x = array[a];
        array[a] = array[b];
        array[b] = x;
    }
}