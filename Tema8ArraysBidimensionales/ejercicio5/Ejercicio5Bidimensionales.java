
package ejercicio5;

import java.util.Random;

public class Ejercicio5Bidimensionales {
    public static void main(String[] args) {
        /*
         * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999.
         * Estos números se deben introducir en un array de 4 filas por 5 columnas.
         * Seguidamente, muestra el array por pantalla junto con las sumas parciales de
         * filas y columnas,
         * igual que si de una hoja de cálculo se tratara. La suma total debe aparecer
         * en la esquina inferior derecha.
         * Un ejemplo de cómo deben mostrarse dichas sumas parciales sería:
         */
        Random rd = new Random();
        int numAleatorio;
        int sumaColumnas[] = new int[5];
        int sumaFilas = 0;
        int sumaTotalFilas = 0;
        int sumaTotalColumnas = 0;

        // String cadenaString ="";
        // ? FOR QUE RECORRE EL ARRAY BIDIMENSIONAL Y LE DA VALOR A LAS POSICIONES
        int[][] tablaAutomatica = new int[4][5];
        for (int i = 0; i < tablaAutomatica.length; i++) {
            for (int j = 0; j < tablaAutomatica[i].length; j++) {
                numAleatorio = rd.nextInt(100, 999);
                tablaAutomatica[i][j] = numAleatorio;
            }
        }
        // cadenaString = Arrays.deepToString(tablaAutomatica);
        // System.out.println(cadenaString);

        // ? FOR QUE RECORRE EL ARRAY BIDIMENSIONAL E IMPRIME LAS SUMAS
        for (int i = 0; i <= tablaAutomatica.length - 1; i++) {
            for (int j = 0; j < tablaAutomatica[i].length; j++) {
                System.out.print(tablaAutomatica[i][j] + "\t");
                sumaFilas += tablaAutomatica[i][j];
                sumaColumnas[j] += tablaAutomatica[i][j];
                sumaTotalFilas += sumaFilas;

            }

            // sumaColumnas += tablaAutomatica[i];
            System.out.print("TOTAL FILA " + i + " : " + sumaFilas);
            System.out.println();
            sumaFilas = 0;

        }
        // Imprimir las sumas de las columnas en la fila final
        for (int j = 0; j < sumaColumnas.length; j++) {
            System.out.print(sumaColumnas[j] + "\t"); // Imprimir la suma de cada columna
            sumaTotalColumnas += sumaColumnas[j];
            sumaColumnas[j] = 0;
        }
        System.out.print(sumaTotalColumnas + sumaTotalFilas);
        System.out.println(); // Salto de línea al final

    }
}
