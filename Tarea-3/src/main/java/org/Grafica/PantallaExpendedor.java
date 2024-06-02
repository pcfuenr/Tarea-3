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
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg")).getImage(),5,55);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Sprite.jpg")).getImage(),5,180);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Fanta.jpg")).getImage(),5,305);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Snicker.png")).getImage(),5,420);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Super8.jpg")).getImage(),5,535);
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
    public void agregarImagenProductos(Image i, int cantidad,int altura){
        for(int j=0;j<5;j++) {
            if(j>=5){break;}
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), altura, 70, 100);
            add(producto);
        }
    }
}
