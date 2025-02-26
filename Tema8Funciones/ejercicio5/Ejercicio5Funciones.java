package ejercicio5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5Funciones {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();

        try (Scanner sc = new Scanner(System.in)) {
            int[] arrayDondeBuscarIndices = new int[10];
            for (int i = 0; i < arrayDondeBuscarIndices.length; i++) {
                arrayDondeBuscarIndices[i] = numeroAleatorio.nextInt(1, 11);
            }
            System.out.println("Escribe un numero del (1-10) un numero para ver si se encuentra en la lista: ");
            int numeroBuscar = sc.nextInt();

            int[] indices = buscarTodos(arrayDondeBuscarIndices, numeroBuscar);
            System.out.println(Arrays.toString(arrayDondeBuscarIndices));
            System.out.println(Arrays.toString(indices));
        }

    }

    /*
     * Realiza la función: int[] buscarTodos(int t[], int valor),
     * que crea y devuelve una tabla con todos los índices de los elementos donde se
     * encuentra el valor de búsqueda.
     * En el caso de que el valor no se encuentre en la tabla t, la función
     * devolverá una tabla vacía.
     * 
     */

    // REHAZLO AQUI

    public static int[] buscarTodos(int[] array, int clave) {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (clave == array[i]) {
                contador++;
            }

        }

        int[] arrayIndices = new int[contador]; // Creamos un array con la longitud de contador (si apareció 3 veces el
                                                // array sera de 3 casillas)
        contador = 0; // Lo machacamos a 0
        for (int i = 0; i < array.length; i++) { // Recorremos el array
            if (clave == array[i]) { // si coincide
                arrayIndices[contador] = i; // entonces a la posicion de 'arrayIndices' en el valor contado (si hay 3
                                            // [0,1,2]) en este caso es 0
                contador++;// y lo incrementamos
            }
        }
        return arrayIndices;

    }

}
