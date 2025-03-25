package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cajoneria {
    private List<Caja<?>> cajas;

    public Cajoneria() {
        this.cajas = new ArrayList<>();
    }

    public void agregarCaja(Caja<?> caja) {
        cajas.add(caja);
    }

    public void mostrarCajas() {
        for (Caja<?> caja : cajas) {
            System.out.println(caja);
        }
    }
}