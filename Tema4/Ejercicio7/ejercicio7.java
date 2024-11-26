package Ejercicio7;

import java.util.Scanner;

public class ejercicio7 {
    // Numero introducido(KM): 500
    // Numero introducido(Dias): 6
    // Resultado esperado: 1250€
    // * Resultado obtenido: El precio total del billete sera de: 1250.0 Euros
    // Numero introducido(KM): 600
    // Numero introducido(Dias): 7
    // Resultado esperado: 1500€
    // * Resultado obtenido: El precio total del billete sera de: 1500.0 Euros
    // Numero introducido(KM): 850
    // Numero introducido(Dias): 8
    // Resultado esperado: 2125€ % 30 637,5 2125 - 637 = 1487,5
    // * Resultado obtenido: El precio total del billete sera de: 1487,5 Euros
    // Numero introducido(KM): 850
    // Numero introducido(Dias): 6
    // Resultado esperado: 2125€
    // * Resultado obtenido: El precio total del billete sera de: 2125.0 Euros
    public static void main(String[] args) {
        // Determinar el precio de un billete de tren, conociendo la distancia a
        // recorrer, y sabiendo que si el número de días de estancia es superior a 7
        // y la distancia superior a 800 km el billete tiene una reducción del 30%.
        // El precio por kilómetro es de 2,5€. La distancia a recorrer y el número de
        // días de estancia los debes solicitar al usuario por teclado.
        Scanner lector = new Scanner(System.in);
        double precioBillete;
        double distanciaKm;
        double descuento;
        final double PRECIO_KM = 2.5;

        System.out.println("Cuantos dias de viaje quieres estar?: ");
        int diasViaje = lector.nextInt();
        System.out.println("Y cuanta distancia quieres recorrer?: ");
        distanciaKm = lector.nextDouble();

        if ((distanciaKm > 700) && (diasViaje > 7)) {
            precioBillete = distanciaKm * PRECIO_KM;
            descuento = (precioBillete * 30) / 100;
            precioBillete = precioBillete - descuento;
        } else {
            precioBillete = distanciaKm * PRECIO_KM;
        }
        lector.close();
        System.out.println("El precio total del billete sera de: " + precioBillete + " Euros");
    }
}
