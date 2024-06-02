package org.Grafica;

import org.Logica.Comprador;
import org.Logica.Expendedor;
import org.Logica.Moneda100;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JPanel {
    private PantallaExpendedor pantallaExpendedor;
    private PantallaComprador pantallaComprador;
    private PantallaComprador pantallaComprador2;
    private Comprador comprador;
    public PantallaPrincipal(){
        super();
        setLayout(null);
        pantallaComprador=new PantallaComprador();
        pantallaExpendedor=new PantallaExpendedor();
        pantallaComprador2=new PantallaComprador();
        try {
            comprador = new Comprador(new Moneda100(), 1, new Expendedor(5));
        }catch (Exception e){}
        pantallaComprador.setBounds(600,100,100,100);
        pantallaExpendedor.setBounds(50,50,500,650);
        setBackground(Color.white);
        this.add(pantallaComprador2);
        this.add(pantallaExpendedor);
        this.add(pantallaComprador);
    }

    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);;
    }
}
