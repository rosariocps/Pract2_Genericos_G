package Ejercicio2.CalculadoraGenerica;

import java.util.Scanner;

public class Main {
    //metodos genericos
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
    //metodo para verificar que solo se ingresen numeros (Integer o Double)
    private static Number leerNumero(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next(); //para descartar la entrada actual del usuario
            }
        }
    }
    // metodo solo para las opciones:suma,resta,producto,division,potencia. Recibe 2 numeros
    private static void realizarOperacion(int opcion, Operador<Number> operacion) {
        Number num1 = operacion.getValor1(); // de tipo Number
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
    
    // metodo solo para las opciones:raiz cuadrada y raiz cubica. Solo recibe un numero
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
            //Verificamos que la opcion sea un numero
            if (!scanner.hasNextInt()){
                System.out.println("Error: debe ingresar una opcion valida");
                scanner.next();
                continue;
            }
            opcion = scanner.nextInt();

            //opcion salir
            if (opcion == 8) {
                System.out.println("El programa terminó :P");
                break;
            }

            //lee el primer num
            System.out.print("Ingrese el primer número: ");
            Number num1 = leerNumero(scanner);

            Number num2 = null; //hacemos null al 2do num de inicio
            //si son las operaciones de raices no necesitamos el 2do num
            if (opcion != 6 && opcion != 7) {  //si son otras operaciones si usamos el 2do num
                System.out.print("Ingrese el segundo número: ");
                num2 = leerNumero(scanner);
            }

            //verificamos que opcion es para llamar a los metodos correspondientes
            if (opcion >= 1 && opcion <= 5) { //suma,resta,producto,division,potencia
                Operador<Number> operacion = new Operador<>(num1, num2);//dos parametros
                realizarOperacion(opcion, operacion);
            } else if (opcion == 6 || opcion == 7) { //raiz cuadrada y cubica
                realizarRaiz(opcion, num1);//un parametro
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scanner.close();

    }

}
