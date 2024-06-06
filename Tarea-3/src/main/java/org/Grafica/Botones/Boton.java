package org.Grafica.Botones;
import org.Grafica.PantallaExpendedor;
import javax.swing.*;

/**
 * Botón general para utilizar en botones especificos con herencia
 */
public abstract class Boton {
    /** Jbutton asociado a la clase */
    protected JButton boton;

    /**
     * Constructor que asigna el nombre, tamaño y posición del botón
     * @param p panel respecto al cual se pondrán los botones
     * @param nombre nombre del botón
     * @param x posición x del botón
     * @param y posición y del botón
     * @param ancho ancho del botón
     * @param alto alto del botón
     */
    public Boton(PantallaExpendedor p, String nombre, int x, int y, int ancho, int alto) {
        boton = new JButton(nombre);
        boton.setBounds(x, y, ancho, alto);
        p.setLayout(null);
        p.add(boton);
    }

    /**
     * Getter
     * @return botón
     */
    public JButton getBoton() {
        return boton;
    }
}
