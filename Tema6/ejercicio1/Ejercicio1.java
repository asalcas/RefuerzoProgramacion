package ejercicio1;

public class Ejercicio1 {
    /***
     * Funcion en el main, que muestre por pantalla los 20 primeros numeros naturales
     * @param args
     */
    public static void main(String[] args) {

    System.out.println("");
        int numIncrementado = 1; // Inicializamos un numero a 1 para poder usarlo después
        do{
            // numIncrementado = 1
            // System.out.println("Nº: "+ 1++) Primero lo usamos 1 ++ y despues lo incrementamos
            System.out.println("Nº: "+ numIncrementado++); //! Primero lo usa y despues lo incrementa
        } while (numIncrementado <= 20); // Cogemos hasta <= 20 para incluir la impresión de 20
    }   // Pero ojo numIncrementado aquí = 21
}
