package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class Cajoneria<T> implements Iterable<Caja<T>> {
    private ArrayList<Caja<T>> cajas = new ArrayList<>();
    private int tope;

    public Cajoneria(int tope) {
        this.tope = tope;
    }

    public void add(Caja<T> caja) {
        if (cajas.size() < tope) {
            cajas.add(caja);
        } else {
            throw new RuntimeException("No caben más cajas en la cajonería");
        }
    }

    @Override
    public Iterator<Caja<T>> iterator() {
        return cajas.iterator();
    }
}

