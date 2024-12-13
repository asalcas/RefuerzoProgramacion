package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println(
                "============================================================================================");
        System.out.println(
                "| Introduce un numero tope para decirte todos los multiplos de 3 hasta llegar a ese numero |");
        System.out.println(
                "============================================================================================");
        int numeroIntroducido = lector.nextInt();
        lector.nextLine(); // Limpiando el buffer trás un nextInt()

        sacarMultiplos3(numeroIntroducido); // Pasamos por parametros a la funcion "sacarMultiplos3" el numero introducido por consola.
        lector.close();
    }

    /**
     * Función que itera desde 0 todos los numeros hasta "numIntroducido" y solo imprime los primos de 3
     * @param numIntroducido
     */
    public static void sacarMultiplos3(int numIntroducido) {
        int multiplos3 = 0;
        System.out.print("Los numeros: ");
        for (int i = 1; i <= numIntroducido; i++) { // SI "i" (que es 1) es MENOR o IGUAL a el numero que ha dicho el usuario, itera
            if (i % 3 == 0) { // Si al dividirlo entre 3 el resto es 0 (multiplo de 3) entonces
                multiplos3 = i; // Le damos el valor a "multiplos3" de "i" 
                System.out.print(multiplos3 + " "); // Y lo imprimimos con un espacio después
                
            }
        }
        System.out.print("son multiplos de 3");

    }
}