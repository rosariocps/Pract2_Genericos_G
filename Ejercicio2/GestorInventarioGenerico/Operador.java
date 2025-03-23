package Ejercicio2.GestorInventarioGenerico;
import java.util.List;

public class Operador<T extends Number> {
    
    //calcula el valor total del inventario
    public static <T extends Number> double calcularValorInventario(List<Producto<T>> productos) {
        double total = 0;
        for (Producto<T> producto : productos) {
            total += producto.calcularValorTotal();
        }
        return total;
    }

    //aplica un descuento a un producto
    public static <T extends Number> void aplicarDescuento(Producto<T> producto, double porcentaje) {
        double nuevoPrecio = producto.getPrecio().doubleValue() * (1 - porcentaje / 100);
        producto.setPrecio((T) (Number) nuevoPrecio);
    }

    //agrega Stock en un producto
    public static <T extends Number> void AgregarStockProducto(Producto<T> producto, T cantidad) {
        double nuevaCantidad = producto.getCantidad().doubleValue() + cantidad.doubleValue();
        producto.setCantidad((T) (Number) nuevaCantidad);
    }
}
