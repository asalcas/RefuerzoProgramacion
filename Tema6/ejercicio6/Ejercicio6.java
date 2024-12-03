package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    /**
     * Funcion dentro del main: Juego del PIEDRA, PAPEL y TIJERA
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean funcionando = true;
        String opcionJ1 = "";
        String opcionJ2 = "";
        do {
            System.out.println("Introduce (PIEDRA,PAPEL o TIJERA) o 's' si quieres sair del juego!");
            System.out.println("J1: ");
            opcionJ1 = lector.nextLine().toUpperCase(); // Leemos lo que pase por pantalla J1

            if (((!opcionJ1.equals("S")) && (!opcionJ2.equals("S")))) { 
                // SI opcionJ1 NO es S Y opcionJ2 NO es S ENTONCES TRABAJAMOS
                System.out.println("J2: ");
                opcionJ2 = lector.nextLine().toUpperCase();// Leemos lo que pase por pantalla J2

                if (opcionJ1.equals("PIEDRA")) { // SI la opción de J1 es PIEDRA
                    // VEMOS QUE ELIGE J2 y ESCRIBIMOS
                    if (opcionJ2.equals("PAPEL")) {
                        System.out.println("Gana J2: PAPEL LE GANA A PIEDRA");
                    } else if (opcionJ2.equals("TIJERA")) {
                        System.out.println("Gana J1: PIEDRA LE GANA A TIJERA");
                    } else {
                        System.out.println("Empate, ambos sacaron PIEDRA");
                    }
                } else if (opcionJ1.equals("PAPEL")) { // SI la opción de J1 es PAPEL
                    // VEMOS QUE ELIGE J2 y ESCRIBIMOS
                    if (opcionJ2.equals("PIEDRA")) {
                        System.out.println("Gana J1: PAPEL LE GANA A PIEDRA");
                    } else if (opcionJ2.equals("TIJERA")) {
                        System.out.println("Gana J2: TIJERA LE GANA A PIEDRA");
                    } else {
                        System.out.println("Empate, ambos sacaron PAPEL");
                    }
                } else if (opcionJ1.equals("TIJERA")) { // SI la opción de J1 es TIJERA
                    // VEMOS QUE ELIGE J2 y ESCRIBIMOS
                    if (opcionJ2.equals("PIEDRA")) {
                        System.out.println("Gana J2: PIEDRA LE GANA A TIJERA");
                    } else if (opcionJ2.equals("PAPEL")) {
                        System.out.println("Gana J1: PAPEL LE GANA A TIJERA");
                    } else {
                        System.out.println("Empate, ambos sacaron TIJERA");
                    }
                } else {
                    System.out.println("Debes introducir una opción válida: ");
                }
                System.out.println("Quieres jugar de nuevo?");
            } else { // Si cualquiera de opcionJ1/2 es S se para la ejecución
                funcionando = false;
            }

        } while (funcionando);
        lector.close();

    }
}
