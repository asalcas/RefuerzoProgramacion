package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2ClaseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenaArray = "";
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        
        

        System.out.println("Escribe 10 numeros para el Primer Array: ");
        for (int i = 0; i < array1.length; i++){
            array1[i] = sc.nextInt();
            System.out.println("Escribe otro numero: ");
            cadenaArray = Arrays.toString(array1);
        }
        System.out.println(cadenaArray);

        System.out.println("Escribe 10 numeros para el Segundo Array: ");
        for(int i = 0; i < array2.length; i++){
            array2[i] = sc.nextInt();
            System.out.println("Escribe otro numero: ");
            cadenaArray = Arrays.toString(array2);
        }
        System.out.println(cadenaArray);

        System.out.println("\n¿Son iguales?");
        if(Arrays.equals(array1, array2)){
            System.out.println("Sí son iguales");
        }else {
            System.out.println("No son iguales");
        }
        sc.close();
    }
}
