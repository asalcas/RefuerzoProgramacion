package ejercicio6;

import java.util.Scanner;

public class Ejercicio6Especial {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int alturaPiramide;

        System.out.print("Escribe la altura que quieras de la piramide: ");
        alturaPiramide = lector.nextInt();

        for (int i = 1; i <= alturaPiramide; i++){
            for(int j = alturaPiramide - i; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = alturaPiramide - i; k < alturaPiramide; k++){
            System.out.print(" *");
            }
            System.out.println(" ");
        }
        lector.close();
    }
    
}
