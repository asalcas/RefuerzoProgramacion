import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un numero entre 0 y 99999: ");
        String numeroUsuario = lector.nextLine();
        // La condicion es por el tamaño de 'numeroUsuario' por que sea "0" o "99999"
        // los limites en cifras
        // siempre seran 0 y 5
        if ((numeroUsuario.length() >= 0) && (numeroUsuario.length() <= 5)) {
            int numCifras = numeroUsuario.length();
            System.out.println("El número tiene: " + numCifras + " cifras");
        } else {
            System.out.println("Tienes que poner un numero comprendido ente 0 y 99999");
        }
        lector.close();

    }

}
