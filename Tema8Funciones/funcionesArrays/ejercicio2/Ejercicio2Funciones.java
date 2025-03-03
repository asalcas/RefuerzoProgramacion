package ejercicio2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2Funciones {
    public static void main(String[] args) {
        Random rd = new Random();
        int numeroMaximoArray;
        int[] t = new int[10];
        int[] arrayNuevo;
        String cadenaArray;

        arrayNuevo = rellenarArrayAleatoriamente(t, rd);
        cadenaArray = Arrays.toString(arrayNuevo);
        numeroMaximoArray = obtenerMaximo(t);
        System.out.println("El array es: " + cadenaArray);
        System.out.println("El numero mayor del array es: " + numeroMaximoArray);
    }

    /**
     * Funcion que rellena el array con numeros aleatorios entre 1-10
     * @param t
     * @param rd
     * @return
     */
    public static int[] rellenarArrayAleatoriamente(int t[], Random rd) {
        for (int i = 0; i < t.length - 1; i++) {
            t[i] = rd.nextInt(1, 10);
        }
        return t;
    }

    /**
     * Funcion que recorre el array y busca el mayor INT
     * @param t
     * @return
     */
    public static int obtenerMaximo(int t[]) {
        int auxiliar = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > auxiliar) {
                auxiliar = t[i];
            }
        }
        return auxiliar;
    }
}
