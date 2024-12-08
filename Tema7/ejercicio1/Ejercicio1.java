package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un numero, para que te escriba todos los numeros hasta llegar a el");
        int numUsuario = lector.nextInt();
        lector.nextLine(); // Limpiamos el buffer
        
        aprendeNumeros(numUsuario);
        lector.close();
    }
    /**
     * Funcion que imprimirá los numeros reales desde 1 hasta el numero introducido por consola en el main
     * @param numUsuario
     * @return None
     */
    public static void aprendeNumeros(int numUsuario){
        
        for (int i = 1; i <= numUsuario; i++){
            System.out.println("Nº: " + i + " hasta llegar al " + numUsuario);
        }
    }
}
