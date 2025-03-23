package Ejercicio1.CalculadoraGenerica;

public class Operador<T extends Number>{ 
    //Number es una clase abstracta que solo recibe datos de tipos numericos primitivos
    private T valor1;
    private T valor2;

    //constructor
    public Operador(T valor1, T valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    //getters
    public T getValor1(){
        return valor1;
    }
    public T getValor2(){
        return valor2;
    }
}