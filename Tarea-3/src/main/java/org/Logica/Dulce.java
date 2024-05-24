package org.Logica;

/**
 * Superclase y Subclase de producto y los productos que son dulces respectivamente.
 */
public abstract class Dulce extends Producto {
    /** Constructor que por defecto solo inicializa*/
    public Dulce() {
        super();
    }
    /** Metodo abstracto que se implementa en las subclases */
    public abstract String consumir();
}