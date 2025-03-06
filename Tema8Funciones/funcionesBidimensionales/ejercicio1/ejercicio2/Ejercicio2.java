package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
         * Realiza una función que reciba una tabla bidimensional y devuelva en otro
         * array distinto su transposición:
         * Define un método main que llame a esta función pasándole una tabla
         * bidimensional y muestre por pantalla el resultado.
         */
        /*
         * 1 2 3 4 1 5 9 13
         * 5 6 7 8 2 6 10 14
         * 9 10 11 12 3 7 11 15
         * 13 14 15 16 4 8 12 16
         */

        int[][] arrayTrasponer = new int[4][4];
        int[][] reversed;
        int contador = 1;
        String cadenaArrays = "";

        for (int i = 0; i < arrayTrasponer.length; i++) {
            for (int j = 0; j < arrayTrasponer[0].length; j++) {
                arrayTrasponer[i][j] = contador;
                contador++;
                System.out.print(arrayTrasponer[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n La tabla traspuesta es... \n");
        reversed = arrayTranspuesto(arrayTrasponer);
        for (int i = 0; i < reversed.length; i++) {
            for (int j = 0; j < reversed[0].length; j++) {
                System.out.print(reversed[i][j] + "\t");
            }
            System.out.println();
        }
    }
    /**
     * Función que recibe un Array y transpone sus posciones
     * @param arrayTrasponer
     * @return arrayReverse
     */
    public static int[][] arrayTranspuesto(int[][] arrayTrasponer) {
        int[][] arrayReverse = new int[4][4];
        for (int i = 0; i < arrayTrasponer.length; i++) {
            for (int j = 0; j < arrayTrasponer[0].length; j++) {
                arrayReverse[j][i] = arrayTrasponer[i][j];
            }
        }
        return arrayReverse;
    }
}
