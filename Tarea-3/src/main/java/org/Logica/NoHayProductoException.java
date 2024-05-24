package org.Logica;

/**
 * Excepción que ocurre cuando se quiere comprar un producto pero ya no queda ninguno disponible
 * o bien cuando se ingresa un numero que no corresponde a ningun producto en el selector de la expendedora.
 */

public class NoHayProductoException extends Exception{
    /**
     * Constructor que recibe el error especificado y añade el mensaje del error
     * @param errorMsg mensaje que detalla el error
     */
    public NoHayProductoException(String errorMsg) {
        super(errorMsg);
    }
}
