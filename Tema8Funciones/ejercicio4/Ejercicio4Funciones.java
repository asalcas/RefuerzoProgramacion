package ejercicio4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4Funciones {
    public static void main(String[] args) {
        int[] t = new int[19];
        Scanner sc = new Scanner(System.in);
        int claveUsuarioBusqueda;
        int coincide ;

        llenarArray(t);
        System.out.println("Intoduce un numero para buscarlo en la lista: (1-10)");
        claveUsuarioBusqueda = sc.nextInt();
        coincide = buscar(t, claveUsuarioBusqueda);
        if (coincide == -1){
            System.out.println("No está en la lista");
        }else{
            System.out.println("Está, y su posicion es: " + coincide);
        }
        
    }

    public static int buscar(int[] t, int clave){
        int encontrado = 0;
        for(int i = 0; i < t.length;i++){
            if( clave == t[i]){


                encontrado = i; 
                
            }else{
                encontrado = -1; // ESTA MACHACANDO TODO EL RATO con -1 el resultado
            }

        }
        System.out.println(Arrays.toString(t));
        return encontrado;
    }
    public static void llenarArray(int[] t){
        
        Random rd = new Random();
        for(int i = 0; i < t.length; i++){
            t[i] = rd.nextInt(1,10);
        }
    }
}
