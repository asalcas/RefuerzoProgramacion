package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lectorString = new Scanner(System.in);
        Scanner lectorInt = new Scanner(System.in);
        String respuestaUser = "";
        int num1;
        int num2;
        boolean funcionando = true;

        do {
            System.out.println("=======================================================");
            System.out.println("=  Introduce dos numeros para realizar una operacion  =");
            System.out.println("=======================================================");
            num1 = lectorInt.nextInt();
            num2 = lectorInt.nextInt();
            System.out.println("===========================");
            System.out.println("=   ¿Que quieres hacer?   =");
            System.out.println("===========================");
            System.out.println("A. Sumar los numeros");
            System.out.println("B. Restar los numeros");
            System.out.println("C. Multiplicar los numeros");
            System.out.println("D. Dividir los numeros");
            System.out.println("E. SALIR");
            respuestaUser = lectorString.nextLine().toUpperCase();

            switch (respuestaUser) {
                case "A":
                    int suma = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + suma);
                    break;

                case "B":
                    int resta = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resta);
                    break;

                case "C":
                    int multiplicacion = num1 * num2;
                    System.out.println(num1 + " x " + num2 + " = " + multiplicacion);
                    break;

                case "D":
                    System.out.print("El mayor sera el dividendo:  \n");
                    if (num1 < num2) {
                        int temporal = num1;
                        num1 = num2;
                        num2 = temporal;
                    }

                    int division = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + division);

                    break;

                case "E":
                    funcionando = false;
                    break;

                default:
                    break;
            }

        } while (funcionando);
        lectorString.close();
        lectorInt.close();
    }
}
