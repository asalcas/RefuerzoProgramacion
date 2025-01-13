package ejercicio10;

import java.util.Scanner;

public class Ejercicio10Especial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeroUsuario;
        int numeroAuxiliar = 0;
        int numeroTrabajado = 0;


        System.out.print("Introduce un numero para comprobar si es capicua o no: ");
        numeroUsuario = scanner.nextInt();

        if (numeroUsuario > 0){ //121
            numeroAuxiliar = numeroUsuario; // numeroauxiliar = 121
            while (numeroAuxiliar > 0){ // 121 > 0? T
                numeroTrabajado = numeroTrabajado * 10; // 1º: 0 * 10 = 0  2º: 1 * 10 = 10
                numeroTrabajado += numeroAuxiliar % 10; // 1º: 121 % 10 = 1 2º: 
                numeroAuxiliar = numeroAuxiliar / 10; // 1º: 121 / 10 = 12 2º: 
            }
            if (numeroUsuario == numeroTrabajado){
                System.out.println("Es capicúa");
            }else {
                System.out.println("No es capicúa");
            }
        }else {
            System.out.println("El numero debe ser mayor a 0, no tiene sentido que introduzcas un numero menor");
        }

        
        scanner.close();
    }
}
