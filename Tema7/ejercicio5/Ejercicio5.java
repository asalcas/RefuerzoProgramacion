package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        sacarFactorial(lector);
        lector.close();
        
    }
    public static void sacarFactorial(Scanner lector){
        System.out.println("Introduce un numero para sacar su factorial");
        System.out.print("Numero seleccionado: ");
        int numUser = lector.nextInt();
        lector.nextLine();
        int factorial = 1; // Le damos el valor de 1 para que después funcione la operación *=, ya que si inicializamos 
        // a 0 no funcionaria correctamente, ya que cualquier cosa x0 = 0.
        for (int i = numUser; i > 0; i--){ // "i" es = al numero que meta el usuario, y por cada iteración decrementa 1
            factorial *= i; // En el caso de 5 se le va añadiendo a la variable de lo que guarde * i 
            // Ejemplo (5): 5x4x3x2x1 = 120 5!
            if (i == 1) {
                System.out.print(i + " = " + factorial);
            }else {
                System.out.print(i + "x");
            }
        }
    }
}
