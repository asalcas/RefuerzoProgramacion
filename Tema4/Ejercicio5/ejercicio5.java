package Ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {
    
    // Numero introducido: numRandom1 = 20
    // Numero introducido: numRandom2 = 20
    // Resultado esperado: 40
    //* Resultado Obtenido: 40
    public static void main(String[] args) {
        // Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) 
        // y el usuario tiene que sumarlos. La aplicación le pedirá al usuario que introduzca el resultado de la suma. 
        // La aplicación le indicará si el resultado es correcto o no.
        Random randomizarNumeros = new Random();
        Scanner lector = new Scanner(System.in);
        int numRandom1 = randomizarNumeros.nextInt(99);
        int numRandom2 = randomizarNumeros.nextInt(99);
        int numUsuario;
        int solucion;
        System.out.println("Atento, tienes 5 segundos para dar una respuesta! ¿Preparado?: ");
        System.out.println("El primer numero es el: " + numRandom1);
        System.out.println("El segundo numero es el: " + numRandom2);
        System.out.println("LA OPERACION COMIENZA YA: ");
        System.out.println("\t "+numRandom1);
        System.out.println("\t+"+numRandom2);
        System.out.println("__________________");
        
        numUsuario = lector.nextInt();
        
        solucion = numRandom1 + numRandom2; 

        System.out.println("Tu respuesta ha sido... " + ((numUsuario == solucion) ? "CORRECTA": "ERRONEA"));

        /*if (numUsuario == solucion){
            System.out.println("Tu respuesta ha sido... CORRECTA");
        }else {
            System.out.println("Tu respuesta ha sido... ERRONEA");
        }*/
        lector.close();
    }
}
