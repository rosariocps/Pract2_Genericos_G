package ejercicio3.ConversorUnidadesGenerico;

public class Unidad<T> {
    private T valor;
    private String tipoUnidad;

    //Contructor
    public Unidad(T valor, T tipoUnidad){
        this.valor = valor;
        this.tipoUnidad = tipoUnidad;
    }

    //Getters
    public T getValor(){
        return valor;
    }
    public T getTipoUnidad(){
        return tipoUnidad;
    }

    //Setters
    public void setValor(T valor){
        this.valor = valor;
    }
    public void setTipoUnidad(T tipoUnidad){
        this.tipoUnidad = tipoUnidad;
    }

}
