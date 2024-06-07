package org.Grafica;

import org.Grafica.Botones.*;
import org.Logica.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Panel que representa al comprador
 */
public class PantallaComprador extends JPanel {
    /** Referencia al panel expendedor */
    private PantallaExpendedor panelExp;
    /** Botones necesarios para que funcione correctamente el programa*/
    private Boton botonConfirmar;
    private Boton botonCoca;
    private Boton botonSprite;
    private Boton botonFanta;
    private Boton botonSnickers;
    private Boton botonSuper8;
    private Boton botonExtra;
    private Boton botonVuelto;
    private Boton botonTomarProducto;
    /** Deposito de productos del comprador */
    private Deposito<Producto> bolsillo = new Deposito<>();
    private ArrayList<JLabel> bolsilloVisual=new ArrayList<>();
    /** Deposito de monedas del comprador */
    private Deposito<Moneda> billetera =new Deposito<>();
    private ArrayList<JLabel> billeteraVisual=new ArrayList<>();
    /** Moneda usada para pagar y guardar monedas en la billetera*/
    private Moneda coin = null;
    /** Producto usado para guardar en bolsillo */
    private Producto producto;
    /** Para seleccionar producto */
    private int select = -1;

    /**
     * Metodo constructor que crea los botones y los listeners
     * @param exp Expendedor
     * @param p pantalla expendedor
     */
    public PantallaComprador(Expendedor exp, PantallaExpendedor p){
        super();
        this.panelExp = p;
        this.setLayout(null);

        JRadioButton moneda100 = new JRadioButton("100");
        moneda100.setBackground(Color.gray);
        moneda100.setBounds(5, 45, 60, 25);
        this.add(moneda100);
        JRadioButton moneda500 = new JRadioButton("500");
        moneda500.setBackground(Color.gray);
        moneda500.setBounds(5, 145, 60, 25);
        this.add(moneda500);
        JRadioButton moneda1000 = new JRadioButton("1000");
        moneda1000.setBackground(Color.gray);
        moneda1000.setBounds(5, 245, 60, 25);
        this.add(moneda1000);
        ButtonGroup monedas = new ButtonGroup();
        monedas.add(moneda100);
        monedas.add(moneda500);
        monedas.add(moneda1000);

        moneda100.addActionListener(e -> {
            coin = new Moneda100();
            panelExp.setMonedaSeleccionada(100);
        });
        moneda500.addActionListener(e -> {
            coin = new Moneda500();
            panelExp.setMonedaSeleccionada(500);
        });
        moneda1000.addActionListener(e -> {
            coin = new Moneda1000();
            panelExp.setMonedaSeleccionada(1000);
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
        });
        botonSprite.getBoton().addActionListener(e -> {
            select = Articulos.SPRITE.ordinal();
        });
        botonFanta.getBoton().addActionListener(e -> {
            select = Articulos.FANTA.ordinal();
        });
        botonSnickers.getBoton().addActionListener(e -> {
            select = Articulos.SNICKERS.ordinal();
        });
        botonSuper8.getBoton().addActionListener(e -> {
            select = Articulos.SUPER8.ordinal();
        });
        botonExtra.getBoton().addActionListener(e -> {
            select = 5;
        });

        botonConfirmar.getBoton().addActionListener(e -> {
            try {
                exp.comprarProducto(coin, select);
            } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Error de compra" , JOptionPane.ERROR_MESSAGE);
            }
            panelExp.setProductoSeleccionado(select);
            panelExp.repaint();
            select = -1;
            coin = null;
        });

        botonVuelto.getBoton().addActionListener(e -> {
            Moneda m;
            do {
                m = exp.getVuelto();
                billetera.addObject(m);
            } while (m != null);
            billetera.getObject();
            panelExp.repaint();
            repaint();
        });

        botonTomarProducto.getBoton().addActionListener(e -> {
            if (exp.checkProducto()) {
                bolsillo.addObject(exp.getProducto());
                panelExp.repaint();
            } else {
                panelExp.repaint();
            }
            repaint();
        });
        setBackground(Color.gray);

    }

    /**
     * Implementacion de paintcomponent necesaria para seleccionar la moneda a usar a nivel visual
     * @param G gráficos para dibujar
     */
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        JLabel moneda;
        moneda = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/100.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        moneda.setBounds(70, 5, 100, 100);
        this.add(moneda);
        moneda = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/500.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        moneda.setBounds(70, 105, 100, 100);
        this.add(moneda);
        moneda = new JLabel(new ImageIcon(new ImageIcon("src/main/java/org/Grafica/Imagenes/1000.jpg").getImage().getScaledInstance(206, 100, Image.SCALE_SMOOTH)));
        moneda.setBounds(75, 205, 206, 100);
        this.add(moneda);

        /**if (!bolsilloVisual.isEmpty()) {
            for (JLabel i : bolsilloVisual) {
                remove(i);
            }
        }*/
        if (!billeteraVisual.isEmpty()) {
            for (JLabel i : billeteraVisual) {
                remove(i);
            }
        }
        billeteraVisual = agregarImagenMonedas((new ImageIcon("src/main/java/org/Grafica/Imagenes/100.png")).getImage());
        for (JLabel i : billeteraVisual) {
            add(i);
        }
        bolsilloVisual = agregarImagenProductos((new ImageIcon("src/main/java/org/Grafica/Imagenes/Coca.jpg")).getImage());
        for (JLabel i : bolsilloVisual) {
            add(i);
        }
    }
    public ArrayList<JLabel> agregarImagenMonedas(Image i){
        ArrayList<JLabel> al = new ArrayList<>();
        JLabel producto;
        for(int j=0;j<billetera.getTamano();j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
            producto.setBounds(1+(15*j), 400, 30, 30);
            al.add(producto);
        }
        return al;
    }
    public ArrayList<JLabel> agregarImagenProductos(Image i){
        ArrayList<JLabel> al = new ArrayList<>();
        JLabel producto;
        for(int j=0;j<bolsillo.getTamano();j++) {
            producto = new JLabel(new ImageIcon(i.getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
            producto.setBounds(5+(25*j), 500, 30, 30);
            al.add(producto);
        }
        return al;
    }
    public String getMonedaSeleccionada(){
        return getMonedaSeleccionada();
    }
}
