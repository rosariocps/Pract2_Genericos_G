package Ejercicio4;

public class Principal {
    public static void main(String[] args) {
        Cajoneria<Golosina> cajoneria = new Cajoneria<>(3);

        Caja<Golosina> caja1 = new Caja<>("Rojo");
        caja1.setContenido(new Golosina("Chicle", 0.1));

        Caja<Golosina> caja2 = new Caja<>("Amarillo");
        caja2.setContenido(new Golosina("Caramelo", 0.2));

        Caja<Golosina> caja3 = new Caja<>("Verde");
        caja3.setContenido(new Golosina("Gomita", 0.3));

        cajoneria.add(caja1);
        cajoneria.add(caja2);
        cajoneria.add(caja3);

        System.out.println(cajoneria.search(new Golosina("Caramelo", 0.2)));
        System.out.println("Eliminado: " + cajoneria.delete(new Golosina("Caramelo", 0.2)));
        System.out.println("\nReporte de cajonería:\n" + cajoneria);
    }
}
