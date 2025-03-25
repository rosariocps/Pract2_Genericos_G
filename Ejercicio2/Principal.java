package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Chocolatina> bolsaChocolatinas = new ArrayList<>();
        bolsaChocolatinas.add(new Chocolatina("Milka"));
        bolsaChocolatinas.add(new Chocolatina("Ferrero"));
        bolsaChocolatinas.add(new Chocolatina("Sublime"));

        System.out.println("Contenido de la bolsa de Chocolatinas:");
        MostrarContenido.mostrarBolsa(bolsaChocolatinas);

        List<Golosina> bolsaGolosinas = new ArrayList<>();
        bolsaGolosinas.add(new Golosina("Chicle", 0.1));
        bolsaGolosinas.add(new Golosina("Caramelo", 0.2));
        bolsaGolosinas.add(new Golosina("Gomita", 0.3));

        System.out.println("\nContenido de la bolsa de Golosinas:");
        MostrarContenido.mostrarBolsa(bolsaGolosinas);
    }
}
