package ejercicio6EXTRA;

public class EjercicioBidimensionalInverso {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int valorNumerito = 1;
        int valorAux = 0;

        String cadenaArrayPrueba = "";

        // RELLENADO ARRAY NORMAL
        for (int i = 0; i < matriz.length; i++) { // Se puede hacer como un for-each como!! Pero vamos a hacerlo con for normal.
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valorNumerito++;
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println();
        }
        // MATRIZ INVERSA
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i; j < matriz[i].length; j++) {
                valorAux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = valorAux;
            }

        }
        System.out.println();
        for (int[] fila : matriz) { // Se puede usar un for each para decir, por cada fila dentro de la matriz... (SOLO si queremos recorrer la matriz completamente.)
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j] + "\t");
            }
            System.out.println();
        }

    }
}

// Auxiliar = matriz[i][j] = matriz [j][i]