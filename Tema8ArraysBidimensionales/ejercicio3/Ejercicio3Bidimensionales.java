package ejercicio3;

import java.util.Scanner;

public class Ejercicio3Bidimensionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        int columnas;

        System.out.print("Introduce el numero de filas que tendrá la tabla: "); 
        filas = sc.nextInt();
        System.out.print("Introduce el numero de colummnas que tendrá la tabla: ");
        columnas = sc.nextInt();

        int[][] tablita = new int [filas][columnas];

        for (int i = 0; i < tablita.length; i++){
            for(int j = 0; j < tablita[i].length;j++){
                tablita[i][j] = (10*i)+j;
                System.out.print(tablita[i][j] + "\t");
            }
        System.out.println();
        }



        sc.close();
    }
}
