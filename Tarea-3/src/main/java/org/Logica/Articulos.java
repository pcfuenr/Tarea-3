package org.Logica;
/**
 * Un enum donde se guardan los tipos de productos y sirve para retornar los precios de estos mismos.
 */
public enum Articulos{
    /** Precio CocaCola */
    COCA(900),
    /** Precio Sprite */
    SPRITE(800),
    /** Precio Fanta */
    FANTA(600),
    /** Precio Snicker */
    SNICKERS(400),
    /** Precio Super8 */
    SUPER8(300);
    /** Entero para almacenar el precio del producto pedido */
    private final int precio;

    /**
     * Metodo que guarda el precio del producto solicitado
     * @param x guarda el precio del producto solicitado
     */
    Articulos(int x){
        this.precio=x;
    }

    /**
     * Metodo que dependiendo del producto solicitado crea una moneda del precio solicitado
     * @return objeto moneda que representa el precio del producto
     */
    public Moneda getDiferencia(){
        if(precio==900){
            return new Moneda900();
        }
        else if(precio ==800){
            return new Moneda800();
        }
        else if(precio ==600){
            return new Moneda600();
        }
        else if(precio ==400){
            return new Moneda400();
        }
        else{
            return new Moneda300();
        }
    }

    /**
     * Metodo que devuelve el precio del producto
     * @return entero con el precio.
     */
    public int getPrecio(){
        return precio;
    }
}
