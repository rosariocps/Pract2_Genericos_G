package Ejercicio2.GestorInventarioGenerico;

public class Producto<T extends Number> {
    private String nombre;
    private T precio;
    private T cantidad;

    //constructor
    public Producto(String nombre, T precio, T cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public T getPrecio() {
        return precio;
    }

    public T getCantidad() {
        return cantidad;
    }

    //setters
    public void setPrecio(T precio) {
        this.precio = precio;
    }

    public void setCantidad(T cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularValorTotal() {
        return precio.doubleValue() * cantidad.doubleValue();
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: " + precio + " | Cantidad: " + cantidad;
    }
}
