package org.Grafica.Botones;

import org.Grafica.PantallaExpendedor;

import javax.swing.*;

public class BotonSuper8{
    private JButton insertarMoneda;
    public BotonSuper8(PantallaExpendedor p) {
        insertarMoneda=new JButton("4");
        insertarMoneda.setBounds(386,300,50,72);
        p.setLayout(null);
        p.add(insertarMoneda);
    }
    public JButton getInsertarMoneda() {
        return insertarMoneda;
    }
}
