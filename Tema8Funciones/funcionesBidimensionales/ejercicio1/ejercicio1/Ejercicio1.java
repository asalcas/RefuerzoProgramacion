package ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

    /*
     * Realiza una función que reciba una tabla de dos dimensiones. A continuación,
     * debe devolver un array de dos posiciones que contenga el mínimo en la
     * posición 0 y el máximo en la posición 1. Define un método main que rellene un
     * array de 6 filas por 10 columnas con números enteros positivos comprendidos
     * entre 0 y 1000 (ambos incluidos). A continuación, debe llamar a la función
     * con este array y mostrar por consola los valores mínimo y máximo de la tabla.
     */

    public static void main(String[] args) {
        Random rd = new Random();
        String cadenaArray;

        int[][] arrayBidimensional = new int[6][10];
        int[] arrayMaximoMinimo;

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[0].length; j++) {
                arrayBidimensional[i][j] = rd.nextInt(0, 1001);
                System.out.print(arrayBidimensional[i][j] + "\t");
            }
            System.out.println();
        }
        arrayMaximoMinimo = maxMin(arrayBidimensional);
        cadenaArray = Arrays.toString(arrayMaximoMinimo);
        System.out.println(cadenaArray);

    }

    /**
     * Función que recorrerá un Array bidimensional y recogera el Máximo y el Mínimo
     * 
     * @param arrayBidimensional
     * @return MaximoMinimo
     */
    public static int[] maxMin(int[][] arrayBidimensional) {
        int sacarMinimo = 1000;
        int sacarMaximo = 0;
        int[] maximoMinimo = new int[2];

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[0].length; j++) {
                if (arrayBidimensional[i][j] > sacarMaximo) {
                    sacarMaximo = arrayBidimensional[i][j];
                }
                if (arrayBidimensional[i][j] < sacarMinimo) {
                    sacarMinimo = arrayBidimensional[i][j];
                }
            }
        }
        maximoMinimo[0] = sacarMinimo;
        maximoMinimo[1] = sacarMaximo;

        return maximoMinimo;
    }
}
