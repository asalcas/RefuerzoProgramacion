package ejercicio10;

import java.util.Scanner;

public class Ejercicio10Especial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeroUsuario;


        System.out.print("Introduce un numero para comprobar si es capicua o no:");
        numeroUsuario = scanner.nextInt();

        if (numeroUsuario > 0){

        // variable normal: 1234
        // variable aux: 1234
        // variable auxTrabajada: 4321
        // bajar con % 10
        // eliminar de la aux /10
        

        }else {
            System.out.println("El numero debe ser mayor a 0, no tiene sentido que introduzcas un numero menor >:(");
        }
    }
}
