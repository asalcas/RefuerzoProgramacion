package Ejercicio11;

import java.util.Scanner;

public class ejercicio11 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor en pesetas, y lo transformaremos a euros. (1€ = 166ptas): " );
        int pesetas = scanner.nextInt();
        double euros = pesetas / 166;
        System.out.println(pesetas +" son " + euros + " :)");

    }

}
