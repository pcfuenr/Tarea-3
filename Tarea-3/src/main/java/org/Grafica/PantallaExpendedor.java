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

/**
 * Clase que representa el expendedor
 */
public class PantallaExpendedor extends JPanel {
    /** Para subir imagenes*/
    private BufferedImage imagen;
    /** Labels para subir y quitar imagenes */
    private JLabel producto;
    private JLabel productoSacar = null;
    /** Referencia expendedor */
    private Expendedor exp;
    /** producto seleccionado por defecto -1*/
    private int productoSeleccionado = -1;

    /**
     * Constructor que crea la pantalla expendedor y sube la foto del expendedor.
     * @param expendedor referencia a un expendedor logico
     */
    public PantallaExpendedor(Expendedor expendedor){
        super();
        exp = expendedor;

        setBackground(Color.black);
        try {
            imagen = ImageIO.read(new File("src/main/java/org/Grafica/Imagenes/Expende.jpg"));
        }catch (IOException e){}
    }

    /**
     * Metodo que sube fotos de los productos que quedan en la maquina,
     * Y sirve para manejar las interacciones de getvuelto, o getproducto a nivel grafico
     * @param G
     */
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
        if (productoSacar != null) {
            remove(productoSacar);
            if (exp.checkProducto()) {
                if (productoSeleccionado == Articulos.COCA.ordinal()) {
                    productoSacar = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                    productoSacar.setBounds(406, 550, 62, 80);
                    add(productoSacar);
                } else if (productoSeleccionado == Articulos.SPRITE.ordinal()) {
                    productoSacar = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Sprite.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                    productoSacar.setBounds(406, 550, 62, 80);
                    add(productoSacar);
                } else if (productoSeleccionado == Articulos.FANTA.ordinal()) {
                    productoSacar = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Fanta.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                    productoSacar.setBounds(406, 550, 62, 80);
                    add(productoSacar);
                } else if (productoSeleccionado == Articulos.SNICKERS.ordinal()) {
                    productoSacar = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Snickers.png").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                    productoSacar.setBounds(406, 550, 62, 80);
                    add(productoSacar);
                } else  if (productoSeleccionado == Articulos.SUPER8.ordinal()) {
                    productoSacar = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/Super8.jpg").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                    productoSacar.setBounds(406, 550, 62, 80);
                    add(productoSacar);
                } else {
                    productoSacar = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/blank.png").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                    productoSacar.setBounds(406, 550, 62, 80);
                    add(productoSacar);
                }
            } else {
                productoSacar = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/blank.png").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
                productoSacar.setBounds(406, 550, 62, 80);
                add(productoSacar);
            }
        } else {
            productoSacar = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/blank.png").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            productoSacar.setBounds(406, 550, 62, 80);
            add(productoSacar);
        }
    }

    /**
     * Sirve para agregar los productos en el expendedor (de manera visual)
     * @param i imagen a agregar
     * @param cantidad cuantos agregaras
     * @param altura coordenada y de la pantalla expendedor
     */
    public void agregarImagenProductos(Image i, int cantidad,int altura){
        for(int j=0;j<cantidad;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), altura, 70, 100);
            add(producto);
        }
    }
    public void setProductoSeleccionado(int x) {
        productoSeleccionado = x;
    }
}
