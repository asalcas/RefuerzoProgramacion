import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        boolean funcionandoJ1 = true;
        boolean funcionandoJ2 = true;

        while (funcionandoJ1) {
            System.out.println("J1. Selecciona que quieres jugar?: ");
            System.out.println("1. PIEDRA");
            System.out.println("2. PAPEL");
            System.out.println("3. TIJERA");
            System.out.println("--------------------------");
            Integer seleccion = lector.nextInt();
            if (seleccion instanceof Integer && ((seleccion > 0) && (seleccion <= 3))) {
                funcionandoJ1 = false;
            } else {
                System.out.println("Tienes que introducir un numero de opcion! Vuelve a intentarlo");
            }
            Integer seleccionJ1 = seleccion;

            while (funcionandoJ2) {
                System.out.println("J2. Selecciona que quieres jugar?: ");
                System.out.println("1. PIEDRA");
                System.out.println("2. PAPEL");
                System.out.println("3. TIJERA");
                System.out.println("--------------------------");
                seleccion = lector.nextInt();
                if (seleccion instanceof Integer && ((seleccion > 0) && (seleccion <= 3))) {
                    funcionandoJ2 = false;
                } else {
                    System.out.println("Tienes que introducir un numero de opcion! Vuelve a intentarlo");
                }
            }
            Integer seleccionJ2 = seleccion;

            if (seleccionJ1 == 1) {
                if (seleccionJ2 == 2) {
                    System.out.println("El J2 gana, el PAPEL le gana a la PIEDRA!");
                } else {
                    System.out.println("El J1 gana, la PIEDRA le gana a la TIJERA!");
                }
            } else if (seleccionJ1 == seleccionJ2) {
                System.out.println("EMPATE");
            } else if (seleccionJ1 == 2) {
                if (seleccionJ2 == 1) {
                    System.out.println("El J1 gana, el PAPEL le gana a la PIEDRA!");
                } else {
                    System.out.println("El J2 gana, la TIJERA le gana al PAPEL!");
                }
            } else if (seleccionJ1 == 3) {
                if (seleccionJ2 == 1) {
                    System.out.println("El J2 gana, la PIEDRA le gana a la TIJERA!");
                } else {
                    System.out.println("El J1 gana, la TIJERA le gana al PAPEL!");
                }

            }

        }
        lector.close();
    }

}
