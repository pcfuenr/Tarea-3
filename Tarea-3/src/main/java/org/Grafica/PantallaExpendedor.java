package org.Grafica;

import org.Grafica.Botones.*;
import org.Logica.CocaCola;
import org.Logica.Expendedor;
import java.util.ArrayList;
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
    private BotonExtra botonExtra;
    private BotonMoneda botonMoneda;
    private JLabel producto;
    private int cantidad=5;
    private Expendedor expendedor;
    public PantallaExpendedor(Expendedor exp){
        super();
        expendedor=exp;
        botonCoca=new BotonCoca(this);
        botonSprite=new BotonSprite(this);
        botonFanta=new BotonFanta(this);
        botonSnicker=new BotonSnicker(this);
        botonSuper8=new BotonSuper8(this);
        botonExtra=new BotonExtra(this);
        botonMoneda=new BotonMoneda(this);
        setBackground(Color.black);
        try {
            imagen = ImageIO.read(new File("src/main/java/org/Grafica/Imagenes/Expende.jpg"));
        }catch (IOException e){}

        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg")).getImage(),exp.getDeposito("coca").getTamaño(),55);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Sprite.jpg")).getImage(),exp.getDeposito("sprite").getTamaño(),180);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Fanta.jpg")).getImage(),exp.getDeposito("fanta").getTamaño(),305);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Snickers.png")).getImage(),exp.getDeposito("snickers").getTamaño(),420);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Super8.jpg")).getImage(),exp.getDeposito("super8").getTamaño(),535);
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        G.drawImage(imagen,0,0,getWidth(),getHeight(),this);
    }
    public void agregarImagenProductos(Image i, int cantidad,int altura){
        for(int j=0;j<cantidad;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), altura, 70, 100);
            add(producto);
        }
    }
}
