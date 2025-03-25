package Ejercicio1;

class Chocolatina {
    private String marca;

    public Chocolatina(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    //para comparar si dos chocolatinas son iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // si son el mismo objeto --verdadero
        // si el objeto es nulo o de otra clase-- falso
        if (obj == null || getClass() != obj.getClass()) return false; 
        Chocolatina that = (Chocolatina) obj; // convierte el objeto a tipo Chocolatina
        return marca.equals(that.marca); // compara las marcas y devuelve el resultado
    }

    // este metodo es para devolver un codigo unico para la chocolatina
    @Override
    public int hashCode() {
        return marca.hashCode(); // usa el codigo hash de la marca
    }
}
