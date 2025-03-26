package Ejercicio6;

//Class Genérica Caja
public class Caja<T> {
    private String color;
    private T contenido;
    
    //Constructor
    public Caja(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Caja de color " + color + " con contenido: " + contenido;
    }
}
