package ejercicio3.ConversorUnidadesGenerico;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
    public static <T extends Number> void mostrarResultado(Unidad<T> resultado) {
        if (resultado != null) {
            System.out.println("Resultado: " + resultado.getValor() + " " + resultado.getTipoUnidad());
        } else {
            System.out.println("Error: No se pudo realizar la conversión.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Conversor<Double> conversor = new Conversor<>();
            
            int opcion;
            do {
                System.out.println("\nMenú de ConversorUnidadesGenerico:");
                System.out.println("1. Convertir longitud (metros, pies, pulgadas)");
                System.out.println("2. Convertir masa (kilogramos, libras, onzas)");
                System.out.println("3. Convertir temperatura (Celsius, Fahrenheit, Kelvin)");
                System.out.println("4. Convertir tiempo (segundos, minutos, horas)");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();
                
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el valor numérico: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Unidad de origen: ");
                    String unidadOrigen = scanner.nextLine().toLowerCase();
                    
                    System.out.print("Unidad de destino: ");
                    String unidadDestino = scanner.nextLine().toLowerCase();
                    
                    // Creamos la unidad original
                    Unidad<Double> unidad = new Unidad<>(valor, unidadOrigen);
                    
                    // Validamos compatibilidad usando método genérico
                    if (validarCompatibilidad(unidadOrigen, unidadDestino)) {
                        Unidad<Double> resultado = conversor.convertirUnidad(unidad, unidadDestino);
                        mostrarResultado(resultado); // Usamos método genérico
                    } else {
                        System.out.println("Unidades incompatibles. Intente nuevamente.");
                    }
                } else if (opcion != 5) {
                    System.out.println("Opción inválida.");
                }
                
            } while (opcion != 5);
            
            System.out.println("Programa finalizado.");
        }
    }

}

