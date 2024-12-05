package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Funcion dentro del main que "Piensa" en un numero y el usuario juega para
     * encontrar la respuesta, el programa da
     * pistas si esta cerca o lejos
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        System.out.println(
                "Juguemos a un juego, el ordenador pensará un numero, y tu tienes que adivinarlo. El ordenador te indicará si tu numero es mayor o menor al que pensó.");
        System.out.println("Introduce el numero que creas: ");
        int numeroUsuario = 0;
        int numeroFinal = random.nextInt(100) + 1; // Creamos un random hasta el (100 NO INCLUIDO) + 1 para incluirlo
        // System.out.println(numeroFinal);
        do {
            numeroUsuario = lector.nextInt(); // Leemos el numero del usuario
            if (numeroUsuario == numeroFinal) { // Si el numero es == al que pensó la maquina WIN!
                System.out.println("Enhorabuena!! Has dado con el numero correcto!");
            } else { // Por el contrario
                if (numeroUsuario > numeroFinal) { // Si el numero es mayor //! ESPABILAO POR RANGSO, NO POR SUMAS

                    if ((numeroUsuario - 5 == numeroFinal) && (numeroUsuario - 4 == numeroFinal)
                            || (numeroUsuario - 3 == numeroFinal) || (numeroUsuario - 2 == numeroFinal)
                            || (numeroUsuario - 1 == numeroFinal)) { // Y a su vez esta a 5 posiciones por arriba
                        System.out.println("Uiiii!!, estas muy cerca, pero es mayor!");
                    } else {
                        System.out.println(
                                "El numero que has introducido es mayor al que estoy pensando... \nSigue intendandolo ");
                    }
                } else if (numeroUsuario < numeroFinal) {// Si el numero es menor
                    if ((numeroUsuario + 5 == numeroFinal) && (numeroUsuario + 4 == numeroFinal)
                            || (numeroUsuario + 3 == numeroFinal) || (numeroUsuario + 2 == numeroFinal)
                            || (numeroUsuario + 1 == numeroFinal)) { // Y a su vez esta a 5 posiciones por abajo
                        System.out.println("Uiiii!!, estas muy cerca, pero es menor!");
                    } else {
                        System.out.println(
                                "El numero que has introducido es menor al que estoy pensando... \nSigue intendandolo ");
                    }
                }
                System.out.println("Introduce otro numero: ");
            }
        } while (numeroUsuario != numeroFinal);
        lector.close();
    }
}
