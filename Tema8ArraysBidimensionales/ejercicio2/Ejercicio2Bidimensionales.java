package ejercicio2;

import java.util.Scanner;

public class Ejercicio2Bidimensionales {
    static int[][] escuelaDB = new int[4][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMaximo = 0;
        int numMinimo = 0;
        int media = 0;
        // String cadenaString = "";

        for (int i = 0; i < escuelaDB.length; i++) {
            for (int j = 0; j < escuelaDB[i].length; j++) {
                System.out.println("Escribe una nota para el alumno: " + (i + 1) + " de la asignatura: " + (j + 1));
                escuelaDB[i][j] = sc.nextInt();
            }
        }
        System.out.print("\t\t");
        for(int i = 0; i< 5; i++){
            System.out.print("Asignatura: " + (i+1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < escuelaDB.length; i++) {
            System.out.print("Alumno " + (i+1)+ ":\t\t");
            for (int j = 0; j < escuelaDB[i].length; j++) {
                System.out.print(escuelaDB[i][j] + "\t\t");
            }
            System.out.println();
        }

        for(int i = 0; i < escuelaDB.length ;i++){
            
        }

        // System.out.println(Arrays.deepToString(escuelaDB));
        /*
        for(int[] alumnos: escuelaDB){
        for(int notas: alumnos){
        System.out.print(notas + "\t");
        }
        System.out.println("");
        
        }
         */
        // System.out.println(Arrays.toString(alumnos));

        sc.close();
    }
}
