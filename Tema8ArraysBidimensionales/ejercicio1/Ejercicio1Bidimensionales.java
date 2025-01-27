package ejercicio1;

import java.util.Arrays;

public class Ejercicio1Bidimensionales {
    public static void main(String[] args) {
        int num [][]; //Declaración de array BIDIMENSIONAL
        num = new int[3][6]; // Inicialización de un array BIDIMENSIONAL

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;


        for (int i = 0; i < num.length; i++) { // num.length nos marca el tamaño de array en cuanto las FILAS 
            System.out.println(Arrays.toString(num[i])); // Imprime cada fila en una nueva línea
        }


        int[][] contarFilasColumnas = {
                    {1, 2, 3, 4, 5}, // Fila 0
                    {4, 5, 6},       // Fila 1
                    {7, 8, 9}        // Fila 2
                                     // Filas totales 3  
        // Columna:  (0)(1)(2)(3)(4)
        // Columnas totales 5
        };
        
        // Filas 
        System.out.println("Número de filas: " + contarFilasColumnas.length);
        
        // Columnas
        System.out.println("Número de columnas: " + contarFilasColumnas[0].length);
    }
}