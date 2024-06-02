package org.Grafica;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PantallaExpendedor extends JPanel {
    private BufferedImage imagen;
    private JButton insertarMoneda;
    private JLabel producto;
    public PantallaExpendedor(){
        super();
        setBackground(Color.BLACK);
        try {
            imagen = ImageIO.read(new File("src/main/java/org/Grafica/Imagenes/Expende.jpg"));
        }catch (IOException e){}
        BotonSeleccionar();
        agregarImagenProductos();
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        G.drawImage(imagen,0,0,getWidth(),getHeight(),this);
    }
    public void BotonSeleccionar(){
        insertarMoneda=new JButton("0");
        insertarMoneda.setBounds(200,35,40,70);
        setLayout(null);
        add(insertarMoneda);

    }
    public void agregarImagenProductos(){
        Image i = (new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg")).getImage();
        for(int j=0;j<5;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), 55, 70, 100);
            add(producto);
        }
        i = (new ImageIcon("src/main/java/org/Grafica/Imagenes/Sprite.jpg")).getImage();
        for(int j=0;j<5;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), 180, 70, 100);
            add(producto);
        }
        i = (new ImageIcon("src/main/java/org/Grafica/Imagenes/Fanta.jpg")).getImage();
        for(int j=0;j<5;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), 305, 70, 100);
            add(producto);
        }
        i = (new ImageIcon("src/main/java/org/Grafica/Imagenes/Snicker.png")).getImage();
        for(int j=0;j<5;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(65, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(64*j), 430, 70, 100);
            add(producto);
        }
        i = (new ImageIcon("src/main/java/org/Grafica/Imagenes/Super8.jpg")).getImage();
        for(int j=0;j<5;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(70, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(64*j), 530, 70, 100);
            add(producto);
        }
    }
}
