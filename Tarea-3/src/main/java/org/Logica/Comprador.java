package org.Logica;

import jdk.jfr.Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

/**
 * Comprador que utiliza el expendedor para comprar un producto
 */
public class Comprador implements ActionListener {
    /** String que indica que consumió */
    private String sonido = null;
    /** Int que guarda el vuelto */
    private int vuelto = 0;

    /**
     * Constructor, utiliza una moneda para comprar el producto indicado en el expendedor, luego recupera el vuelto y lo guarda
     * @param m moneda para comprar
     * @param cualProducto indica qué producto desea comprar
     * @param exp expendedor al que se le comprará
     * @throws PagoIncorrectoException propaga el throw de comprarProducto
     * @throws NoHayProductoException propaga el throw de comprarProducto
     * @throws PagoInsuficienteException propaga el throw de comprarProducto
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException  {
        exp.comprarProducto(m, cualProducto);
        Producto p = exp.getProducto();
        sonido = p.consumir();
        Moneda m1 = null;
        while (true) {
            m1 = exp.getVuelto();
            if (m1 != null) {
                vuelto = vuelto + m1.getValor();
            } else {
                break;
            }
        }
    }

    /**
     * Indica cuánto vuelto se recibió del expendedor
     * @return cantidad de vuelto
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * Indica qué producto se consumió
     * @return nombre del producto
     */
    public String queConsumiste() {
        return sonido;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("Comprar".equals(e.getActionCommand())){
            System.out.println("Se llamo a comprar");
        }
    }
}