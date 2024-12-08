package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        hacerMedia10(lector);
    }

    public static void hacerMedia10(Scanner lector) {
        int sumaNumeros = 0;
        int numeroUser;
        int media;
        String cadenaNums = "";
        for (int i = 1; i <= 10; i++) {
            numeroUser = lector.nextInt();
            sumaNumeros += numeroUser;
            cadenaNums += numeroUser;
            System.out.println(cadenaNums + " ");
            // CONCATENAR EN UN STRING EL NUMERO USER PARA QUE SE VEAN QUE NUMEROS HAN SIDO
            if (i == 10) {
                media = sumaNumeros / 10;
                System.out.print("es: " + media);
            }
        }

    }
}
