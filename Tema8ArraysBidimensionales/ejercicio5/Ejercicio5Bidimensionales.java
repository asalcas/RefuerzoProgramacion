
package ejercicio5;

import java.util.Random;

public class Ejercicio5Bidimensionales {
    public static void main(String[] args) {
        /*Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999. 
        Estos números se deben introducir en un array de 4 filas por 5 columnas. 
        Seguidamente, muestra el array por pantalla junto con las sumas parciales de filas y columnas, 
        igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha. 
        Un ejemplo de cómo deben mostrarse dichas sumas parciales sería: */
        Random rd = new Random();
        int numAleatorio;
        int sumaColumnas = 0;
        int sumaFilas = 0;
        
        
        int[][] tablaAutomatica = new int[1][2];
        for (int i = 0; i < tablaAutomatica.length-1; i++){
            for(int j = 0; j < tablaAutomatica[i].length;j++){
                numAleatorio = rd.nextInt(100,999);
                tablaAutomatica[i][j] = numAleatorio;
            }
        }
        for (int i = 0; i < tablaAutomatica.length-1;i++){
            int f = tablaAutomatica[i].length;
            sumaColumnas += tablaAutomatica[i][f];
            f--;
            for(int j = 0; j < tablaAutomatica[i].length;j++){
                sumaFilas += tablaAutomatica[i][j];
                System.out.print(tablaAutomatica[i][j]);
            }
            System.out.println();
        }
        
    }
}
