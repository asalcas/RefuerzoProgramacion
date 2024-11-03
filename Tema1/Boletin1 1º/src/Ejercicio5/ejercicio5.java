
package Ejercicio5;
import java.util.Scanner;



public class ejercicio5 {

    public static void main (String[] args){
    System.out.println("Introduce el radio: ");
    Scanner scanner = new Scanner(System.in);

    double radio = scanner.nextDouble();
    double longitud = 2 * Math.PI * radio;
    double area = Math.PI * Math.pow(radio, 2);

    // Salida de chorrocientos numeros
    System.out.println("La longitud es de: " + (longitud) + " y el área de: " + (area));

    // Salida redondeada
    System.out.println("La longitud es de: " + Math.round(longitud) + " y el área de: " + Math.round(area));

    // Forma de establecer como formato final 2 decimales solo en la salida (redondeando la ultima)
    System.out.println("La longitud es de: " + String.format( "%.2f",longitud) + " y el área de: " + String.format("%.2f",area));

    }
}
    
