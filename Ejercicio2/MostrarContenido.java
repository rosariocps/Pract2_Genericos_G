package Ejercicio2;

import java.util.List;

public class MostrarContenido {
    // metodo generico que muestra el contenido de una lista
    public static <T> void mostrarBolsa(List<T> bolsa) {
        for (T elemento : bolsa) { // recorre cada elemento de la lista
            System.out.println(elemento.toString()); // imprime el elemento convertido a texto
        }
    }
}
