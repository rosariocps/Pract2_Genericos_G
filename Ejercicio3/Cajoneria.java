package Ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;


public class Cajoneria<T> implements Iterable<Caja<T>> {
    private ArrayList<Caja<T>> cajas = new ArrayList<>();
    private int tope;


    // constructor con verificación del tope
    public Cajoneria(int tope) {
        if (tope <= 0) {
            throw new IllegalArgumentException("El tope debe ser mayor a 0");
        }
        this.tope = tope;
    }


    // método para agregar una caja si hay espacio
    public void add(Caja<T> caja) {
        if (isFull()) {
            throw new RuntimeException("La cajoneria ya está llena. Tope: " + tope);
        }
        cajas.add(caja);
    }


    // método para obtener el tamaño actual de la cajoneria
    public int size() {
        return cajas.size();
    }


    // método para verificar si la cajonería está llena
    public boolean isFull() {
        return cajas.size() >= tope;
    }


    @Override
    public Iterator<Caja<T>> iterator() {
        return cajas.iterator();
    }
}
