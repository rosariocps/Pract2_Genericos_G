package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cajoneria {
    private List<Caja<?>> cajas; //lista para almacenar cajas

    //constructor
    public Cajoneria() {
        this.cajas = new ArrayList<>();
    }

    public void agregarCaja(Caja<?> caja) {
        cajas.add(caja); //agregamos una caja
    }
    //para mostrar las cajas almacenadas
    public void mostrarCajas() {
        for (Caja<?> caja : cajas) { //recorremos en la lista
            System.out.println(caja);
        }
    }
}