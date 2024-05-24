package org.Logica;

/**
 * Excepción que ocurre cuando la moneda no alcanza para comprar determinado producto.
 */
public class PagoInsuficienteException extends Exception{
    /**
     * Constructor que recibe el error especificado y añade el mensaje del error
     * @param errorMsg mensaje que detalla el error
     */
    public PagoInsuficienteException(String errorMsg) {
        super(errorMsg);
    }
}
