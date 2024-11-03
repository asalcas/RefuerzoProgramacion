package Ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Cuantos años tienes?");
        int edad = scanner.nextInt();
        System.out.println("Hola "+ nombre + ", tienes " + edad+ " años, ¡qué mayor eres!");

    }
}
