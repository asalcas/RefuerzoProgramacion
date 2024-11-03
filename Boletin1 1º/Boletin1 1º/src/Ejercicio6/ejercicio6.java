package Ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe dos numeros para realizar operaciones: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1/num2;
        System.out.println("Las siguientes operaciones son: \n Suma: "+ suma + "\n Resta: " + resta + "\n Multiplicación: " + multiplicacion + "\n Division: " + division );

        
    }

}
