package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Introduce numeros positivos, y cuando quieras parar la ejecución introduce un numero negativo: ");
        boolean funcionando = true;
        int contador = 0;

        while (funcionando) {
            int numeroUser = scanner.nextInt();
            if (numeroUser >= 0) {
                contador++;
                System.out.println("Escribe otro numero");
            } else {
                funcionando = false;
            }

        }
        System.out.println("Has escrito " + contador + " numeros positivos.");
        scanner.close();
    }
}
