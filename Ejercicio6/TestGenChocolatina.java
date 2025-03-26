package Ejercicio6;

public class TestGenChocolatina {
    public static void main(String[] args) {
        Cajoneria<Chocolatina> cajoneria = new Cajoneria<>(5);

        // Agregar 5 chocolatinas en cajas de colores
        cajoneria.add(crearCaja("Rosa", "Milka"));
        cajoneria.add(crearCaja("Celeste", "Ferrero"));
        cajoneria.add(crearCaja("Negro", "Nestlé"));
        cajoneria.add(crearCaja("Blanco", "Lindt"));
        cajoneria.add(crearCaja("Dorado", "Sublime"));

        // Buscar chocolatinas
        System.out.println("Buscando chocolatina: Ferrero");
        System.out.println(cajoneria.search(new Chocolatina("Ferrero")));

        System.out.println("Buscando chocolatina: Costa");
        System.out.println(cajoneria.search(new Chocolatina("Costa")));

        // Eliminar una chocolatina
        System.out.println("\nEliminando chocolatina: Nestlé");
        Chocolatina eliminada = cajoneria.delete(new Chocolatina("Nestlé"));
        System.out.println(eliminada != null ? "Eliminado: " + eliminada : "No se encontró para eliminar");

        // Mostrar reporte final
        System.out.println("\nReporte final de la cajoneria:");
        System.out.println(cajoneria);
    }

    // Crear una caja con golosina
    public static Caja<Chocolatina> crearCaja(String color, String marca) {
        Caja<Chocolatina> caja = new Caja<>(color);
        caja.setContenido(new Chocolatina(marca));
        return caja;
    }
}



