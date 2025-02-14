package ejercicio6;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6Funciones {

    public static void main(String[] args) {
        Random randInt = new Random();
        int numeroElementos = 3;
        int sizeArray = 6;
        int[] digitosSumar = new int[sizeArray];
        for (int i = 0; i < digitosSumar.length; i++) {
            digitosSumar[i] = randInt.nextInt(1,11);
        }

        System.out.println(Arrays.toString(digitosSumar));

        int[] arrayFinal = suma(digitosSumar, numeroElementos);
        System.out.println(Arrays.toString(arrayFinal));
    }




    public static int[] suma(int t[], int numElementos) {
        int[] suma = new int[numElementos + 1];

        for(int i = 0; i <= t.length - (numElementos + 1) ; i++){
            for(int j = i; j < numElementos + i; j++){
                suma[i] += t[j] ;
            }
        }
        return suma;
    }
}
