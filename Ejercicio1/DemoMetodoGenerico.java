package Ejercicio1;

class DemoMetodoGenerico {
    // metodo generico para comparar dos arrays
    static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {
        if (x.length != y.length) return false; // si tienen diferente tamaño--falso
        for (int i = 0; i < x.length; i++) { // aqui recorremos los elementos del array
            if (!x[i].equals(y[i])) return false; // si hay un elemento diferente --falso
        }
        return true; // si todos son iguales-- verdadero
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};

        if (igualArrays(nums, nums2)) 
            System.out.println("nums es igual a nums2");
        if (igualArrays(nums, nums3)) 
            System.out.println("nums es igual a nums3");
        if (igualArrays(nums, nums4)) 
            System.out.println("nums es igual a nums4");
    }
}
