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
        int obtenerDecimales = numUser / 10;
        int obtenerUnidades = numUser % 10;
        String decimal = "";
        String unidad = "";
        String especiales = "";
        String numeroFinal = "";
        scanner.close();

        if (numUser >= 0 && numUser <= 15) {
            switch (numUser) {
                case 0:
                    especiales = ("CERO");
                    break;
                case 1:
                    especiales = ("UNO");
                    break;
                case 2:
                    especiales = ("DOS");
                    break;
                case 3:
                    especiales = ("TRES");
                    break;
                case 4:
                    especiales = ("CUATRO");
                    break;
                case 5:
                    especiales = ("CINCO");
                    break;
                case 6:
                    especiales = ("SEIS");
                    break;
                case 7:
                    especiales = ("SIETE");
                    break;
                case 8:
                    especiales = ("OCHO");
                    break;
                case 9:
                    especiales = ("NUEVE");
                    break;
                case 10:
                    especiales = ("DIEZ");
                    break;
                case 11:
                    especiales = ("ONCE");
                    break;
                case 12:
                    especiales = ("DOCE");
                    break;
                case 13:
                    especiales = ("TRECE");
                    break;
                case 14:
                    especiales = ("CATORCE");
                    break;
                case 15:
                    especiales = ("QUINCE");
                    break;

            }

        } else if ((numUser >= 16 && numUser <= 99) && (numUser != 20)) {
            switch (obtenerDecimales) {
                case 1:
                    decimal = "DIECI";
                    break;
                case 2:
                    decimal = "VEINTI";
                    break;
                case 3:
                    decimal = "TREINTA";
                    break;
                case 4:
                    decimal = "CUARENTA";
                    break;
                case 5:
                    decimal = "CINCUENTA";
                    break;
                case 6:
                    decimal = "SESENTA";
                    break;
                case 7:
                    decimal = "SETENTA";
                    break;
                case 8:
                    decimal = "OCHENTA";
                    break;
                case 9:
                    decimal = "NOVENTA";
                    break;

            }
            if ((numUser >= 16) && (numUser <= 29)) {
                switch (obtenerUnidades) {

                    case 1:
                        unidad = ("UNO");
                        break;
                    case 2:
                        unidad = ("DOS");
                        break;
                    case 3:
                        unidad = ("TRES");
                        break;
                    case 4:
                        unidad = ("CUATRO");
                        break;
                    case 5:
                        unidad = ("CINCO");
                        break;
                    case 6:
                        unidad = ("SEIS");
                        break;
                    case 7:
                        unidad = ("SIETE");
                        break;
                    case 8:
                        unidad = ("OCHO");
                        break;
                    case 9:
                        unidad = ("NUEVE");
                        break;

                }
            } else {
                switch (obtenerUnidades) {
                    case 1:
                        unidad = " Y UNO";
                        break;
                    case 2:
                        unidad = " Y DOS";
                        break;
                    case 3:
                        unidad = " Y TRES";
                        break;
                    case 4:
                        unidad = " Y CUATRO";
                        break;
                    case 5:
                        unidad = " Y CINCO";
                        break;
                    case 6:
                        unidad = " Y SEIS";
                        break;
                    case 7:
                        unidad = " Y SIETE";
                        break;
                    case 8:
                        unidad = " Y OCHO";
                        break;
                    case 9:
                        unidad = " Y NUEVE";
                        break;
                }
            }
        }
        if ((numUser > 0) && (numUser < 16)) {
            numeroFinal = especiales;
        } else if (numUser == 20) {
            numeroFinal = "VEINTE";

        } else {
            numeroFinal = decimal += unidad;
        }
        System.out.println(numeroFinal);

    }
}
