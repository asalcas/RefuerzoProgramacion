package ejercicio4;

import java.util.Scanner;

public class Ejercicio4Especial {
        
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1;
        int numero2;
        int numeroMayor;
        int numMcm = 0;


        System.out.println("Escribe dos numeros para encontrar el máximo comun divisor entre ambos: ");
        numero1 = lector.nextInt();
        System.out.print("E introduce otro: ");
        numero2 = lector.nextInt();
        
        numeroMayor = (numero1 > numero2) ? numero1 : numero2;

        for (int i = numeroMayor;; i++){
            if (i % numero1 == 0 && i % numero2 == 0){
                numMcm = i;
                break;
            }
        }
        System.out.println(String.format("El mcm de %d y %d es: %d", numero1,numero2, numMcm));
        lector.close();
    }
    
}

