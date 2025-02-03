
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
        String cadenaArrayPruebas = "";
        int[][] tablaSumatorios = new int[4][5];
        int acumulandoValorFila = 0;
        int acumulandoValorColumna = 0;
        int total = 0;

        // Variables creadas para la comprobación
        int comprobarFilas = 0;
        int comprobarColumnas= 0;

        for (int i = 0; i < tablaSumatorios.length; i++) {
            for (int j = 0; j < tablaSumatorios[i].length; j++) {
                tablaSumatorios[i][j] = rd.nextInt(100,999);
                acumulandoValorFila += tablaSumatorios[i][j];
                System.out.print(tablaSumatorios[i][j] + "\t");
                
            }
            System.out.print("\t Fila "+ i +": " + acumulandoValorFila + "\t");
            comprobarFilas +=acumulandoValorFila;
            acumulandoValorFila = 0;
            System.out.println();
        }

        // Este está al revés por que vamos leyendo por COLUMNAS, no por FILAS
        for (int j = 0; j < tablaSumatorios[0].length; j++){
            for (int i = 0; i < tablaSumatorios.length; i++){
                acumulandoValorColumna += tablaSumatorios[i][j];
                
            }
            System.out.print(acumulandoValorColumna + "\t");
            comprobarColumnas += acumulandoValorColumna;
            total += acumulandoValorColumna;
            acumulandoValorColumna = 0;
            
        }
        if(comprobarColumnas == comprobarFilas){
            System.out.println("\t TOTAL:" + total);
        }

    }
}