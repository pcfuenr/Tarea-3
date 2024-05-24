package org.Logica;
/**
 * Subclase Moneda500 que sirve meramente para devolver su valor.
 */
public class Moneda500 extends Moneda {
    /** Constructor que por defecto solo inicializa*/
    public Moneda500() {
        super();
    }

    /**
     * Metodo que devuelve el valor de la moneda
     * @return devuelve 500
     */
    public int getValor() {
        return 500;
    }
}
