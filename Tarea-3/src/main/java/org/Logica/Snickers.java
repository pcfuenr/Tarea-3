package org.Logica;
/**
 * Subclase que entrega el nombre del producto elegido por el comprador
 */
public class Snickers extends Dulce{
    /** Constructor que por defecto solo inicializa*/
    public Snickers() {
        super();
    }
    /** Metodo que entrega el nombre del producto consumido
     * @return Nombre del producto entregado
     */
    public String consumir() {
        return "snickers";
    }
}
