package org.Grafica;

import org.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;

/**
 * Panel principal que maneja las otras dos pantallas
 */
public class PantallaPrincipal extends JPanel {
    /** Panel del expendedor */
    private PantallaExpendedor pantallaExpendedor;
    /** Panel del comprador */
    private PantallaComprador pantallaComprador;
    /** Expendedor de la lógica */
    private Expendedor exp;

    /**
     * Constructor del panel
     * Crea instancias de los otros dos paneles y los acomoda
     */
    public PantallaPrincipal(){
        super();
        setLayout(null);
        exp = new Expendedor(5);
        pantallaExpendedor=new PantallaExpendedor(exp);
        pantallaComprador=new PantallaComprador(exp, pantallaExpendedor);
        pantallaComprador.setBounds(550,100,400,600);
        pantallaExpendedor.setBounds(0,0,500,750);
        setBackground(Color.darkGray);
        this.add(pantallaExpendedor);
        this.add(pantallaComprador);
    }

    /**
     * Implementación necesaria de paintComponent para que se dibuje el panel en la ventana
     * @param G gráficos para dibujar
     */
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);;
    }
}
