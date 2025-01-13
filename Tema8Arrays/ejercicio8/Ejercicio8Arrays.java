package ejercicio8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8Arrays {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner lector = new Scanner(System.in);
        int[] array100 = new int[100];
        int numeroUsuario;
        int apariciones = 0;

        String cadenaArray= "";
        
        for (int i = 0; i < array100.length; i++){
        array100[i] =  rd.nextInt(1,11);
        }
        cadenaArray = Arrays.toString(array100);
        System.out.println(cadenaArray);
        System.out.print("Dime un numero para mostrarte en que posiciones aparece: ");
        numeroUsuario = lector.nextInt();

        for (int i = 0; i < array100.length; i++){
            if(numeroUsuario == array100[i]){
                System.out.println(String.format("El numero aparece en la posición: %d", i));
                apariciones++;
            }
        }
        System.out.println(String.format("En total aparece: %d veces.", apariciones));
        lector.close();
    }
}
