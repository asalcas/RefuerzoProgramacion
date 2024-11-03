package Ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero y te dire si es par o impar: ");
        int numeroIntroducido = scanner.nextInt();

        if (numeroIntroducido % 2 == 0) {
            System.out.println("El numero es Par");
        }else {
            System.out.println("El numero es Impar");
        }
    }

}
