package org.Logica;
import java.util.ArrayList;

public class Deposito<T>{
    private ArrayList<T> al;
    public Deposito(){
        this.al = new ArrayList<>();
    }
    public boolean checkObject() {
        return !al.isEmpty();
    }
    public T getObject(){
        if (!al.isEmpty()) {
            return al.remove(0);
        } else {
            return null;
        }
    }
    public void addObject(T obj){
        al.add(obj);
    }
    public int getTamano(){
        return al.size();
    }
}
