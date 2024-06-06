package org.Grafica;

import org.Logica.Comprador;
import org.Logica.Expendedor;
import org.Logica.Moneda100;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JPanel {
    private PantallaExpendedor pantallaExpendedor;
    private PantallaComprador pantallaComprador;
    private Expendedor exp;
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

    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);;
    }
}
