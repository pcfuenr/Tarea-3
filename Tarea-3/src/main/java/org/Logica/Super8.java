package org.Logica;

/**
 * Subclase que entrega el nombre del producto elegido por el comprador
 */
public class Super8 extends Dulce{
    /** Constructor que por defecto solo inicializa*/
    public Super8() {
        super();
    }
    /** Metodo que entrega el nombre del producto consumido
     * @return Nombre del producto entregado
     * */
    public String consumir() {
        return "super8";
    }
}
