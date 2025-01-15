package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1ClaseArray {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadenaArray = "";
        int arraySize;
        int valorUsuario;

        int[] arrayValor;

        System.out.print("Necesito que me digas un tamaño del Array: ");
        arraySize = lector.nextInt();

        System.out.println("Y dime un valor ");
        valorUsuario = lector.nextInt();

        arrayValor = new int[arraySize];
        cadenaArray = Arrays.toString(arrayValor);
        System.out.println(cadenaArray);

        /*Soy tonto y lo hice a pelo por que se me olvidó que tenia que hacerlo con el metodo '.fill()'
         * 
            for(int i = 0; i < arraySize; i++){
            arrayValor[i] = valorUsuario;
            System.out.println(String.format("El array de objetos: %d", arraySize));
            cadenaArray = Arrays.toString(arrayValor);
            System.out.println("Pasa a ser: "+ cadenaArray);
            System.out.println();
        }
         */
        //? Puede ser tambien 'Arrays.fill(arraySeñalado, valorInicialización todo)'
        //* O como en este caso: 'Arrays.fill(arraySeñalado, indiceDesde, indiceHasta, valorInicialización)'
        Arrays.fill(arrayValor,0, arrayValor.length, 1);
        cadenaArray = Arrays.toString(arrayValor);
        System.out.println(cadenaArray);
        lector.close();
    }

}