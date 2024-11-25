package Tema4.Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int respuestaUser = scanner.nextInt();
        int valorAbsoluto;
        valorAbsoluto = (respuestaUser >= 0) ? respuestaUser : respuestaUser * -1;
        System.out.println("El valor absoluto de |" + respuestaUser + "| = " + valorAbsoluto);
        scanner.close();
    }

}
