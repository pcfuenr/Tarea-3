package org.Grafica.Botones;
import org.Grafica.PantallaExpendedor;

import javax.swing.*;

public abstract class Boton {
    protected JButton insertarMoneda;
    public Boton(PantallaExpendedor p, String nombre, int x, int y, int ancho, int alto) {
        insertarMoneda=new JButton(nombre);
        insertarMoneda.setBounds(x, y, ancho, alto);
        p.setLayout(null);
        p.add(insertarMoneda);
    }
    public JButton getInsertarMoneda() {
        return insertarMoneda;
    }
}
