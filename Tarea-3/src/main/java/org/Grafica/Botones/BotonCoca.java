package org.Grafica.Botones;
import org.Grafica.PantallaExpendedor;
import javax.swing.*;

public class BotonCoca {
    private JButton insertarMoneda;
    public BotonCoca(PantallaExpendedor p) {
        insertarMoneda=new JButton("0");
        insertarMoneda.setBounds(385,156,50,72);
        p.setLayout(null);
        p.add(insertarMoneda);
    }
    public JButton getInsertarMoneda() {
        return insertarMoneda;
    }
}
