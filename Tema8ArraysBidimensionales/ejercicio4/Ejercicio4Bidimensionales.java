package ejercicio4;

public class Ejercicio4Bidimensionales {
    public static void main(String[] args) {
        // Escribe un programa que cree una tabla de 10x10 que contenga los valores de
        // las tablas de multiplicar del 1 al 10
        // (cada tabla de multiplicar en una fila). Muestra la tabla por pantalla.

        int[][] tablaMultiplicar = new int[11][11];
        System.out.print("X\t|");
        
        for (int i = 1; i<= 10; i++){
            System.out.print("\t" + i);
        }
        System.out.println();

        System.out.println("____________________________________________________________________________________________");
        for (int i = 1; i < tablaMultiplicar.length; i++) {
            System.out.print( + i +"\t|\t");
            for (int j = 1; j < tablaMultiplicar[i].length; j++) {
                tablaMultiplicar[i][j] = i * j;
                System.out.print(tablaMultiplicar[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
