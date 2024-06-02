package org.Grafica;

import org.Logica.*;
import javax.swing.*;
import java.awt.*;
public class PantallaComprador extends JPanel {
    private JButton insertarMoneda;
    private Comprador comprador;
    public PantallaComprador(){
        super();
        setLayout(null);
        setBackground(Color.GREEN);
        //Botones();
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
    }
    /*public void Botones(){
        insertarMoneda=new JButton("hola mundo",new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg"));
        insertarMoneda.setBounds(0,0,200,200);
        insertarMoneda.setActionCommand("Comprar");
        insertarMoneda.addActionListener(comprador);
        add(insertarMoneda);
    }*/
}
