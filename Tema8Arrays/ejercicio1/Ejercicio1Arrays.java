package ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1Arrays{
    public static void main(String[] args) {
        int numerosRandom[] = new int [10];
        Random random = new Random();

        for(int i = 0; i < numerosRandom.length; i++){
            numerosRandom[i] = random.nextInt(1,101);

        }
        System.out.println("Los numeros aleatorios generados son: ");
        System.out.println(Arrays.toString(numerosRandom));
    }
}