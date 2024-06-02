package org.Grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {
    private PantallaPrincipal pantalla;

    public MiVentana() {
        pantalla= new PantallaPrincipal();
        setSize(800, 800);
        add(pantalla);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}