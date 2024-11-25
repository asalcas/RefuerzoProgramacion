package Ejercicio4;


import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto has sacado en la primera tirada?: ");
        String respuestaUser = scanner.nextLine().toUpperCase();
        int dado1 = 0;
        // TIRADA 1
        switch (respuestaUser) {
            case "UNO":
                dado1 = 1;
                break;
            case "DOS":
                dado1 = 2;
                break;
            case "TRES":
                dado1 = 3;
                break;
            case "CUATRO":
                dado1 = 4;
                break;
            case "CINCO":
                dado1 = 5;
                break;
            case "SEIS":
                dado1 = 6;
                break;

            default:
                System.out.println("No debes escribir un tipo numerico, escribelo a mano");
                break;
        }
        System.out.println("Y el segundo dado?");
        respuestaUser = scanner.nextLine().toUpperCase();
        int dado2 = 0;
        switch (respuestaUser) {
            case "UNO":
                dado2 = 1;
                break;
            case "DOS":
                dado2 = 2;
                break;
            case "TRES":
                dado2 = 3;
                break;
            case "CUATRO":
                dado2 = 4;
                break;
            case "CINCO":
                dado2 = 5;
                break;
            case "SEIS":
                dado2 = 6;
                break;

            default:
                System.out.println("No debes escribir un tipo numerico, escribelo a mano");
                break;
        }

        int suma = dado1 + dado2;

        System.out.println(suma);
        scanner.close();
    }

}
