
import java.util.Scanner;

public class Ejercicio2 {

    /***
     * En nuestro metodo main comprobaremos si los 2 numeros que nos pasen por
     * pantalla son iguales o no.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numero1Usuario; // Declaramos las variables
        int numero2Usuario;

        Scanner lector = new Scanner(System.in); // Instanciamos Scanner para poder leer los inputs
        try { // Controlamos excepciones
              // Damos las instrucciones y leemos lo que pase por pantalla
            System.out.println("Escribe dos numeros iguales: ");
            numero1Usuario = lector.nextInt();
            System.out.println("y...");
            numero2Usuario = lector.nextInt();

            if (numero1Usuario == numero2Usuario) { // Hacemos la comprobación del contenido de las dos variables, para
                                                    // saber si son iguales o no.
                System.out.println("Los dos numero son iguales");

            } else
                System.out.println("No son iguales");
            lector.close();
        } catch (Exception error) {
            System.err.println("He dicho dos NUMEROS, el codigo de error es: " + error); // Si introduce algo que no sea
                                                                                         // un numero lanzara una
                                                                                         // excepción que recogeremos y
                                                                                         // lanzaremos este mensaje
        }

    }

}
