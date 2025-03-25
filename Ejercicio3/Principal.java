package Ejercicio3;

public class Principal {
    public static void main(String[] args) {
        Cajoneria cajoneria = new Cajoneria();
        Caja<String> caja1 = new Caja<>("Rojo", "Documentos");
        Caja<Integer> caja2 = new Caja<>("Azul", 100);
        Caja<Golosina> caja3 = new Caja<>("Verde", new Golosina("Caramelo", 0.2));
        Caja<Chocolatina> caja4 = new Caja<>("Amarillo", new Chocolatina("Sublime"));
        cajoneria.agregarCaja(caja1);
        cajoneria.agregarCaja(caja2);
        cajoneria.agregarCaja(caja3);
        cajoneria.agregarCaja(caja4);
        System.out.println("Contenido de la Cajoneria:");
        cajoneria.mostrarCajas();
    }
}
