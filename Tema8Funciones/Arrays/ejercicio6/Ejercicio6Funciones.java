package Arrays.ejercicio6;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6Funciones {

    public static void main(String[] args) {
        Random random = new Random();
        int sizeArray = 6;
        int numeroElementos = 3;
        int[] arrayEjemplo = new int[sizeArray];

        for (int i = 0; i < arrayEjemplo.length; i++) {
            arrayEjemplo[i] = random.nextInt(1, 11);
        }
        String arrayParaSumar = Arrays.toString(arrayEjemplo);
        System.out.println(arrayParaSumar);

        int[] arrayFinal = suma(arrayEjemplo, numeroElementos);
        arrayParaSumar = Arrays.toString(arrayFinal);
        System.out.println(arrayParaSumar);
    }




    public static int[] suma(int aEjemplo[], int numeroElementos) {
        int[] arrayResultado = new int[numeroElementos + 1];
        for (int i = 0; i <= aEjemplo.length - numeroElementos; i++) {
            for (int j = i; j < numeroElementos + i; j++) {
                arrayResultado[i] += aEjemplo[j];
            }

        }
        return arrayResultado;
    }

}
