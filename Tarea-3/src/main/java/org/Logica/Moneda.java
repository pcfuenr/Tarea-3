package org.Logica;

/**
 * Superclase Moneda para todas las monedas, ademas implementa la interfaz comparable.
 */
public abstract class Moneda implements Comparable<Moneda> {
    /** Constructor */
    public Moneda() {}
    /** Metodo abstracto que devuelve el valor de la moneda*/
    public abstract int getValor();

    /**
     * Metodo que devuelve la dirección del objeto creado en este caso la moneda a modo de numero de serie
     * @return direccion/Numero de serie.
     */
    public Moneda getSerie() {
        return this;
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
