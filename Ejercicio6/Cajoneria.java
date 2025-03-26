package Ejercicio6;

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

    // 4.1 Método search
    public String search(T objeto) {
        for (int i = 0; i < cajas.size(); i++) {
            T contenido = cajas.get(i).getContenido();
            if (contenido != null && contenido.equals(objeto)) {
                return "Encontrado en posición: " + (i + 1) +
                       ", Color de la caja: " + cajas.get(i).getColor();
            }
        }
        return "Objeto no encontrado.";
    }

    // 4.2 Método delete
    public T delete(T objeto) {
        for (Caja<T> caja : cajas) {
            T contenido = caja.getContenido();
            if (contenido != null && contenido.equals(objeto)) {
                caja.setContenido(null); // eliminamos el contenido
                return contenido; // retornamos lo que eliminamos
            }
        }
        return null; // si no se encuentra
    }

    // 4.3 Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Posicion\tColor Caja\tObjeto\n");
        for (int i = 0; i < cajas.size(); i++) {
            Caja<T> caja = cajas.get(i);
            sb.append((i + 1)).append("\t\t")
              .append(caja.getColor()).append("\t\t")
              .append(caja.getContenido()).append("\n");
        }
        return sb.toString();
    }
}
