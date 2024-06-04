package org.Grafica;

import org.Logica.Comprador;
import org.Logica.Expendedor;
import org.Logica.Moneda100;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JPanel {
    private PantallaExpendedor pantallaExpendedor;
    private PantallaComprador pantallaComprador;
    private Comprador comprador;
    public PantallaPrincipal(){
        super();
        setLayout(null);
        pantallaComprador=new PantallaComprador();
        pantallaExpendedor=new PantallaExpendedor();
        //pantallaComprador.setBounds(400,100,500,500);
        pantallaExpendedor.setBounds(0,0,500,750);
        setBackground(Color.white);
        this.add(pantallaExpendedor);
        this.add(pantallaComprador);
    }

    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);;
    }
}
