package Ejercicio8;

import java.util.Scanner;

public class ejercicio8 {
    // Numero introducido (mes): 12
    // Numero introducido(year): 2014
    // * Resultado Obtenido: Diciembre: 31 dias 
    // Numero introducido (mes): 2
    // Numero introducido(year): 2014
    // * Resultado Obtenido: Febrero: 28 dias
    // Numero introducido (mes): 2
    // Numero introducido(year): 2024
    // * Resultado Obtenido: Febrero: 29 dias
    public static void main(String[] args) {
        // Pedir al usuario el número de un mes y el año (comprobando si es o no
        // bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.

        // Enero: 31 días
        // Febrero: 28 o 29 días (si es año bisiesto)
        // Marzo: 31 días
        // Abril: 30 días
        // Mayo: 31 días
        // Junio: 30 días
        // Julio: 31 días
        // Agosto: 31 días
        // Septiembre: 30 días
        // Octubre: 31 días
        // Noviembre: 30 días
        // Diciembre: 31 días

        // 2012.
        // 2016.
        // 2020.
        // 2024.
        // 2028.
        // 2032.
        // 2036.
        // year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        Scanner lector = new Scanner(System.in);
        int numYear;
        int numMes;
        String mes = "";
        System.out.println("Introduce el numero de un mes y el numero de un año: ");
        numMes = lector.nextInt();
        numYear = lector.nextInt();

        if (numMes > 0 && numMes <= 12) {
            // Es bisiesto
            switch (numMes) {
                case 1:
                    mes = "Enero: 31";
                    break;
                case 2:
                    if (((numYear % 4 == 0) && (numYear % 100 != 0)) || (numYear % 400 == 0)) {
                        mes = "Febrero: 29";
                    } else {
                        mes = "Febrero: 28";
                    }
                    break;
                case 3:
                    mes = "Marzo: 31";
                    break;
                case 4:
                    mes = "Abril: 30";
                    break;
                case 5:
                    mes = "Mayo: 31";
                    break;
                case 6:
                    mes = "Junio: 30";
                    break;
                case 7:
                    mes = "Julio: 31";
                    break;
                case 8:
                    mes = "Agosto: 31";
                    break;
                case 9:
                    mes = "Septiembre: 30";
                    break;
                case 10:
                    mes = "Octubre: 31";
                    break;
                case 11:
                    mes = "Noviembre: 30";
                    break;
                case 12:
                    mes = "Diciembre: 31";
                    break;

                default:
                    break;
            }
            System.out.println(mes + " dias");
        } else {
            lector.close();
            System.out.println("Introduce un mes válido.");
        }
    }
}
