package org.Grafica.Botones;
import org.Grafica.PantallaExpendedor;
import javax.swing.*;

public class BotonSprite {
    private JButton insertarMoneda;
    public BotonSprite(PantallaExpendedor p) {
        insertarMoneda=new JButton("1");
        insertarMoneda.setBounds(442,156,50,72);
        p.setLayout(null);
        p.add(insertarMoneda);
    }
    public JButton getInsertarMoneda() {
        return insertarMoneda;
    }
}
