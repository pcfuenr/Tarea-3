package org.Logica;
/**
 * Subclase que entrega el nombre del producto elegido por el comprador
 */
public class CocaCola extends Bebida {
    /** Constructor que por defecto solo inicializa*/
    public CocaCola() {
        super();
    }
    /** Metodo que entrega el nombre del producto consumido
     * @return Nombre del producto entregado
     */
    public String consumir() {
        return "cocacola";
    }
}