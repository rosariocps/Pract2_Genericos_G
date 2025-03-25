package ejercicio4.SimuladorOperacionFinancieraGenerico;

public class OperacionFinanciera<T extends Number> {
    private T monto;
    private T tasaInteres;
    private int plazoDias;

    // Constructor
    public OperacionFinanciera(T monto, T tasaInteres, int plazoDias) {
        this.monto = monto;
        this.tasaInteres = tasaInteres;
        this.plazoDias = plazoDias;
    }

    // Getters
    public T getMonto() {
        return monto;
    }

    public T getTasaInteres() {
        return tasaInteres;
    }

    public int getPlazoDias() {
        return plazoDias;
    }

    // Setters
    public void setMonto(T monto) {
        this.monto = monto;
    }

    public void setTasaInteres(T tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void setPlazoDias(int plazoDias) {
        this.plazoDias = plazoDias;
    }
}
