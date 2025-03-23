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

    //agrega stock en un producto
    public static <T extends Number> void AgregarStockProducto(Producto<T> producto, int cantidad) {
        int nuevaCantidad = producto.getCantidad() + cantidad;
        producto.setCantidad(nuevaCantidad);
    }

    //producto mas caro
    public static <T extends Number> Producto<T> productoMasCaro(List<Producto<T>> productos) {
        if (productos.isEmpty()) return null;
        Producto<T> masCaro = productos.get(0);
        for (Producto<T> p : productos) {
            if (p.getPrecio().doubleValue() > masCaro.getPrecio().doubleValue()) {
                masCaro = p;
            }
        }
        return masCaro;
    }

    //producto mas barato
    public static <T extends Number> Producto<T> productoMasBarato(List<Producto<T>> productos) {
        if (productos.isEmpty()) return null;
        Producto<T> masBarato = productos.get(0);
        for (Producto<T> p : productos) {
            if (p.getPrecio().doubleValue() < masBarato.getPrecio().doubleValue()) {
                masBarato = p;
            }
        }
        return masBarato;
    }
}
