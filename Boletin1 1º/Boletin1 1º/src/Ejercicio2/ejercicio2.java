package Ejercicio2;

import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args){

        Scanner leerNumero = new Scanner (System.in);
        System.out.println("Escribe tu edad: ");
        String edadUsuario = leerNumero.nextLine();
        int edadSiguiente = Integer.parseInt(edadUsuario) + 1;       System.out.println("Tu edad el año que viene es: " + edadSiguiente);
       
        



    }
}
