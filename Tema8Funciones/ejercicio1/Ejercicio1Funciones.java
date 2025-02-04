package ejercicio1;

import java.util.Arrays;



public class Ejercicio1Funciones {
    public static void main(String[] args) {
    int[] arrayNumeros = new int[10];
    int resultado;

    Arrays.fill(arrayNumeros,10);
    resultado = sumarEnterosArray(arrayNumeros);
    System.out.println(resultado);

    }
    /**
     * Funcion que devuelve la suma de todos los enteros de un array.
     * @param arrayNumeros
     * @return sumaTotal 
     * pre: Array no sea null
     * 
     */
    public static int sumarEnterosArray(int[] arrayNumeros){
        int sumaTotal = 0;
        for(int i = 0; i < arrayNumeros.length; i++){
            sumaTotal += arrayNumeros[i];
        }
        return sumaTotal;
    }
    /**
     * Saca la media de la suma total de los numeros del array (Extra)
     * @param arrayNumeros
     * @return
     */
    public static int sacarMediaArray(int[] arrayNumeros){
        int sumaTotal = sumarEnterosArray(arrayNumeros);
        return sumaTotal / arrayNumeros.length;
    }
    
}

