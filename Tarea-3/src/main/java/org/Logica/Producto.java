package org.Logica;

/**
 * Superclase para todos los tipos de productos
 */
public abstract class Producto {
    /** Constructor que por defecto solo inicializa*/
    public Producto() {}
    /** Metodo que devuelve la direccion del objeto creado que corresponde a el numero de serie del producto.
     * @return Numero de serie(Direccion de memoria)
     */
    public Producto getSerie() {
        return this;
    }
    /** Metodo abstracto que despues sirve para devolver que producto se ha consumido/devuelto */
    public abstract String consumir();
}
