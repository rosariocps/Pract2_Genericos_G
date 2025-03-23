package Ejercicio2.CalculadoraGenerica;

import java.util.Scanner;

import javax.crypto.AEADBadTagException;

public class Main {
    static <T extends Number> double suma(T valor1, T valor2){
        return valor1.doubleValue() + valor2.doubleValue();
    }
    static <T extends Number> double resta(T valor1, T valor2){
        return valor1.doubleValue() - valor2.doubleValue();
    }
    static <T extends Number> double producto(T valor1, T valor2){
        return valor1.doubleValue() + valor2.doubleValue();
    }
    static <T extends Number> double division(T valor1, T valor2){
        if (valor2.doubleValue()==0){
            throw new ArithmeticException("No se puede dividir por cero :/");
        }
        return valor1.doubleValue() / valor2.doubleValue();
    }
    static <T extends Number> double potencia(T base, T exponente){
        return Math.pow(base.doubleValue(),exponente.doubleValue());
    }
    static <T extends Number> double raizCuadrada(T valor){
        if (valor.doubleValue()< 0){
            throw new ArithmeticException("No se puede sacar raiz caudrada de un numero negativo");
        }
        return Math.sqrt(valor.doubleValue());
    }
    static <T extends Number> double raizCubica(T valor){
        return Math.cbrt(valor.doubleValue());
    }

}
