package org.Logica;

/**
 * Expendedor al que se le puede comprar un artículo seleccionado a cambio de una moneda
 */
public class Expendedor {
    /** Cantidad de productos que tendrá cada depósito */
    private int cantProductos;
    /** Deposito de productos para almacenar CocaCola */
    private Deposito<Producto> coca = new Deposito<>();
    /** Deposito de productos para almacenar Sprite */
    private Deposito<Producto> sprite = new Deposito<>();
    /** Deposito de productos para almacenar Fanta */
    private Deposito<Producto> fanta = new Deposito<>();
    /** Deposito de productos para almacenar Snickers */
    private Deposito<Producto> snickers = new Deposito<>();
    /** Deposito de productos para almacenar Super8 */
    private Deposito<Producto> super8 = new Deposito<>();
    /** Deposito de monedas usadas usadas en las compras */
    private Deposito<Moneda> monedas = new Deposito<>();
    /** Deposito de monedas para almacenar el vuelto */
    private Deposito<Moneda> monVu = new Deposito<>();
    /** Depósito individual donde "cae" el producto comprado */
    private Producto producto = null;

    /**
     * Constructor, crea y llena los depósitos de cada artículo
     * Cada Producto tiene un número de serie compuesto por su número identificador y un número que indica el orden en que se crearon
     * @param numProductos cantidad de productos en cada depósito
     */
    public Expendedor(int numProductos) {
        cantProductos = numProductos;
        for (int i = 0; i < cantProductos; i++) {
            Producto p = null;
            p = new CocaCola("" + Articulos.COCA.ordinal() + i);
            coca.addObject(p);
            p = new Sprite("" + Articulos.SPRITE.ordinal() + i);
            sprite.addObject(p);
            p = new Fanta("" + Articulos.FANTA.ordinal() + i);
            fanta.addObject(p);
            p = new Snickers("" + Articulos.SNICKERS.ordinal() + i);
            snickers.addObject(p);
            p = new Super8("" + Articulos.SUPER8.ordinal() + i);
            super8.addObject(p);
        }
    }

    /**
     * Simula la compra en una máquina expendedora, se entrega una moneda y se selecciona un producto, si la compra es exitosa entonces devuelve el producto
     * @param m moneda para comprar
     * @param cual indica qué producto se desea comprar
     * @throws PagoIncorrectoException puede lanzar esta excepción si se trata de comprar con una moneda null
     * @throws NoHayProductoException puede lanzar esta excepción si el depósito del producto seleccionado está vacío o si el número de seleccion no corresponde a ningún producto
     * @throws PagoInsuficienteException puede lanzar esta excepción si la moneda entregada no alcanza para comprar el producto
     */
    public void comprarProducto(Moneda m, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        if (m == null) {
            throw new PagoIncorrectoException("Error, no se ha entregado moneda");
        } else {
            if (cual == Articulos.COCA.ordinal()) {
                if (coca.checkObject()) {
                    if (m.compareTo(Articulos.COCA.getDiferencia())<0) {
                        Moneda m100 = null;
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar CocaCola");
                    } else if (m.compareTo(Articulos.COCA.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.COCA.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        monedas.addObject(m);
                        producto = coca.getObject();
                    } else {
                        monedas.addObject(m);
                        producto = coca.getObject();
                    }
                } else {
                    Moneda m100 = null;
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    }
                    throw new NoHayProductoException("Error, no queda CocaCola en el depósito");
                }
            } else if (cual == Articulos.SPRITE.ordinal()) {
                if (sprite.checkObject()) {
                    if (m.compareTo(Articulos.SPRITE.getDiferencia())<0) {
                        Moneda m100 = null;
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar Sprite");
                    } else if (m.compareTo(Articulos.SPRITE.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.SPRITE.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        monedas.addObject(m);
                        producto = sprite.getObject();
                    } else {
                        monedas.addObject(m);
                        producto = sprite.getObject();
                    }
                } else {
                    Moneda m100 = null;
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    }
                    throw new NoHayProductoException("Error, no queda Sprite en el depósito");
                }
            } else if (cual == Articulos.FANTA.ordinal()) {
                if (fanta.checkObject()) {
                    if (m.compareTo(Articulos.FANTA.getDiferencia())<0) {
                        Moneda m100 = null;
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar Fanta");
                    } else if (m.compareTo(Articulos.FANTA.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.FANTA.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        monedas.addObject(m);
                        producto = fanta.getObject();
                    } else {
                        monedas.addObject(m);
                        producto = fanta.getObject();
                    }
                } else {
                    Moneda m100 = null;
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    }
                    throw new NoHayProductoException("Error, no queda Fanta en el depósito");
                }
            } else if (cual == Articulos.SNICKERS.ordinal()) {
                if (snickers.checkObject()) {
                    if (m.compareTo(Articulos.SNICKERS.getDiferencia())<0) {
                        Moneda m100 = null;
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar Snickers");
                    } else if (m.compareTo(Articulos.SNICKERS.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.SNICKERS.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        monedas.addObject(m);
                        producto = snickers.getObject();
                    } else {
                        monedas.addObject(m);
                        producto = snickers.getObject();
                    }
                } else {
                    Moneda m100 = null;
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    }
                    throw new NoHayProductoException("Error, no quedan Snickers en el depósito");
                }
            } else if (cual == Articulos.SUPER8.ordinal()) {
                if  (super8.checkObject()) {
                    if (m.compareTo(Articulos.SUPER8.getDiferencia())<0) {
                        Moneda m100 = null;
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar Super8");
                    } else if (m.compareTo(Articulos.SUPER8.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.SUPER8.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        monedas.addObject(m);
                        producto = super8.getObject();
                    } else {
                        monedas.addObject(m);
                        producto = super8.getObject();
                    }
                } else {
                    Moneda m100 = null;
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    }
                    throw new NoHayProductoException("Error, no quedan Super8 en el depósito");
                }
            } else {
                Moneda m100 = null;
                for (int i = 0; i < (m.getValor() / 100); i++) {
                    m100 = new Moneda100();
                    monVu.addObject(m100);
                }
                throw new NoHayProductoException("Error, no hay producto que corresponda al número seleccionado");
            }
        }
    }

