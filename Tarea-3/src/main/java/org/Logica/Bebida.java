package org.Logica;
/**
 * Superclase y Subclase de producto y los productos que son bebidas respectivamente.
 */
public abstract class Bebida extends Producto {
    /** Constructor que por defecto solo inicializa*/
    public Bebida(String s) {
        super(s);
    }
    /** Metodo abstracto que se implementa en las subclases */
    public abstract String consumir();
}