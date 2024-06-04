package org.Grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {
    private PantallaPrincipal pantalla;

    public MiVentana() {
        pantalla= new PantallaPrincipal();
        this.setTitle("Expendedor");
        setSize(1000, 789);
        add(pantalla);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}