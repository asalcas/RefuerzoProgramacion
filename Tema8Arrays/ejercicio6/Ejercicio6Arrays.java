package ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6Arrays {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] arrayNumeros = new int[8];
        int respuestaUser;
        int indiceBusqueda = 0;
        String cadenaArray = "";
        int valor;

        for(int i = 0; i < arrayNumeros.length; i++){
        System.out.print("Escribe un numero: ");
        respuestaUser = lector.nextInt();
        arrayNumeros[i] = respuestaUser;
        }

        while(indiceBusqueda < arrayNumeros.length){
            valor = arrayNumeros[indiceBusqueda];
            System.out.print("El numero: " + valor);
            indiceBusqueda++;
            if (valor % 2 == 0){
                System.out.println(" es par.");
            }else{
                System.out.println(" es impar.");
            }
            
        }
        cadenaArray = Arrays.toString(arrayNumeros);
        System.out.println("El array en cuestion es: " + cadenaArray);
        lector.close();
    }
    

}
