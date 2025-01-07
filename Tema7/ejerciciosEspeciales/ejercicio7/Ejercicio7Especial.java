package ejercicio7;

import java.util.Scanner;

public class Ejercicio7Especial {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int numeroMax;
        int numero = 1;

        System.out.print("Escribe un numero para que el programa lo lea e imprima el numero con las siguientes filas: ");
        numeroMax = lector.nextInt();

        for(int i = 1; i <= numeroMax; i++){
            
            for (int j = 1 ; j <= i; j++){
                
                System.out.print(j);
            }
            for (int k = i - 1; k >= 1; k--){
                System.out.print(k);
            }
            System.out.println(" ");
        }
        lector.close();
    }
    
}
