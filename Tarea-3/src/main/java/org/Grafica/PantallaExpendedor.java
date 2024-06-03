package org.Grafica;

import org.Grafica.Botones.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PantallaExpendedor extends JPanel {
    private BufferedImage imagen;
    private JButton insertarMoneda;
    private BotonCoca botonCoca;
    private BotonSprite botonSprite;
    private BotonFanta botonFanta;
    private BotonSnicker botonSnicker;
    private BotonSuper8 botonSuper8;
    private BotonMoneda botonMoneda;
    private JLabel producto;
    private int cantidad=5;
    public PantallaExpendedor(){
        super();
        botonCoca=new BotonCoca(this);
        botonSprite=new BotonSprite(this);
        botonFanta=new BotonFanta(this);
        botonSnicker=new BotonSnicker(this);
        botonSuper8=new BotonSuper8(this);
        botonMoneda=new BotonMoneda(this);
        setBackground(Color.BLACK);
        try {
            imagen = ImageIO.read(new File("src/main/java/org/Grafica/Imagenes/Expende.jpg"));
        }catch (IOException e){}

        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg")).getImage(),cantidad,55);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Sprite.jpg")).getImage(),cantidad,180);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Fanta.jpg")).getImage(),cantidad,305);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Snicker.png")).getImage(),cantidad,420);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Super8.jpg")).getImage(),cantidad,535);
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
        for(int j=0;j<cantidad;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), altura, 70, 100);
            add(producto);
        }
    }
}
