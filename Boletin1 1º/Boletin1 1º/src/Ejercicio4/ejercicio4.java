package Ejercicio4;

import java.util.Scanner;

public class ejercicio4 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las notas de los ultimos examenes: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Y la segunda nota...");
        double nota2 = scanner.nextDouble();
        double notaMedia = (nota1 + nota2) / 2;

        System.out.println("La media es: " + notaMedia);
    }
}
