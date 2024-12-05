package Ejercicio1;

import java.util.Scanner;

class switches {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero del 0 al 10 para asignar una nota: ");
        int notaUsuario = lector.nextInt();

        switch (notaUsuario) { // METER LOS CASE JUNTOS
            case 0:
                System.out.println("INSUFICIENTE");
                break;
            case 1:
                System.out.println("INSUFICIENTE");
                break;
            case 2:
                System.out.println("INSUFICIENTE");
                break;
            case 3:
                System.out.println("INSUFICIENTE");
                break;
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
                System.out.println("NOTABLE");
                break;
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
                System.out.println("SOBRESALIENTE");
                break;
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("Nota inválida, asegurese de que la nota está entre 0 y 10.");
                break;
        }
        lector.close();
    }
}