package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // creamos una lista para guardar chocolatinas
        List<Chocolatina> bolsaChocolatinas = new ArrayList<>(); 
        // agregamos chocolatinas a la lista
        bolsaChocolatinas.add(new Chocolatina("Milka")); 
        bolsaChocolatinas.add(new Chocolatina("Ferrero"));
        bolsaChocolatinas.add(new Chocolatina("Sublime"));
        System.out.println("Contenido de la bolsa de Chocolatinas:");
        // llamamos al metodo generico para mostrar la lista
        MostrarContenido.mostrarBolsa(bolsaChocolatinas);

        // creamos una lista para guardar golosinas
        List<Golosina> bolsaGolosinas = new ArrayList<>();
        // agregamos golosinas a la lista
        bolsaGolosinas.add(new Golosina("Chicle", 0.1));
        bolsaGolosinas.add(new Golosina("Caramelo", 0.2));
        bolsaGolosinas.add(new Golosina("Gomita", 0.3));
        System.out.println("\nContenido de la bolsa de Golosinas:");
        MostrarContenido.mostrarBolsa(bolsaGolosinas);
    }
}
