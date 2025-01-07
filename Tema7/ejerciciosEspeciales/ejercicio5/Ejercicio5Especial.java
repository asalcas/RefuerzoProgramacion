package ejercicio5;

import java.util.Scanner;

public class Ejercicio5Especial {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroUser;

        System.out.print("Dame un numero de 0 a 20 y lo repetiremos esas veces: ");
        numeroUser = lector.nextInt();
        if (numeroUser <= 20){
            for (int i = 1; i <= numeroUser; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(i);
                }
            System.out.println(" ");
            }
        }else{
            System.out.println("No has seguido las reglas, vuelve a ejecutar el programa");
        }

        lector.close();
    }
}
