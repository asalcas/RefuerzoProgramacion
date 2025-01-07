package ejercicio2;

import java.util.Scanner;

    // Prueba 1: numero1: 1 && numero2: 2
    // Resultado esperado = "La cantidad de numeros entre 1 y 2 es: 1"
    //* */ Resultado CORRECTO

    // Prueba 2: numero1: 2 && numero2: 1
    // Resultado esperado = "La cantidad de numeros entre 2 y 1 es: 1"
    //* */ Resultado CORRECTO

    // Prueba 3: numero1: 2 && numero2: 2
    // Resultado esperado = "La cantidad de numeros entre 2 y 2 es: 0"
    //* */ Resultado CORRECTO

    // Prueba 4: numero1: 0 && numero2: 0
    // Resultado esperado = "La cantidad de numeros entre 0 y 0 es: 0"
    //* */ Resultado CORRECTO

public class Ejercicio2Especial {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero2;
        int numero1;
        int numeroTemporal;
        int contadorNumeros = 0;

        System.out.println("El funcionamiento del programa consiste en introducir dos numeros e indicar cuantos hay entre ambos");

        System.out.print("Introduce un numero inicial: ");
        numero1 = lector.nextInt();
        System.out.print("Introduce un numero final: ");
        numero2 = lector.nextInt();

        if (numero1 > numero2){
            numeroTemporal = numero1;
            numero1 = numero2;
            numero2 = numeroTemporal;
        }
        for (int i = numero1; i < numero2; i++){
            contadorNumeros++;
        }

        System.out.println(String.format("La cantidad de numeros entre %d y %d es: %d", numero1, numero2, contadorNumeros));
        lector.close();
    }
    
}
