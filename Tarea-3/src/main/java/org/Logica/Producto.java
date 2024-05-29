package org.Logica;

/**
 * Superclase para todos los tipos de productos
 */
public abstract class Producto {
    /** Número de serie */
    private String serie;
    /** Constructor que por defecto solo inicializa*/
    public Producto(String serie) {
        this.serie = serie;
    }
    /** Método que devuelve la serie del objeto creado
     * @return Número de serie
     */
    public String getSerie() {
        return this.serie;
    }
    /** Método abstracto que despues sirve para devolver que producto se ha consumido/devuelto */
    public abstract String consumir();
}
