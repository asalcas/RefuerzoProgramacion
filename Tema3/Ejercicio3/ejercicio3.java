package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = lector.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2 = lector.nextInt();
        System.out.println("Introduce que operación quieres hacer: \n 1. SUMAR \n 2. RESTAR \n 3. MULTIPLICAR \n 4. DIVIDIR");
        String respuestaUsuario = scanner.nextLine().toUpperCase();

        switch (respuestaUsuario) {
            case "SUMAR":
                System.out.println(num1 + num2);
                break;
            case "RESTAR":
                System.out.println(num1 - num2);
                break;
            case "MULTIPLICAR":
                System.out.println(num1 * num2);
                break;
            case "DIVIDIR":
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Esa opción no es válida, vuelve a ejecutar el programa.");
                break;
        }
        lector.close();
        scanner.close();
    }
}
