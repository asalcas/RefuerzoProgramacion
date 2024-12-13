package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();
        int b = lector.nextInt();
        lector.nextLine();
        int temporal = 0;
        if (a > b) {
            temporal = b;
            b = a;
            a = temporal;
        }
        System.out.println("Los numeros entre los que tu dijiste ("+ a +"," + b +") son: ");
        for (int i = a; a <= b; a++) { // SEGURAMENTE TENGA ALGO QUE MEJORAR AQUI, intenté poner el valor de a como 1 
            // elemento y no funcionó, y forcé que funcionara metiendole una variable que guarde "a" para que funcione.
            System.out.print(a + " ");
            
        }
        lector.close();
    }
}