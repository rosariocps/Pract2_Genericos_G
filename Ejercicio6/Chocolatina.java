package Ejercicio6;

public class Chocolatina {
    private String marca;

    public Chocolatina(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Chocolatina c = (Chocolatina) obj;
        return marca.equals(c.marca);
    }

    @Override
    public String toString() {
        return marca;
    }
}

