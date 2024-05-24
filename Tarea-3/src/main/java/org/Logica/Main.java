package org.Logica;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(3);
        Moneda m = new Moneda1000();
        Moneda m5 = new Moneda500();
        Moneda m1 = new Moneda100();
        Comprador p = null;

        try {
            p = new Comprador(null, Articulos.COCA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            System.out.println();
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println(e);
        }

        try {
            p = new Comprador(m, Articulos.COCA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m5, Articulos.COCA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.COCA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.COCA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.COCA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            System.out.println();
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println(e);
        }

        try {
            p = new Comprador(m, Articulos.SPRITE.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m5, Articulos.SPRITE.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.SPRITE.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.SPRITE.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.SPRITE.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            System.out.println();
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println(e);
        }

        try {
            p = new Comprador(m, Articulos.FANTA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m5, Articulos.FANTA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.FANTA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.FANTA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.FANTA.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            System.out.println();
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println(e);
        }

        try {
            p = new Comprador(m, Articulos.SNICKERS.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m5, Articulos.SNICKERS.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.SNICKERS.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.SNICKERS.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.SNICKERS.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            System.out.println();
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println(e);
        }

        try {
            p = new Comprador(m, Articulos.SUPER8.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m5, Articulos.SUPER8.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.SUPER8.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.SUPER8.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            p = new Comprador(m, Articulos.SUPER8.ordinal(), exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
            System.out.println();
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println(e);
        }

        try {
            p = new Comprador(m, 10, exp);
            System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println(e);
        }
    }
}