package Ejercicio1;

class Golosina {
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

    // para comparar si dos golosinas son iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // si son el mismo objeto -- verdadero
        if (obj == null || getClass() != obj.getClass()) return false; // si es nulo o de otra clase-- falso
        Golosina golosina = (Golosina) obj; // convierte el objeto a tipo Golosina
        return Double.compare(golosina.peso, peso) == 0 && nombre.equals(golosina.nombre); // compara peso y nombre
    }

    // este metodo es para devolver un codigo unico para la golosina
    @Override
    public int hashCode() {
        return nombre.hashCode(); // usa el codigo hash del nombre
    }
}

