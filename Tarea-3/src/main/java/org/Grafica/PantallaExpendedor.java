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

        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg")).getImage(),5,55);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Sprite.jpg")).getImage(),5,180);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Fanta.jpg")).getImage(),5,305);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Snicker.png")).getImage(),5,420);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Super8.jpg")).getImage(),5,535);
        BotonSeleccionar("0",385,156,50,72);
        BotonSeleccionar("2",385,228,50,72);
        BotonSeleccionar("4",385,300,50,72);
        BotonSeleccionar("1",442,156,50,72);
        BotonSeleccionar("3",442,228,50,72);
        BotonSeleccionar("5",442,300,50,72);
        BotonSeleccionar("Pon Moneda",381,407,111,33);
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        G.drawImage(imagen,0,0,getWidth(),getHeight(),this);
    }
    public void BotonSeleccionar(String numero,int x,int y,int width,int height){
        insertarMoneda=new JButton(numero);
        insertarMoneda.setBounds(x,y,width,height);
        setLayout(null);
        add(insertarMoneda);

    }
    public void agregarImagenProductos(Image i, int cantidad,int altura){
        for(int j=0;j<5;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), altura, 70, 100);
            add(producto);
        }
    }
}
