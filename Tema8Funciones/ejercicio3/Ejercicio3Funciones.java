package ejercicio3;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3Funciones {
    public static void main(String[] args) {
        String cadenaArray = "";
        int[] arrayImprimir = rellenaPares(15, 8);
        cadenaArray = Arrays.toString(arrayImprimir);
        System.out.println(cadenaArray);
    }

    /***
     * Funcion que crea un array y lo rellena con numeros pares entre los numeros
     * introducidos por el usuario
     * 
     * @param longitud
     * @param fin
     * @return array con numeros pares
     */
    public static int[] rellenaPares(int longitud, int fin) {
        Random rd = new Random();
        int numeroRandom;
        int[] arrayParesRandom = new int[longitud];
        for (int i = 0; i < arrayParesRandom.length; i++) {
            do {
                numeroRandom = rd.nextInt(2, fin + 1);
            } while (numeroRandom % 2 != 0);
            arrayParesRandom[i] = numeroRandom;
        }
        Arrays.sort(arrayParesRandom);

        return arrayParesRandom;
    }

}
