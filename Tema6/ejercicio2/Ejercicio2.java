package ejercicio2;

public class Ejercicio2 {
    /***
     * Función dentro del main que se encarga de escribir todos los numeros pares desde 0 a 200
     * @param args
     */
    public static void main(String[] args) {

    int numPares = 1; //Inicializamos numPares = 1 para poder incrementarlo despues (y comenzar la lista por '2')
        do {
            if (numPares % 2 == 0){ // Hacemos una condición donde decimos que si el resto de dividirlo entre 2 es == 0
                System.out.println("Los numeros pares hasta el 200 son: " + numPares); // Entonces es par y lo imprimimos
            }
            numPares++; // Incrementamos DESPUES de la condición, sino nos quedariamos en un bucle infinito.
        } while (numPares < 200);
    }
}
