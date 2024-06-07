package org.Grafica;

import org.Logica.Articulos;
import org.Logica.Expendedor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que representa el expendedor
 */
public class PantallaExpendedor extends JPanel {
    /** Para subir imagenes*/
    private BufferedImage imagen;
    /** Labels para subir y quitar imagenes */
    private ArrayList<JLabel> coca = new ArrayList<>();
    private ArrayList<JLabel> sprite = new ArrayList<>();
    private ArrayList<JLabel> fanta = new ArrayList<>();
    private ArrayList<JLabel> snickers = new ArrayList<>();
    private ArrayList<JLabel> super8 = new ArrayList<>();
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
     * @param G gráficos para dibujar
     */
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        G.drawImage(imagen,0,0,getWidth(),getHeight(),this);

        if (!coca.isEmpty()) {
            for (JLabel i : coca) {
                remove(i);
            }
        }
        coca = agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg")).getImage(),exp.getDeposito("coca").getTamano(),55);
        for (JLabel i : coca) {
            add(i);
        }
        if (!sprite.isEmpty()) {
            for (JLabel i : sprite) {
                remove(i);
            }
        }
        sprite = agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Sprite.jpg")).getImage(),exp.getDeposito("sprite").getTamano(),180);
        for (JLabel i : sprite) {
            add(i);
        }
        if (!fanta.isEmpty()) {
            for (JLabel i : fanta) {
                remove(i);
            }
        }
        fanta = agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Fanta.jpg")).getImage(),exp.getDeposito("fanta").getTamano(),305);
        for (JLabel i : fanta) {
            add(i);
        }
        if (!snickers.isEmpty()) {
            for (JLabel i : snickers) {
                remove(i);
            }
        }
        snickers = agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Snickers.png")).getImage(),exp.getDeposito("snickers").getTamano(),420);
        for (JLabel i : snickers) {
            add(i);
        }
        if (!super8.isEmpty()) {
            for (JLabel i : super8) {
                remove(i);
            }
        }
        super8 = agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Super8.jpg")).getImage(),exp.getDeposito("super8").getTamano(),535);
        for (JLabel i : super8) {
            add(i);
        }

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
    public ArrayList<JLabel> agregarImagenProductos(Image i, int cantidad,int altura){
        ArrayList<JLabel> al = new ArrayList<>();
        JLabel producto;
        for(int j=0;j<cantidad;j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
            producto.setBounds(50+(63*j), altura, 70, 100);
            al.add(producto);
        }
        return al;
    }
    public void setProductoSeleccionado(int x) {
        productoSeleccionado = x;
    }
}
