package org.Grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {

    public MiVentana() {
        setTitle("Primer test");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton boton = new JButton("Presione");
        JTextField campoTexto = new JTextField(20);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoTexto.setText("Hola mundo");
            }
        });
        panel.add(boton);
        panel.add(campoTexto);
        add(panel);
    }

    public static void main(String[] args) {
        // Crea una instancia de la ventana
        MiVentana ventana = new MiVentana();

        // Haz visible la ventana
        ventana.setVisible(true);
    }
}