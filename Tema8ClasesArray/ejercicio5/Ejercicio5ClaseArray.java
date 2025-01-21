package ejercicio5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5ClaseArray {
    public static void main(String[] args) {
        int[] arrayLargo = new int[1000];
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroUsuario = 0;
        int contadorN = 0;
        String cadenaArray = "";
        

        for(int i = 0; i < arrayLargo.length; i++){
            arrayLargo[i] = rd.nextInt(0,99);
        }
        cadenaArray = Arrays.toString(arrayLargo);
        System.out.println(cadenaArray);

        System.out.println("Escribe un numero ver cuantas veces aparece en el array: ");
        numeroUsuario = sc.nextInt();

        for(int i = 0; i< arrayLargo.length; i++){
            if(numeroUsuario == arrayLargo[i]){
                contadorN++;
            }
        }
        if(contadorN > 0){
            System.out.println(String.format("Si existe en el array, y aparece %d veces", contadorN));
        }else{
            System.out.println("No, no aparece en la lista");
        }
        
        sc.close();
    }
}
