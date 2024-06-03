package org.Grafica.Botones;

import org.Grafica.PantallaExpendedor;

import javax.swing.*;

public class BotonSnicker {
    private JButton insertarMoneda;
    public BotonSnicker(PantallaExpendedor p) {
        insertarMoneda=new JButton("3");
        insertarMoneda.setBounds(442,228,50,72);
        p.setLayout(null);
        p.add(insertarMoneda);
    }
    public JButton getInsertarMoneda() {
        return insertarMoneda;
    }
}
