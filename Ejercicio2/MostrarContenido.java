package Ejercicio2;

import java.util.List;

public class MostrarContenido {
    public static <T> void mostrarBolsa(List<T> bolsa) {
        for (T elemento : bolsa) {
            System.out.println(elemento.toString());
        }
    }
}