    /**
     * Revisa si hay producto que tomar
     * @return valor de verdad
     */
    public boolean checkProducto() {
        return producto != null;
    }
    /**
     * Devuelve el producto comprado, como si se "sacara" el producto del depósito donde cae
     * @return producto comprado
     */
    public Producto getProducto() {
        Producto aux = producto;
        producto = null;
        return aux;
    }

    /**
     * Revisa si hay vuelto que tomar
     * @return valor de verdad
     */
    public boolean checkVuelto() {
        return monVu.checkObject();
    }
    /**
     * Devuelve una de las monedas almacenadas en el depósito de monedas
     * @return Moneda100 del depósito
     */
    public Moneda getVuelto() {
        return monVu.getObject();
    }

    /**
     * Llena el depósito especificado
     * @param n depósito que se quiere llenar
     */
    public void llenarDeposito(int n) {
        if (n == Articulos.COCA.ordinal()) {
            for (int i = 0; i < cantProductos; i++) {
                Producto p = null;
                p = new CocaCola("" + Articulos.COCA.ordinal() + i);
                coca.addObject(p);
            }
        } else if (n == Articulos.SPRITE.ordinal()) {
            for (int i = 0; i < cantProductos; i++) {
                Producto p = null;
                p = new Sprite("" + Articulos.SPRITE.ordinal() + i);
                sprite.addObject(p);
            }
        } else if (n == Articulos.FANTA.ordinal()) {
            for (int i = 0; i < cantProductos; i++) {
                Producto p = null;
                p = new Fanta("" + Articulos.FANTA.ordinal() + i);
                fanta.addObject(p);
            }
        } else if (n == Articulos.SNICKERS.ordinal()) {
            for (int i = 0; i < cantProductos; i++) {
                Producto p = null;
                p = new Snickers("" + Articulos.SNICKERS.ordinal() + i);
                snickers.addObject(p);
            }
        } else if (n == Articulos.SUPER8.ordinal()) {
            for (int i = 0; i < cantProductos; i++) {
                Producto p = null;
                p = new Super8("" + Articulos.SUPER8.ordinal() + i);
                super8.addObject(p);
            }
        }
    }
    /**
     * Método para obtener la cantidad de productos que quedan en cada deposito
     * @param n indica el deposito de productos que se quiere
     * @return deposito de productos
     */
    public Deposito<Producto> getDeposito(int n) {
        return switch (n) {
            case 0 -> coca;
            case 1 -> sprite;
            case 2 -> fanta;
            case 3 -> snickers;
            case 4 -> super8;
            default -> null;
        };
    }
}