package org.Grafica;

import org.Grafica.Botones.*;
import org.Logica.*;
import javax.swing.*;
import java.awt.*;

public class PantallaComprador extends JPanel {
    private Boton botonConfirmar;
    private Boton botonCoca;
    private Boton botonSprite;
    private Boton botonFanta;
    private Boton botonSnickers;
    private Boton botonSuper8;
    private Boton botonExtra;
    private Boton botonMoneda;
    private Boton botonVuelto;
    private Boton botonTomarProducto;
    private Expendedor exp;
    public PantallaComprador(Expendedor exp, PantallaExpendedor p){
        super();
        this.exp = exp;
        botonConfirmar= new BotonConfirmar(p);
        botonCoca = new BotonCoca(p);
        botonSprite = new BotonSprite(p);
        botonFanta = new BotonFanta(p);
        botonSnickers = new BotonSnickers(p);
        botonSuper8 = new BotonSuper8(p);
        botonExtra = new BotonExtra(p);
        botonMoneda = new BotonMoneda(p);
        botonVuelto = new BotonVuelto(p);
        botonTomarProducto=new BotonTomarProducto(p);

        botonVuelto.getBoton().addActionListener(e -> {
            botonVuelto.botonPresionado();
        });
        botonTomarProducto.getBoton().addActionListener(e -> {
            botonTomarProducto.botonPresionado();
        });
        botonConfirmar.getBoton().addActionListener(e -> {
            botonConfirmar.botonPresionado();
        });
        botonCoca.getBoton().addActionListener(e -> {
            botonCoca.botonPresionado();
        });
        botonSprite.getBoton().addActionListener(e -> {
            botonSprite.botonPresionado();
        });
        botonFanta.getBoton().addActionListener(e -> {
            botonFanta.botonPresionado();
        });
        botonSnickers.getBoton().addActionListener(e -> {
            botonSnickers.botonPresionado();
        });
        botonSuper8.getBoton().addActionListener(e -> {
            botonSuper8.botonPresionado();
        });
        botonExtra.getBoton().addActionListener(e -> {
            botonExtra.botonPresionado();
        });
        botonMoneda.getBoton().addActionListener(e -> {
            botonMoneda.botonPresionado();
        });

        setBackground(Color.black);
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
    }
}
