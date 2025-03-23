package ejercicio3.ConversorUnidadesGenerico;

import java.util.Arrays;
import java.util.List;

public class Main {

    // Método genérico para validar si dos unidades son compatibles
    public static <T> boolean validarCompatibilidad(String tipo1, String tipo2) {
        List<String> longitud = Arrays.asList("metros", "pies", "pulgadas");
        List<String> masa = Arrays.asList("kilogramos", "libras", "onzas");
        List<String> temperatura = Arrays.asList("celsius", "fahrenheit", "kelvin");
        List<String> tiempo = Arrays.asList("segundos", "minutos", "horas");

        return (longitud.contains(tipo1) && longitud.contains(tipo2)) ||
               (masa.contains(tipo1) && masa.contains(tipo2)) ||
               (temperatura.contains(tipo1) && temperatura.contains(tipo2)) ||
               (tiempo.contains(tipo1) && tiempo.contains(tipo2));
    }

    // Método genérico para mostrar el resultado
    public static <T> void mostrarResultado(Unidad<T> resultado) {
        if (resultado != null) {
            System.out.println("Resultado: " + resultado.getValor() + " " + resultado.getTipoUnidad());
        } else {
            System.out.println("Error: No se pudo realizar la conversión.");
        }
    }
}