package ejercicio6;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6Funciones {

    public static void main(String[] args) {
        Random randInt = new Random();
        int numeroElementos = 6;
        int[] digitosSumar = new int[numeroElementos];
        for (int i = 0; i < digitosSumar.length; i++) {
            digitosSumar[i] = randInt.nextInt(1,11);
        }
        System.out.println(Arrays.toString(digitosSumar));
    }

    public static int[] suma(int t[], int numElementos) {
        
        return t;
    }
}
