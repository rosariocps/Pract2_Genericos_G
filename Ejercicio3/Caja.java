package Ejercicio3;

//clas generica Caja
public class Caja<T> {
    private String color;
    private T contenido;
    //constructor
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

