package org.Logica;
/**
 * Subclase Moneda800 que sirve meramente para devolver su valor.
 */
public class Moneda800 extends Moneda {
    /** Constructor que por defecto solo inicializa*/
    public Moneda800() {
        super();
        this.serie = serie + "800";
    }

    /**
     * Metodo que devuelve el valor de la moneda
     * @return devuelve 800
     */
    public int getValor() {
        return 800;
    }
}
