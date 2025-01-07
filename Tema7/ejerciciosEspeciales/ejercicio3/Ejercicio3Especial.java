package ejercicio3;

import java.util.Scanner;

public class Ejercicio3Especial {

        // Obtener el maximo comun divisor (el maximo divisor de un numero)

        //Ejemplo 1:
        // 24 | 2 = 1, 2, 4, 8, 12, 24
        // 12 | 2
        // 6  | 2
        // 3  | 3
        // 1  |

        // 12 | 2  = 1, 2, 3 ,4 , 12 
        // 6  | 2
        // 3  | 3
        // 1

        //*CORRECTO */


        //Ejemplo 2: 
        // 15 | 3 = 1, 3, 5, 15
        // 5 | 5
        // 1

        // 35 | 5 = 1, 5, 35
        // 7 | 7
        // 1
        // MCD (12,24) = 5
        //*CORRECTO */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1;
        int numero2;
        int numeroMenor;
        int numeroMcd = 0;


        System.out.println("Escribe dos numeros para encontrar el máximo comun divisor entre ambos: ");
        numero1 = lector.nextInt();
        System.out.print("E introduce otro: ");
        numero2 = lector.nextInt();
        
        numeroMenor = (numero1 < numero2) ? numero1 : numero2;

        for (int i = numeroMenor; i >= 1; i--){
            if (numero1 % i == 0 && numero2 % i == 0){
                numeroMcd = i;
                break;
            }
        }
        System.out.println(String.format("El MCD de %d y %d es: %d", numero1,numero2, numeroMcd));
        lector.close();
    }
    
}
