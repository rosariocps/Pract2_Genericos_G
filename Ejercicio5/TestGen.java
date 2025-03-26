package Ejercicio5;

public class TestGen {
    public static void main(String[] args) {
        Cajoneria<Golosina> cajoneria = new Cajoneria<>(5);

        // Creamos y agregamos cajas con golosinas
        cajoneria.add(crearCaja("Rojo", "Chicle", 0.1));
        cajoneria.add(crearCaja("Azul", "Caramelo", 0.2));
        cajoneria.add(crearCaja("Verde", "Gomita", 0.3));
        cajoneria.add(crearCaja("Amarillo", "Chocolate", 0.5));
        cajoneria.add(crearCaja("Morado", "Toffee", 0.4));

        // Buscar golosinas
        System.out.println("Buscando golosina: Caramelo (0.2 kg)");
        System.out.println(cajoneria.search(new Golosina("Caramelo", 0.2)));

        System.out.println("Buscando golosina: Menta (0.3 kg)");
        System.out.println(cajoneria.search(new Golosina("Menta", 0.3)));

        // Eliminar golosina
        System.out.println("\nEliminando golosina: Gomita (0.3 kg)");
        Golosina eliminada = cajoneria.delete(new Golosina("Gomita", 0.3));
        System.out.println(eliminada != null ? "Eliminado: " + eliminada : "No se encontró para eliminar");

        // Mostrar reporte final
        System.out.println("\nReporte final de la cajoneria:");
        System.out.println(cajoneria);
    }

    // Crear una caja con golosina
    public static Caja<Golosina> crearCaja(String color, String nombre, double peso) {
        Caja<Golosina> caja = new Caja<>(color);
        caja.setContenido(new Golosina(nombre, peso));
        return caja;
    }
}
