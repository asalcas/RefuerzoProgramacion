package Ejercicio5;


import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tipo de matricula que tienes: ");
        String tipoCarnet = scanner.nextLine().toUpperCase();

        switch (tipoCarnet) {
            case "E":
                System.out.println("Remolques");
                break;
            case "D":
                System.out.println("Autobuses");
                break;
            case "C-1":
                System.out.println("Camion");
                break;
            case "C-5":
                System.out.println("Camion");
                break;
            case "A":
                System.out.println("Motocicletas");
                break;
            case "B1":
                System.out.println("Automovil");
                break;
            case "B2":
                System.out.println("Automovil");
                break;
            default:
            System.out.println("Debes introducir el Tipo de carnet de conducir, reinicia el programa.");
                break;
        }
        scanner.close();
    }
}
