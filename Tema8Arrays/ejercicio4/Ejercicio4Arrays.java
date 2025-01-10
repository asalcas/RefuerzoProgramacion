package ejercicio4;

import java.util.Arrays;

public class Ejercicio4Arrays {
    public static void main(String[] args) {
        int[] array12 = new int[12];
        String cadenaArray = "";

        array12[0] = 39;
        array12[1] = -2;
        array12[4] = 0;
        array12[6] = 14;
        array12[8] = 5;
        array12[9] = 120;

        cadenaArray = Arrays.toString(array12);
        System.out.println(cadenaArray);


        char[] letrita = new char[10];

        cadenaArray= Arrays.toString(letrita);
        System.out.println(cadenaArray);

    }
    
}
