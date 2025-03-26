package Ejercicio3;

public class Principal {
    public static void main(String[] args) {
        Cajoneria<Golosina> cajoneria = new Cajoneria<>(2);

        // Cajas con color
        Caja<Golosina> caja1 = new Caja<>("Rojo");
        caja1.setContenido(new Golosina("Chicle", 0.1));

        Caja<Golosina> caja2 = new Caja<>("Azul");
        caja2.setContenido(new Golosina("Caramelo", 0.2));

        // Agregar cajas a la cajonería
        cajoneria.add(caja1);
        cajoneria.add(caja2);

        // Mostrar el contenido de cada caja
        for (Caja<Golosina> caja : cajoneria) {
            System.out.println("Caja color: " + caja.getColor() +
                    " -> Golosina: " + caja.getContenido().getNombre() +
                    " (Peso: " + caja.getContenido().getPeso() + ")");
        }
    }
}

