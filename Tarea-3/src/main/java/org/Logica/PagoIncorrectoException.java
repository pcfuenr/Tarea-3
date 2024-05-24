package org.Logica;

/**
 * Excepción que ocurre cuando a la Expendedora no se le entrega ninguna moneda
 */
public class PagoIncorrectoException extends Exception {
    /**
     * Constructor que recibe el error especificado y añade el mensaje del error
     * @param errorMsg mensaje que detalla el error
     */
    public PagoIncorrectoException(String errorMsg) {
        super(errorMsg);
    }
}