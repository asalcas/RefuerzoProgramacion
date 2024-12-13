package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Vas a introducir 10 numeros distintos o iguales para que el programa haga la media.");

        hacerMedia10(lector);
    }

    public static void hacerMedia10(Scanner lector) {
        int sumaNumeros = 0;
        int numeroUser;
        int media;
        String cadenaNums = "";
        for (int i = 1; i <= 10; i++) { // Declaramos que el bucle va iterar 10 veces incrementando el valor de i++
            numeroUser = lector.nextInt();
            sumaNumeros += numeroUser; // Hacemos la suma de todos los numeros (que luego dividiremos en el if)
            cadenaNums += (numeroUser + " "); // Aqui lo que hacemos es crear una cadena de caracteres, a la que cada
            // iteracion lo que hacemos es añadirle el proximo int y un espacio
            System.out.println("Según la cuenta este es el Nº: " + i + ". Introduce otro numero!");

            if (i == 10) {
                media = sumaNumeros / 10; // Dividimos "sumaNumeros" que es el que ha ido acumulando todos los numeros
                // entre 10
                System.out.print("La media de: " + cadenaNums + "es: " + media);
            }

        }

    }
}
