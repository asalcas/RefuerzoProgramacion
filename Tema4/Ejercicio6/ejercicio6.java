package Ejercicio6;


import java.util.Scanner;

public class ejercicio6 {
    // Numero introducido: 2h 37' 29"
    // Resultado esperado: 2h 37' 30"
    // * Resultado obtenido: La hora será las: 2h, 37' ,30''
    // Numero introducido: 2h 59' 59'
    // Resultado esperado: 3h 0' 0"
    // * Resultado obtenido: La hora será las: 3h, 00' ,00''
    // Numero introducido: 23h 59' 59"
    // Resultado esperado: 0h 0' 0"
    // * Resultado obtenido: La hora será las: 0h, 0' ,0''
    public static void main(String[] args) {
        // Dada una hora por teclado, (horas, minutos y segundos) realiza un
        // algoritmo que muestre la hora después de incrementar un segundo.
        Scanner scanner = new Scanner(System.in);
        int horas;
        int minutos;
        int segundos;

        System.out.println("Introduce una hora concreta en el sistema, y le sumaremos un segundo: ");
        System.out.println("Que hora quieres introducir?: ");
        horas = scanner.nextInt();
        System.out.println("Que minutos quieres introducir?: ");
        minutos = scanner.nextInt();
        System.out.println("Y segundos?: ");
        segundos = scanner.nextInt();

        if ((horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60)) {
            segundos++;
            if (segundos == 60) {
                segundos = 00;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 00;
                horas++;
            }
            if (horas == 24) {
                horas = 0;
            }

        }
        
        //  Añadir ternario para conseguir mins 07 por ejemplo.

        System.out.println(String.format("La hora será las: %sh, %s' ,%s''", horas, minutos, segundos)); // Resultados para 0
        scanner.close();
    }
}
