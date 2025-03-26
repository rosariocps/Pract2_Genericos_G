package Ejercicio4;

public class Golosina {
    private String nombre;
    private double peso;

    public Golosina(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    // Comparar objetos por su contenido
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Golosina g = (Golosina) obj;
        return Double.compare(g.peso, peso) == 0 && nombre.equals(g.nombre);
    }

    // Mostrar el objeto
    @Override
    public String toString() {
        return nombre + " (" + peso + " kg)";
    }
}
