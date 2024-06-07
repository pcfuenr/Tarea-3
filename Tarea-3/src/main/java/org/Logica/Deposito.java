package org.Logica;
import java.util.ArrayList;

/**
 * Depósito genérico
 * @param <T> tipo de objeto que almacena
 */
public class Deposito<T>{
    /** Lista que contiene los elementos del depósito */
    private ArrayList<T> al;

    /**
     * Constructor por defecto
     */
    public Deposito(){
        this.al = new ArrayList<>();
    }

    /**
     * Revisa si el depósito tiene objetos guardados
     * @return valor de verdad
     */
    public boolean checkObject() {
        return !al.isEmpty();
    }

    /**
     * Entrega el primer objeto almacenado en el depósito
     * @return primer objeto guardado
     */
    public T getObject(){
        if (!al.isEmpty()) {
            return al.remove(0);
        } else {
            return null;
        }
    }

    /**
     * Añade un objeto al depósito
     * @param obj objeto a añadir
     */
    public void addObject(T obj){
        al.add(obj);
    }

    /**
     * Devuelve el tamaño del depósito
     * @return tamaño
     */
    public int getTamano(){
        return al.size();
    }
}
