package Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 - 7, para saber que dia es: ");
        int opcionUsuario = lector.nextInt();
        switch (opcionUsuario) {
            case 1:
            System.out.println("Lunes");
                break;
            case 2:
            System.out.println("Martes");
                break;
            case 3:
            System.out.println("Miercoles");
                break;
            case 4:
            System.out.println("Jueves");
                break;
            case 5:
            System.out.println("Viernes");
                break;
            case 6:
            System.out.println("Sabado");
                break;
            case 7:
            System.out.println("Domingo");
                break;
            default:
                break;
        }
        lector.close();
    }

}
