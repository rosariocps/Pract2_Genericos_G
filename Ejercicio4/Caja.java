package Ejercicio4;

//Class Genérica Caja
public class Caja<T> {
    private String color;
    private T contenido;
    
    //Constructor
    public Caja(String color, T contenido) {
        this.color = color;
        this.contenido = contenido;
    }

    public String getColor() {
        return color;
    }

    public T getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Caja de color " + color + " con contenido: " + contenido;
    }
}