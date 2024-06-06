package org.Grafica;

import org.Grafica.Botones.*;
import org.Logica.Articulos;
import org.Logica.CocaCola;
import org.Logica.Expendedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PantallaExpendedor extends JPanel {
    private BufferedImage imagen;
    private JLabel producto;
    private Expendedor exp;
    public int productoSeleccionado = -1;
    public PantallaExpendedor(Expendedor expendedor){
        super();
        exp = expendedor;

        setBackground(Color.black);
        try {
            imagen = ImageIO.read(new File("src/main/java/org/Grafica/Imagenes/Expende.jpg"));
        }catch (IOException e){}
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        G.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg")).getImage(),exp.getDeposito("coca").getTamaño(),55);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Sprite.jpg")).getImage(),exp.getDeposito("sprite").getTamaño(),180);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Fanta.jpg")).getImage(),exp.getDeposito("fanta").getTamaño(),305);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Snickers.png")).getImage(),exp.getDeposito("snickers").getTamaño(),420);
        agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Super8.jpg")).getImage(),exp.getDeposito("super8").getTamaño(),535);

        if (exp.checkVuelto()) {
            G.setColor(Color.ORANGE);
            G.fillRect(412, 489, 50, 10);
        } else {
            G.setColor(Color.white);
            G.fillRect(412, 489, 50, 10);
        }
        if (exp.checkProducto()) {
            if (productoSeleccionado == Articulos.COCA.ordinal()) {
                producto = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                producto.setBounds(412, 550, 50, 80);
                add(producto);
            } else if (productoSeleccionado == Articulos.SPRITE.ordinal()) {
                producto = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Sprite.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                producto.setBounds(412, 550, 50, 80);
                add(producto);
            } else if (productoSeleccionado == Articulos.FANTA.ordinal()) {
                producto = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Fanta.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                producto.setBounds(412, 550, 50, 80);
                add(producto);
            } else if (productoSeleccionado == Articulos.SNICKERS.ordinal()) {
                producto = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Snickers.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                producto.setBounds(412, 550, 50, 80);
                add(producto);
            } else  if (productoSeleccionado == Articulos.SUPER8.ordinal()) {
                producto = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Super8.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                producto.setBounds(412, 550, 50, 80);
                add(producto);
            } else {
                G.setColor(Color.white);
                G.fillRect(406, 528, 62, 106);
            }
        } else {
            G.setColor(Color.white);
            G.fillRect(406, 528, 62, 106);
        }
    }
    public void agregarImagenProductos(Image i, int cantidad,int altura){
        for(int j=0;j<cantidad;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), altura, 70, 100);
            add(producto);
        }
    }
}
