package Ejercicio2.CalculadoraGenerica;

import java.util.Scanner;

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

    private static Number leerNumero(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next();
            }
        }
    }

    private static void realizarOperacion(int opcion, Operador<Number> operacion) {
        Number num1 = operacion.getValor1();
        Number num2 = operacion.getValor2();

        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + suma(num1, num2));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + resta(num1, num2));
                break;
            case 3:
                System.out.println("Resultado del producto: " + producto(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Resultado de la división: " + division(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                System.out.println("Resultado de la potencia: " + potencia(num1, num2));
                break;
        }
    }
    private static void realizarRaiz(int opcion, Number num) {
        if (opcion == 6) {
            if (num.doubleValue() < 0) {
                System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
            } else {
                System.out.println("Resultado de la raíz cuadrada: " + raizCuadrada(num));
            }
        } else if (opcion == 7) {
            System.out.println("Resultado de la raíz cúbica: " + raizCubica(num));
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("\n**** MENÚ DE OPERACIONES GENÉRICAS ****");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");
            System.out.print("Opción: ");
            
            if (!scanner.hasNextInt()){
                System.out.println("Error: debe ingresar una opcion valida");
                scanner.next();
                continue;
            }

            opcion = scanner.nextInt();
            if (opcion == 8) {
                System.out.println("El programa terminó :P");
                break;
            }
            System.out.print("Ingrese el primer número: ");
            Number num1 = leerNumero(scanner);

            Number num2 = null;
            if (opcion != 6 && opcion != 7) { 
                System.out.print("Ingrese el segundo número: ");
                num2 = leerNumero(scanner);
            }

            if (opcion >= 1 && opcion <= 5) {
                Operador<Number> operacion = new Operador<>(num1, num2);
                realizarOperacion(opcion, operacion);
            } else if (opcion == 6 || opcion == 7) {
                realizarRaiz(opcion, num1);
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scanner.close();

    }

}
