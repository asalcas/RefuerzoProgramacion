package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2Arrays {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[] numerosUsuario = new double[5];
        String cadenaArray = "";
        for (int i = 0; i < numerosUsuario.length; i++){
            System.out.println("Escribe un numero: ");
            numerosUsuario[i] = lector.nextDouble();
        }
        for (int i = 0; i < numerosUsuario.length;i++){
            System.out.println("El numero introducido en la posición "+ i +" es: " + numerosUsuario[i]);
        }
        cadenaArray = Arrays.toString(numerosUsuario);
        System.out.println(cadenaArray);
        lector.close();
    }
}
