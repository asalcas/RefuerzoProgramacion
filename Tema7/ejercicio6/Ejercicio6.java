package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce 5 calificaciones y el programa te dirá si hay algun suspenso");
        suspensos(lector);
    }

    public static void suspensos(Scanner lector) {
        int contadorSuspenso = 0;

        for (int i = 1; i <= 5; i++) {
            int notaUsuario = lector.nextInt();
            lector.nextLine();
            if (notaUsuario < 5) {
                contadorSuspenso++;
            }
        }
        System.out.println("El numero de suspensos introducidos es: " + contadorSuspenso);
    }
}
