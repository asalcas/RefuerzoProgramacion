package ejercicio8;

import java.util.Scanner;

public class Ejercicio8Especial {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroInicial;
        int numerosDicho;
        int numerosAcertados = 0;
        int numerosFallados = 0; 

        System.out.print("Introduce un numero inicial: ");
        numeroInicial = lector.nextInt();
        System.out.println("Y despues tendras que introducir numeros mayores a este.");
        
        if (numeroInicial != 0){
            do {
                System.out.println("Introduce ahora un numero: ");
                numerosDicho = lector.nextInt();
                if (numerosDicho >= numeroInicial){
                    numerosAcertados++;
                }else if (numerosDicho == 0){
                    System.out.println(String.format("Estas saliendo del programa, el numero de aciertos es %s, el numero de fallos es %s y el numero de numeros dicho.", numerosAcertados, numerosFallados));
                }else{
                    System.out.println("Has fallado, este numero es menor");
                    numerosFallados++;
                }
            } while (numerosDicho != 0);
        }
        
    }
    
}
