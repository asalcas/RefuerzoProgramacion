package ejercicio9;

import java.util.Scanner;

public class Ejercicio9Especial {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroUsuario;
        int digitos = 1;
        int numeroAux;


        System.out.print("Escribe un numero y el programa te dira cuantos digitos tiene: ");
        numeroUsuario = lector.nextInt();

        if (numeroUsuario < 10) {
            digitos = 1;
        }
        numeroAux = numeroUsuario;
        while (numeroAux >= 10){
            numeroAux = numeroAux / 10;
            digitos++; 
        }
        System.out.println(String.format("El numero que has introducido %d, tiene %d digitos", numeroUsuario, digitos));
        lector.close();
    }
    
}
