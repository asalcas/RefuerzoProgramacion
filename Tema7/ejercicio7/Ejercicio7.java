package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo para saber si es primo o no:");
        System.out.print("Tu Nº es: ");
        int numUser = lector.nextInt();

        boolean esSprimo = true;

        if (numUser > 0) {
            for (int i = 2; i < numUser; i++) {
                if (numUser % i == 0) {
                    esSprimo = false;
                    break;
                }

            }
            if (esSprimo) {
                System.out.println(numUser + " es primo.");
            } else {
                System.out.println(numUser + " no es primo.");
            }

        }else {
            System.out.println("Tienes que introducir un numero POSITIVO");
        }

    }
}
