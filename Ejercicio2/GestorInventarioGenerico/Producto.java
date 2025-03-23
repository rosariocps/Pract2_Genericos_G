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
}
