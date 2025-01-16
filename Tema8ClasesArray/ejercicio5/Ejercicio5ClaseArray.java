package ejercicio5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5ClaseArray {
    public static void main(String[] args) {
        int[] arrayLargo = new int[10];
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroUsuario;
        int contadorN = 0;
        String cadenaArray = "";
        int[] arrayOrdenado;


        for(int i = 0; i < arrayLargo.length; i++){
            arrayLargo[i] = rd.nextInt(0,99);
        }
        cadenaArray = Arrays.toString(arrayLargo);
        System.out.println(cadenaArray);
        numeroUsuario = sc.nextInt();

        int cosa;
        
        /* Nada, otra vez se me ha olvidado usar la funcion, tontisimo 
        
        for(int i = 0; i< arrayLargo.length; i++){
            if(numeroUsuario == arrayLargo[i]){
                contadorN++;
            }
        }
        if(contadorN > 0){
            System.out.println(String.format("Si existe, y aparece %d veces", contadorN));
        }else{
            System.out.println("No, no aparece en la lista");
        }
        */
        Arrays.sort(arrayLargo);
        cosa = Arrays.binarySearch(arrayLargo, numeroUsuario);
        
        System.out.println(cosa);
        sc.close();
    }
}
