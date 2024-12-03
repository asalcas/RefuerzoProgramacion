package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String respuestaUsuario;
        int dado1 = 0;
        int dado2 = 0;
        int suma;
        boolean funcionando;

        do {
            funcionando = true;
            System.out.println("Estas jugando Rol, y te han hecho tirar un dado de 6, cuanto has sacado?");
            respuestaUsuario = lector.nextLine().toUpperCase();

            switch (respuestaUsuario) {
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
                    funcionando = false;
                    System.out.println("Tienes que dar un resultado valido.");

                    break;
            }

        } while (!funcionando);

        do {
            funcionando = true;
            System.out.println("Y en el segundo dado?");
            respuestaUsuario = lector.nextLine().toUpperCase();
            switch (respuestaUsuario) {
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
                    System.out.println("Tienes que dar un resultado valido.");
                    funcionando = false;
                    break;

            }
        } while (!funcionando);

        suma = dado1 + dado2;
        System.out.println("La suma de " + dado1 + " y " + dado2 + " = " + suma);

    }
}
