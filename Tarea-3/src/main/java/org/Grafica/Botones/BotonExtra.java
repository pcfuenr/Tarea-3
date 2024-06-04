package org.Grafica.Botones;
import org.Grafica.PantallaExpendedor;
import javax.swing.*;

public class BotonExtra {
    private JButton insertarMoneda;
    public BotonExtra(PantallaExpendedor p) {
        insertarMoneda=new JButton("5");
        insertarMoneda.setBounds(442,300,50,72);
        p.setLayout(null);
        p.add(insertarMoneda);
    }
    public JButton getInsertarMoneda() {
        return insertarMoneda;
    }
}
