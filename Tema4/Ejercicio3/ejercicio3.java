package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {


// Numero introducido: '48586412' = 16
// Resultado esperado: 48586412Q  
//* Obtenido = 48586412Q
// Numero introducido: '12345678' = 14
// Resultado esperado: 12345678Z
//* Obtenido = 12345678Z
    public static void main(String[] args) {
        // DNI numero de 8 digitos que surge de
        // ? letra = numero DNI % 23;
        Scanner lector = new Scanner(System.in);
        String letraDni = "";
        System.out.println(12345678 % 23);
        int numDNI = lector.nextInt();
        int obtenerLetra = numDNI % 23;
        switch (obtenerLetra) {
            case 0:
                letraDni = "T";
                break;
            case 1:
                letraDni = "R";
                break;
            case 2:
                letraDni = "W";
                break;
            case 3:
                letraDni = "A";
                break;
            case 4:
                letraDni = "G";
                break;
            case 5:
                letraDni = "M";
                break;
            case 6:
                letraDni = "Y";
                break;
            case 7:
                letraDni = "F";
                break;
            case 8:
                letraDni = "P";
                break;
            case 9:
                letraDni = "D";
                break;
            case 10:
                letraDni = "X";
                break;
            case 11:
                letraDni = "B";
                break;
            case 12:
                letraDni = "N";
                break;
            case 13:
                letraDni = "J";
                break;
            case 14:
                letraDni = "Z";
                break;
            case 15:
                letraDni = "S";
                break;
            case 16:
                letraDni = "Q";
                break;
            case 17:
                letraDni = "V";
                break;
            case 18:
                letraDni = "H";
                break;
            case 19:
                letraDni = "L";
                break;
            case 20:
                letraDni = "C";
                break;
            case 21:
                letraDni = "K";
                break;
            case 22:
                letraDni = "E";
                break;

            default:
            System.out.println("Ninguna opción es correcta.");
                break;
        }
        System.out.println(Integer.toString(numDNI) + letraDni);
        
        lector.close();
    }

}
