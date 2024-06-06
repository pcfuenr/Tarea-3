package org.Grafica.Botones;
import org.Grafica.PantallaExpendedor;

public class BotonFanta extends Boton {
    public BotonFanta(PantallaExpendedor p) {
        super(p, "2", 386, 228, 50, 72);
    }
    @Override
    public void botonPresionado() {
        pantallaExpendedor.setNumSeleccionado(2);
    }
}
