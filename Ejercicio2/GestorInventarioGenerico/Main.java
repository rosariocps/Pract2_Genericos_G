package Ejercicio2.GestorInventarioGenerico;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //metodo para verificar que solo se ingresen números (Integer o Double)
    private static Number leerNumero(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next();
            }
        }
    }

    //buscar un producto en el inventario
    private static Producto<Double> buscarProducto(List<Producto<Double>> inventario, String nombre) {
        for (Producto<Double> producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto<Double>> inventario = new ArrayList<>();
        int opcion;

        while (true) {
            System.out.println("\n**** MENÚ DE GESTOR INVENTARIO GENÉRICO ****");
            System.out.println("1. Agregar Producto al Inventario");
            System.out.println("2. Calcular el Valor Total del Inventario");
            System.out.println("3. Aplicar Descuento a un Producto");
            System.out.println("4. Incrementar Existencias de un Producto");
            System.out.println("5. Determinar el Producto Más Caro");
            System.out.println("6. Determinar el Producto Más Barato");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next();
                continue;
            }
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    Number precio = leerNumero(scanner);
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = leerNumero(scanner).intValue();
                    inventario.add(new Producto<>(nombre, precio.doubleValue(), cantidad));
                    System.out.println("Producto agregado :)");
                    break;
                
                case 2:
                    System.out.println("Valor total del inventario: " + Operador.calcularValorInventario(inventario));
                    break;

                case 3:
                    if (inventario.isEmpty()) {
                        System.out.println("El inventario está vacío :(");
                        break;
                    }
                    System.out.print("Ingrese el nombre del producto: ");
                    nombre = scanner.nextLine();
                    Producto<Double> productoDescuento = buscarProducto(inventario, nombre);
                    if (productoDescuento != null) {
                        System.out.print("Ingrese el porcentaje de descuento: ");
                        double descuento = leerNumero(scanner).doubleValue();
                        Operador.aplicarDescuento(productoDescuento, descuento);
                        System.out.println("Descuento aplicado -> Nuevo precio: " + productoDescuento.getPrecio());
                    } else {
                        System.out.println("Producto no encontrado en el inventario");
                    }
                    break;

                
            
                default:
                    break;
            }

            
        }
    }

}
