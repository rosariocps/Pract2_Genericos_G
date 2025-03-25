package Ejercicio3;

public class Golosina {
    private String nombre;
    private double peso;

    public Golosina(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Golosina: " + nombre + " - " + peso + "g";
    }
}
