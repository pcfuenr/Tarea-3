package org.Logica;
/**
 * Subclase Moneda300 que sirve meramente para devolver su valor.
 */
public class Moneda300 extends Moneda {
    /** Constructor que por defecto solo inicializa*/
    public Moneda300() {
        super();
        this.serie = "$300";
    }

    /**
     * Metodo que devuelve el valor de la moneda
     * @return devuelve 300
     */
    public int getValor() {
        return 300;
    }
}
