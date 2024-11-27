package ejercicio1;

import java.util.Scanner;

class Ejercicio1 {

    // Escribe un programa que vaya pidiendo al usuario números enteros positivos
    // que debe ir sumando. Cuando el usuario no quiera insertar más números,
    // introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
    // suma de los números positivos introducidos por el usuario.
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean funcionando = true;
        int numUser;
        int suma = 0;
        System.out.println(
                "Introduce numeros positivos, y cuando quieras parar la ejecución introduce un numero negativo: ");

        while (funcionando) {
            numUser = lector.nextInt();
            if (numUser >= 0) {
                suma += numUser;
                System.out.println("Introduce otro Nº: ");
            } else {
                funcionando = false;
            }
        }
        System.out.println("La suma es: " + suma);
        lector.close();
    }
}