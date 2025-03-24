package ejercicio4.SimuladorOperacionFinancieraGenerico;

import java.util.Scanner;

public class Main {
    // Valida los datos financieros
    public static <T extends Number> boolean validarDatos(T monto, T interes, int plazo) {
        return monto.doubleValue() > 0 && interes.doubleValue() > 0 && plazo > 0;
    }

    // Muestra resultado
    public static void mostrarResultado(String descripcion, double resultado, String unidad) {
        System.out.println(descripcion + ": " + resultado + " " + unidad);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Operador<Double> operador = new Operador<>();
            
            int opcion;
            
            do {
                System.out.println("\nMenú de SimuladorOperacionFinancieraGenerico:");
                System.out.println("1. Calcular interés simple de un Préstamo.");
                System.out.println("2. Calcular interés compuesto de una inversión.");
                System.out.println("3. Convertir Moneda.");
                System.out.println("4. Salir del Programa.");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();
                
                if (opcion == 1 || opcion == 2) {
                    System.out.print("Ingrese el monto: ");
                    double monto = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de interés (decimal, ej. 0.05): ");
                    double interes = scanner.nextDouble();
                    System.out.print("Ingrese el plazo en días: ");
                    int plazo = scanner.nextInt();
                    
                    if (validarDatos(monto, interes, plazo)) {
                        OperacionFinanciera<Double> operacion = new OperacionFinanciera<>(monto, interes, plazo);
                        if (opcion == 1) {
                            double resultado = operador.calcularInteresSimple(operacion);
                            mostrarResultado("Interés simple calculado", resultado, "moneda");
                        } else {
                            double resultado = operador.calcularInteresCompuesto(operacion);
                            mostrarResultado("Interés compuesto calculado", resultado, "moneda");
                        }
                    } else {
                        System.out.println("Datos inválidos. Todos los valores deben ser positivos.");
                    }
                    
                } else if (opcion == 3) {
                    System.out.print("Ingrese la cantidad: ");
                    double cantidad = scanner.nextDouble();
                    scanner.nextLine(); // limpiar buffer
                    
                    System.out.print("Ingrese moneda de origen (soles, dolares, euros): ");
                    String origen = scanner.nextLine().toLowerCase();
                    
                    System.out.print("Ingrese moneda de destino (soles, dolares, euros): ");
                    String destino = scanner.nextLine().toLowerCase();
                    
                    double convertido = operador.convertirMoneda(cantidad, origen, destino);
                    mostrarResultado("Resultado de conversión", convertido, destino);
                } else if (opcion != 4) {
                    System.out.println("Opción inválida.");
                }
                
            } while (opcion != 4);
            
            System.out.println("Programa finalizado.");
        }
    }    
}
