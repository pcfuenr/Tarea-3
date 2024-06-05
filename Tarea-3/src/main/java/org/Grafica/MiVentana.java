package org.Grafica;
import javax.swing.*;

public class MiVentana extends JFrame {
    private PantallaPrincipal pantalla;

    public MiVentana() {
        super();
        pantalla= new PantallaPrincipal();
        this.setTitle("Expendedor");
        setSize(1000, 900);
        add(pantalla);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}