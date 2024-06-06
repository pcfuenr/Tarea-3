package org.Grafica;

import org.Grafica.Botones.*;
import org.Logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaComprador extends JPanel {
    private JLabel moneda;
    private Boton botonConfirmar;
    private Boton botonCoca;
    private Boton botonSprite;
    private Boton botonFanta;
    private Boton botonSnickers;
    private Boton botonSuper8;
    private Boton botonExtra;
    private Boton botonMoneda;
    private Boton botonVuelto;
    private Boton botonTomarProducto;
    private JRadioButton moneda100;
    private JRadioButton moneda500;
    private JRadioButton moneda1000;
    private Expendedor exp;
    public PantallaComprador(Expendedor exp, PantallaExpendedor p){
        super();
        this.exp = exp;
        this.setLayout(null);

        moneda100 = new JRadioButton("100");
        moneda100.setBackground(Color.gray);
        moneda100.setBounds(5, 45, 60, 25);
        this.add(moneda100);
        moneda500 = new JRadioButton("500");
        moneda500.setBackground(Color.gray);
        moneda500.setBounds(5, 145, 60, 25);
        this.add(moneda500);
        moneda1000 = new JRadioButton("1000");
        moneda1000.setBackground(Color.gray);
        moneda1000.setBounds(5, 245, 60, 25);
        this.add(moneda1000);
        ButtonGroup monedas = new ButtonGroup();
        monedas.add(moneda100);
        monedas.add(moneda500);
        monedas.add(moneda1000);

        moneda100.addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        moneda500.addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        moneda1000.addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });

        botonConfirmar= new BotonConfirmar(p);
        botonCoca = new BotonCoca(p);
        botonSprite = new BotonSprite(p);
        botonFanta = new BotonFanta(p);
        botonSnickers = new BotonSnickers(p);
        botonSuper8 = new BotonSuper8(p);
        botonExtra = new BotonExtra(p);
        botonMoneda = new BotonMoneda(p);
        botonVuelto = new BotonVuelto(p);
        botonTomarProducto=new BotonTomarProducto(p);

        botonVuelto.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        botonTomarProducto.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        botonConfirmar.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        botonCoca.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        botonSprite.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        botonFanta.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        botonSnickers.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        botonSuper8.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        botonExtra.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });
        botonMoneda.getBoton().addActionListener(e -> {
            System.out.println(e.getActionCommand());
        });

        setBackground(Color.gray);
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        moneda = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/100.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        moneda.setBounds(70, 5, 100, 100);
        this.add(moneda);
        moneda = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/500.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        moneda.setBounds(70, 105, 100, 100);
        this.add(moneda);
        moneda = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/1000.jpg").getImage().getScaledInstance(206, 100, Image.SCALE_SMOOTH)));
        moneda.setBounds(75, 205, 206, 100);
        this.add(moneda);
    }
}