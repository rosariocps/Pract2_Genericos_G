package ejercicio3.ConversorUnidadesGenerico;

public class Unidad<T> {
    private T valor;
    private T tipoUnidad;

    public Unidad(T valor, T tipoUnidad){
        this.valor = valor;
        this.tipoUnidad = tipoUnidad;
    }
    
}
