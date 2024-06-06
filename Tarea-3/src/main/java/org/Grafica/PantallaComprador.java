package org.Grafica;

import org.Grafica.Botones.*;
import org.Logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaComprador extends JPanel {
    private PantallaExpendedor panelExp;
    private JLabel moneda;
    private Boton botonConfirmar;
    private Boton botonCoca;
    private Boton botonSprite;
    private Boton botonFanta;
    private Boton botonSnickers;
    private Boton botonSuper8;
    private Boton botonExtra;
    private Boton botonVuelto;
    private Boton botonTomarProducto;
    private JRadioButton moneda100;
    private JRadioButton moneda500;
    private JRadioButton moneda1000;
    private Expendedor exp;
    private Moneda coin;
    private int select;
    public PantallaComprador(Expendedor exp, PantallaExpendedor p){
        super();
        this.panelExp = p;
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
            coin = new Moneda100();
            System.out.println(coin.getSerie());
        });
        moneda500.addActionListener(e -> {
            coin = new Moneda500();
            System.out.println(coin.getSerie());
        });
        moneda1000.addActionListener(e -> {
            coin = new Moneda1000();
            System.out.println(coin.getSerie());
        });

        botonCoca = new BotonCoca(p);
        botonSprite = new BotonSprite(p);
        botonFanta = new BotonFanta(p);
        botonSnickers = new BotonSnickers(p);
        botonSuper8 = new BotonSuper8(p);
        botonExtra = new BotonExtra(p);
        botonConfirmar= new BotonConfirmar(p);
        botonVuelto = new BotonVuelto(p);
        botonTomarProducto=new BotonTomarProducto(p);

        botonCoca.getBoton().addActionListener(e -> {
            select = Articulos.COCA.ordinal();
            System.out.println(select);
        });
        botonSprite.getBoton().addActionListener(e -> {
            select = Articulos.SPRITE.ordinal();
            System.out.println(select);
        });
        botonFanta.getBoton().addActionListener(e -> {
            select = Articulos.FANTA.ordinal();
            System.out.println(select);
        });
        botonSnickers.getBoton().addActionListener(e -> {
            select = Articulos.SNICKERS.ordinal();
            System.out.println(select);
        });
        botonSuper8.getBoton().addActionListener(e -> {
            select = Articulos.SUPER8.ordinal();
            System.out.println(select);
        });
        botonExtra.getBoton().addActionListener(e -> {
            select = 5;
            System.out.println(select);
        });

        botonConfirmar.getBoton().addActionListener(e -> {
            try {
                exp.comprarProducto(coin, select);
            } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Error de compra" , JOptionPane.ERROR_MESSAGE);
            }
            panelExp.productoSeleccionado = select;
            panelExp.repaint();
            System.out.println(e.getActionCommand());
        });

        botonVuelto.getBoton().addActionListener(e -> {
            Moneda m;
            do {
                m = exp.getVuelto();
                System.out.println(m);
            } while (m != null);
            panelExp.repaint();
            System.out.println(e.getActionCommand());
        });
        botonTomarProducto.getBoton().addActionListener(e -> {
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
