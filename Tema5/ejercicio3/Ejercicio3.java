package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        boolean funcionando = true;
        System.out.println(
                "Introduce numeros positivos, y cuando quieras parar la ejecución introduce un numero negativo: ");
        while (funcionando) {
            int numUser = scanner.nextInt();
            if (numUser >= 0) {
                suma += numUser;
                contador++;
                System.out.println("Escribe otro numero: ");
            } else {
                funcionando = false;
            }
        }
        System.out.println("Has escrito " + contador + " numeros positivos.");
        System.out.println("Y la suma es: " + suma);
        scanner.close();
    }
}
