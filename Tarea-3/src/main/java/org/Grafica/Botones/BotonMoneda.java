package org.Grafica.Botones;

import org.Grafica.PantallaExpendedor;

import javax.swing.*;

public class BotonMoneda {
    private JButton insertarMoneda;
    public BotonMoneda(PantallaExpendedor p) {
        insertarMoneda=new JButton("Pon Moneda");
        insertarMoneda.setBounds(382,407,111,33);
        p.setLayout(null);
        p.add(insertarMoneda);
    }
    public JButton getInsertarMoneda() {
        return insertarMoneda;
    }
}
