package Ejercicio14;

import java.util.Scanner;

public class ejercicio14 {

    public static void main (String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto ha sacado el alumno en el 1er trimestre?");
        int nota1trim = scanner.nextInt();
        System.out.println("Cuanto ha sacado el alumno en el 2do trimestre?");
        int nota2trim = scanner.nextInt();
        System.out.println("Cuanto ha sacado el alumno en el 3er trimestre?");
        int nota3trim = scanner.nextInt();


        int boletin = (nota1trim + nota2trim + nota3trim) / 3;
        double expediente = (nota1trim + nota2trim + nota3trim) / 3.0;

        System.out.println("En el boletín la nota es: " + boletin);
        System.out.println("En el expediente academico la nota es de: " + String.format("%.2f%n", expediente));
    }

}
