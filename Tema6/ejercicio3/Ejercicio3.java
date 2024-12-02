package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero, y se sumaran todos los valores anteriores a el: ");
        int numUser = lector.nextInt();
        int numeroIncrementado = 0;
        int suma = 0;
        do {
            numeroIncrementado++;
            suma += numeroIncrementado;
            if (numeroIncrementado != numUser) {
                System.out.print(numeroIncrementado + "+");
            }else{
                System.out.print(numeroIncrementado + " = " + suma );
            }
        } while ( numeroIncrementado < numUser);
    }
}
