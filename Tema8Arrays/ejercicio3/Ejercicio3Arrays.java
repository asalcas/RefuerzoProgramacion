package ejercicio3;

import java.util.Scanner;

public class Ejercicio3Arrays {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] numerosUsuario = new int[10];

        for (int i = 0; i < numerosUsuario.length; i++) {
            System.out.print("Introduce un numero: ");
            numerosUsuario[i] = lector.nextInt();
        }
        for (int i = numerosUsuario.length - 1; i >= 0; i--) {
            System.out.println("El numero en posicion " + i + " es: " + numerosUsuario[i]);
        }
        lector.close();
    }

}
