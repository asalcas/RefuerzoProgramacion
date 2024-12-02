package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Juguemos a un juego, el ordenador pensará un numero, y tu tienes que adivinarlo. El ordenador te indicará si tu numero es mayor o menor al que pensó.");
        System.out.println("Introduce el numero que creas: ");
        int numeroUsuario = lector.nextInt();
        int numeroFinal = random.nextInt(1-101);
        System.out.println(numeroFinal);
        do {

        } while (numeroUsuario != numeroFinal);
    }
}
