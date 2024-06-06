package org.Logica;
/**
 * Subclase Moneda100 que sirve meramente para devolver su valor.
 */
public class Moneda100 extends Moneda {
    /** Constructor que por defecto solo inicializa*/
    public Moneda100() {
        super();
        this.serie = serie + "100";
    }

    /**
     * Metodo que devuelve el valor de la moneda
     * @return devuelve 100
     */
    public int getValor() {
        return 100;
    }
}
