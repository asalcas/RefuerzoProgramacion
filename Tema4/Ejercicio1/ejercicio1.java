package Tema4.Ejercicio1;

import java.util.Scanner;

// Numero introducido: 'num' = 5
// Resultado: capicua = true  
//* Obtenido = true
// Numero introducido: 'num' = 10
// Resultado: capicua = false
//* Obtenido = false
// Numero introducido: 'num' = 11
// Resultado: capicua = true
//* Obtenido = true
// Numero introducido: 'num' = 101
// Resultado: capicua = true
//* Obtenido = true 
// Numero introducido: 'num' = 110
// Resultado: capicua = false
//* Obtenido = false
// Numero introducido: 'num' = 1221
// Resultado: capicua = true

// Numero introducido: 'num' = 1121
// Resultado: capicua = false

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero comprendido entre (0 - 9999): ");

        int numIntroducido = scanner.nextInt();
        boolean capicua = false;

        if (numIntroducido >= 0 && numIntroducido < 10) {
            capicua = true;

        } else if ((numIntroducido >= 10 && numIntroducido < 100) && numIntroducido % 11 == 0) {
            capicua = true;
        } else if (numIntroducido >= 100 && numIntroducido < 1000) {
            // * EJEMPLO 121 */
            // 121 / 10 = 12 | 1
            // cociente = 12
            // resto 1
            // Si la centena (cociente = 1) == unidad (resto = 1) Es capicua
            int centena = numIntroducido / 100;
            int unidad = numIntroducido % 10;
            if (centena == unidad)
                capicua = true;
        } else if ((numIntroducido >= 1000 && numIntroducido < 10000)) {
            // * EJEMPLO 1221 */
            // 1221
            // 1221 / 1000 = 1 | 221 = 1
            // (1221 / 100 = 12 | 21 ) % 10 = 2
            // (1221 / 10 = 122 | 1 ) % 10 = 2
            // 1221 % 10 = 1
            int milesima = (numIntroducido / 1000);
            int centesima = ((numIntroducido / 100) % 10);
            int decima = ((numIntroducido / 10) % 10);
            int unidad = numIntroducido % 10;

            if ((milesima == unidad) && (centesima == decima)) {
                capicua = true;
            }
        }else {
            System.err.println("Introduce un mensaje valido.");;
        }
        scanner.close();
        System.out.println(capicua);
    }

}
