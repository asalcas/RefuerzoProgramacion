package ejercicio3;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3ClaseArray {
    public static void main(String[] args) {
        Random rdm = new Random();
        int[] arrayOrdenado = new int[30];
        String cadenaArray = "";

        for(int i = 0; i< arrayOrdenado.length; i++){
            arrayOrdenado[i] = rdm.nextInt(0,10);
            
        }
        System.out.println("Antes de ordenarlo: ");
        cadenaArray = Arrays.toString(arrayOrdenado);
        System.out.println(cadenaArray);
        System.out.println("Despues de ordenarlo: ");
        Arrays.sort(arrayOrdenado);
        cadenaArray = Arrays.toString(arrayOrdenado);
        System.out.println(cadenaArray);

    }
}
