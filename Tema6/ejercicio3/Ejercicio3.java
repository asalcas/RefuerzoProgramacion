package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    /***
     * Es una función dentro del main que se encarga de recibir un numero por consola y dicho numero será el tope
     * se sumaran todos los numeros naturales anteriores y darán la suma
     * @param args
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero, y se sumaran todos los valores anteriores a el: ");
        int numUser = lector.nextInt(); // Guardamos lo que el usuario de por consola en la variable numUser
        int numeroIncrementado = 0; // Inicializamos a 0 numIncrementado
        int suma = 0; // Y tambien inicializamos a 0 suma para usarlos posteriormente
        do {
            numeroIncrementado++; // Primero usamos numeroIncrementado, que será lo que salga en el Print
            suma += numeroIncrementado; // Acumulamos todos los numeros que salgan en numeroIncrementado dentro de suma
            if (numeroIncrementado != numUser) { // Condición, diciendo que si numeroIncrementado no es el numero escrito por el usuario, añada un "+"
                System.out.print(numeroIncrementado + "+");
            }else{ // Y si lo es, que añada "=" + suma, que seria algo así: 1+2+3+4+5 = 15
                System.out.print(numeroIncrementado + " = " + suma );
            }
        } while ( numeroIncrementado < numUser); // Funciona mientras numeroIncrementado sea ESTRICTAMENTE menor al numero introducido del usuario.
        lector.close();
    }
}
