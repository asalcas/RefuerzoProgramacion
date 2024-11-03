package Ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tus datos (nombre, direccion y teléfono): ");
        String nombre = scanner.nextLine();
        String direccion = scanner.nextLine();
        int telefono = scanner.nextInt();

        System.out.println(" Nombre: " + nombre +"\n Dirección: "+ direccion +"\n Teléfono: " + telefono);
    }

}
