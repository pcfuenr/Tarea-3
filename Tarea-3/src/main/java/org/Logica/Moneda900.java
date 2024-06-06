package org.Logica;
/**
 * Subclase Moneda900 que sirve meramente para devolver su valor.
 */
public class Moneda900 extends Moneda {
    /** Constructor que por defecto solo inicializa*/
    public Moneda900() {
        super();
        this.serie = serie + "900";
    }

    /**
     * Metodo que devuelve el valor de la moneda
     * @return devuelve 900
     */
    public int getValor() {
        return 900;
    }
}
