package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    // Funcion main que pide al usuario 10 Nº por consola, SUMA los numeros
    // positivos, SUMA y hace la MEDIA de los negativos y cuenta el numero de 0
    // Numeros de 0 introducido: 6
    // Numero esperado de contadorCeros = 6
    // Numeros positivos introducidos: 3 (5, 5, 5)
    // Numeros negativos introducidos: 2 (-2)
    // Numero esperado de la MEDIA de POSITIVOS = 2
    // * Resultado obtenido 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int contadorCeros = 0;
        int contadorNegativos = 0;

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int media = 0;

        System.out.println("Escribe 10 numeros");
        while (contador < 10) {
            int numUser = scanner.nextInt();
            if (numUser == 0) {
                contadorCeros++;
            } else if (numUser > 0) {
                sumaPositivos += numUser;
            } else {
                sumaNegativos += numUser;
                contadorNegativos++;
            }
            contador++;
        }
        if(contadorNegativos != 0) {
            media = sumaNegativos / contadorNegativos;
        }
        
        System.out.println("La suma de los numeros POSITIVOS es: " + sumaPositivos);
        System.out.println("Has escrito: " + contador + "Nº, y se esperaban 10.");
        System.out.println("El numero de 0 es de: " + contadorCeros);
        System.out.println("Y la media de los numeros negativos es: " + media);
        scanner.close();
    }
}
