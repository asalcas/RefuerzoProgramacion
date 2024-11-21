
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * Crearemos una funcion en nuestro "main" que solicitará un numero por pantalla
     * a un usuario, y se comprobará si es par o impar
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numeroUsuario; // Declaramos la creación de numeroUsuario, y mas tarde le daremos el valor de
                           // la lectura del teclado

        System.out.println("Escribe un numero: ");
        Scanner lectura = new Scanner(System.in); // Instanciamos un objeto Scanner que lea lo que el usuario introduzca
                                                  // por pantalla
        try {

            numeroUsuario = lectura.nextInt(); // Declaramos la variable numeroUsuario con el contenido que vea
                                               // "lectura"

            if (numeroUsuario % 2 == 0) { // Si el resto del numero dividido entre 2 es 0:
                System.out.println("El numero es PAR");
            } else {
                System.out.println("El numero es IMPAR");
            }
            lectura.close(); // Cerramos el Scanner.
        } catch (Exception error) {
            System.out.println("Error inesperado: " + error);
        }

    }

}
