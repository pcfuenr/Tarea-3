package org.Grafica;
import javax.swing.*;

/**
 * Maneja la ventana principal de la interfaz
 */
public class MiVentana extends JFrame {
    /** Pantalla principal */
    private PantallaPrincipal pantalla;

    /**
     * Constructor que asigna la pantalla, el título, el tamaño y las necesidades básicas de una ventana
     */
    public MiVentana() {
        super();
        pantalla= new PantallaPrincipal();
        this.setTitle("Expendedor");
        setSize(1600, 900);
        add(pantalla);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}