package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5Arrays {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int respuestaUser;
        int sumaNumeros = 0;
        String cadenaArray = "";

        int[] numerosUsuario = new int[10];
        
        for (int i = 0; i < numerosUsuario.length; i++){
            System.out.print("Escribe un numero: ");
            respuestaUser = lector.nextInt();
            numerosUsuario[i] = respuestaUser;
            sumaNumeros += numerosUsuario[i];
        }

        cadenaArray = Arrays.toString(numerosUsuario);
        System.out.println("El array en cuestion: " + cadenaArray + " y su suma es de: " + sumaNumeros);
        lector.close();
    }
}
