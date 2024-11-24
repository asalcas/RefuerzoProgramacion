import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe tres numeros, y veremos si los dos primeros dan como solucion el tercero: ");
        int a = lector.nextInt();
        System.out.println("Dame otro numero: ");
        int b = lector.nextInt();
        System.out.println("Dame el ultimo numero: ");
        int c = lector.nextInt();

        if (a + b == c) {
            System.out.println("Si sumamos el 1er numero y el 2do el resultado es el 3ro");
        }else if (b + c == a) {
            System.out.println("Si sumamos el 2do numero y el 3ro el resultado es el 1ro");
        }else if (a + c == b){
            System.out.println("Si sumamos el 1er numero y el 3ro el resultado es el 2do");
        }else {
            System.out.println("Ninguna suma da como resultado otro numero");
        }
        lector.close();
    }

}
