package Ejercicio9;

import java.util.Scanner;

public class ejercicio9 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cuantos años tienes?");
        int edad = scanner.nextInt();

        if (edad >= 18 ){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Aun eres menor de edad");
        }
    }

}
