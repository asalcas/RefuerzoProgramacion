package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    /**
     * Función en el main que muestra una tabla de multiplicar de un numero
     * introducido por consola
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroIncrementado = 0;
        int numeroCondicion = 10;
        int operacion;
        System.out.println("Escribe un numero y haremos la tabla de multiplicar: ");
        int numeroUsuario = lector.nextInt();
        do {
            numeroIncrementado++;
            operacion = numeroUsuario* numeroIncrementado;
            System.out.println(numeroUsuario+" x "+numeroIncrementado +" = "+ operacion);
        } while (numeroIncrementado < numeroCondicion);
        lector.close();
    }
}
