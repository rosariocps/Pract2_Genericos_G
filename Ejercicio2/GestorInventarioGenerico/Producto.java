package Ejercicio2.GestorInventarioGenerico;

public class Producto<T extends Number> {
    private String nombre;
    private T precio;
    private int cantidad;

    //constructor
    public Producto(String nombre, T precio, int cantidad) {
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

    public int getCantidad() {
        return cantidad;
    }

    //setters
    public void setPrecio(T precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularValorTotal() {
        return precio.doubleValue() * cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: " + precio + " | Cantidad: " + cantidad;
    }
}
