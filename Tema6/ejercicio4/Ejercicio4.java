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
        int numeroIncrementado = 0; // Inicializamos numeroIncrementado a 0 para posteriormente incrementarlo dentro del do-while
        int numeroCondicion = 10; // numeroCondición es ese numero que se encarga de decir hasta donde tenemos que hacer el bucle
        int operacion; // Declaramos la variable operación, a la que le asignaremos un valor despues
        System.out.println("Escribe un numero y haremos la tabla de multiplicar: ");
        int numeroUsuario = lector.nextInt(); // Lee el numero del usuario
        do {
            numeroIncrementado++; // Incrementamos despues de usarlo
            operacion = numeroUsuario * numeroIncrementado; // Asignamos el valor a "operacion" de el numero del usuario * el numero incrementandose
            System.out.println(numeroUsuario+" x "+numeroIncrementado +" = "+ operacion); // numUsuario = 3   '3 x 1 = 3'
        } while (numeroIncrementado < numeroCondicion);
//              1,2,3,4,5,6,7,8,9,10         10
        lector.close();
    }
}
