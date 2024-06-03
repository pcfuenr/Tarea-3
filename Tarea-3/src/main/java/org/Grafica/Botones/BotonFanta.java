package org.Grafica.Botones;
import org.Grafica.PantallaExpendedor;
import javax.swing.*;

public class BotonFanta {
    private JButton insertarMoneda;
    public BotonFanta(PantallaExpendedor p) {
        insertarMoneda=new JButton("2");
        insertarMoneda.setBounds(385,228,50,72);
        p.setLayout(null);
        p.add(insertarMoneda);
    }
    public JButton getInsertarMoneda() {
        return insertarMoneda;
    }
}
