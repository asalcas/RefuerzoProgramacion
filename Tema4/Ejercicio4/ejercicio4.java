package Ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

    // Numero introducido: 52 = "cincuenta y dos"
    // Resultado esperado: 48586412Q
    // * Obtenido = 48586412Q
    // Numero introducido: '12345678' = 14
    // Resultado esperado: 12345678Z
    // * Obtenido = 12345678Z
    public static void main(String[] args) {
        // Escribe un programa que solicite al usuario un número entero entre 1 y 99.
        // El programa debe mostrarlo con letras, por ejemplo, para 56 se verá:
        // “cincuenta y seis”.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero y te lo digo en cadena de caracteres: ");
        int numUser = scanner.nextInt();
        String nombreDecimales = "";
        String nombreUnidades = "";

        if (numUser > 0 && numUser < 16) {
            switch (numUser) {
                case 1:
                    System.out.println("UNO");
                    break;
                case 2:
                    System.out.println("DOS");
                    break;
                case 3:
                    System.out.println("TRES");
                    break;
                case 4:
                    System.out.println("CUATRO");
                    break;
                case 5:
                    System.out.println("CINCO");
                    break;
                case 6:
                    System.out.println("SEIS");
                    break;
                case 7:
                    System.out.println("SIETE");
                    break;
                case 8:
                    System.out.println("OCHO");
                    break;
                case 9:
                    System.out.println("NUEVE");
                    break;
                case 10:
                    System.out.println("DIEZ");
                    break;
                case 11:
                    System.out.println("ONCE");
                    break;
                case 12:
                    System.out.println("DOCE");
                    break;
                case 13:
                    System.out.println("TRECE");
                    break;
                case 14:
                    System.out.println("CATORCE");
                    break;
                case 15:
                    System.out.println("QUINCE");
                    break;
                default:
                    break;
            }
            if (numUser < 20) {
                
                // una funcion para unidades y una funcion para decenas
            }
        }
    }
}
