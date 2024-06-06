package org.Grafica.Botones;
import org.Grafica.PantallaExpendedor;
import javax.swing.*;

public abstract class Boton {
    protected JButton boton;
    protected PantallaExpendedor pantallaExpendedor;
    public Boton(PantallaExpendedor p, String nombre, int x, int y, int ancho, int alto) {
        boton = new JButton(nombre);
        boton.setBounds(x, y, ancho, alto);
        p.setLayout(null);
        p.add(boton);
        pantallaExpendedor=p;
    }
    public JButton getBoton() {
        return boton;
    }
    public abstract void botonPresionado();
}
