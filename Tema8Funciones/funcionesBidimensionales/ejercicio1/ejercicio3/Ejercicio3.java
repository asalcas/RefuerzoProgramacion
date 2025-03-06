package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Define una función que reciba una tabla bidimensional y devuelva un booleano
         * para indicar si la matriz es o no simétrica. Una matriz se dice que es
         * simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la
         * matriz. Delfine un método main que llame a la función y muestre por pantalla
         * el resultado, indicando si la tabla pasada por parámetro es simétrica o no.
         */

        int[][] arraySimetrico = { { 1, 2, 3 }, { 2, 2, 2 }, { 3, 2, 1 } };
        int[][] arrayAsimetrico = new int[3][3];
        int contador = 1;
        boolean respuesta;

        for (int i = 0; i < arrayAsimetrico.length; i++) {
            for (int j = 0; j < arrayAsimetrico[0].length; j++) {
                arrayAsimetrico[i][j] = contador;
                contador++;
            }
        }

        respuesta = esSimetrica(arrayAsimetrico);
        if (!respuesta) {
            System.out.println("El Array es Asimétrico");
        } else {
            System.out.println("El Array es Simétrico");
        }
        respuesta = esSimetrica(arraySimetrico);
        if (!respuesta) {
            System.out.println("El Array es Asimétrico");
        } else {
            System.out.println("El Array es Simétrico");
        }

    }

    /**
     * Función a la que pasamos un Array y comprueba si es Simetrico o no
     * 
     * @param arraySimetrico
     * @return boolean
     */
    public static boolean esSimetrica(int[][] arraySimetrico) {
        int[][] arrayComparar = arraySimetrico;
        boolean esIgual = true;
        int i = 0;
        int j;

        while (esIgual && i < arraySimetrico.length) {
            j = 0;
            while (esIgual && j < arraySimetrico[0].length) {
                if (arraySimetrico[i][j] != arrayComparar[j][i]) {
                    esIgual = false;
                }
                j++;
            }

            i++;
        }
        return esIgual;
    }
}
