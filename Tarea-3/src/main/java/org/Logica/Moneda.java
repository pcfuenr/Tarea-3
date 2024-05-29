package org.Logica;

/**
 * Superclase Moneda para todas las monedas, ademas implementa la interfaz comparable.
 */
public abstract class Moneda implements Comparable<Moneda> {
    /** Número de serie */
    protected String serie;
    /** Constructor */
    public Moneda() {
    }
    /** Metodo abstracto que devuelve el valor de la moneda*/
    public abstract int getValor();

    /**
     * Método que devuelve el valor de la moneda a modo de número de serie
     * @return número de serie.
     */
    public String getSerie() {
        return this.serie;
    }

    /**
     * Metodo que sirve para medir si se puede comprar un producto o no,
     * @param v El precio del producto.
     * @return un numero positivo negativo o 0, que en el expendedor evalúa.
     */
    @Override
    public int compareTo(Moneda v){
        if (this.getValor() > v.getValor()) {
            return 1;
        } else if (this.getValor() < v.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
}
