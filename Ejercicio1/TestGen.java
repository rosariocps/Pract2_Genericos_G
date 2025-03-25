package Ejercicio1;

public class TestGen {
    // metodo para buscar un elemento en un array
    public static <T> boolean exist(T[] array, T elemento) {
        for (T item : array) { // recorre el array
            if (item.equals(elemento)) { // si encuentra el elemento
                return true; // devuelve verdadero
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        System.out.println(exist(v, "Sanchez") ? "Elemento encontrado: Sanchez" : "Elemento no encontrado: Sanchez");

        Integer[] w = {12, 34, 56};
        System.out.println(exist(w, 34) ? "Número encontrado: 34" : "Número no encontrado: 34");
        
        //objetos de Golosina
        Golosina g1 = new Golosina("chicle", 0.1);
        Golosina g2 = new Golosina("caramelo", 0.2);
        Golosina[] golosinas = {g1, g2}; // array de golosinas
        // y buscamos una golosina
        System.out.println(exist(golosinas, new Golosina("caramelo", 0.2)) ? "Golosina encontrada: caramelo" : "Golosina no encontrada: caramelo");

        //objetos de Chocolatina
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");
        Chocolatina[] chocolates = {c1, c2}; // array de chocolatinas
        // y buscamos una chocolatina
        System.out.println(exist(chocolates, c2) ? "Chocolatina encontrada: Ferrero" : "Chocolatina no encontrada: Ferrero");
    }
}
