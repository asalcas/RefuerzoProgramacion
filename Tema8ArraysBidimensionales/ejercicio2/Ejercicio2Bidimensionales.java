package ejercicio2;

import java.util.Scanner;

public class Ejercicio2Bidimensionales {
    static int[][] escuelaDB = new int[4][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMaximo = Integer.MIN_VALUE;
        int numMinimo = Integer.MAX_VALUE;
        int media = 0;
        int sumaTotal = 0;
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
            for(int j = 0; j < escuelaDB[i].length;j++){
                sumaTotal += escuelaDB[i][j];
                
                if (escuelaDB[i][j] > numMaximo){
                    numMaximo = escuelaDB[i][j];
                }
                if (escuelaDB[i][j] < numMinimo){
                    numMinimo = escuelaDB[i][j];
                }
                
            }
            media = sumaTotal/escuelaDB[i].length;
            System.out.println("La media de notas del alumno: "+ (i+1) +" es = " + media);
            System.out.println("La nota máxima del alumno " + (i+1) +" es "+ numMaximo + " y la nota mínima es "+ numMinimo+"\n");
            media = 0;
            sumaTotal = 0;
            numMaximo = Integer.MIN_VALUE;
            numMinimo = Integer.MAX_VALUE;

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
