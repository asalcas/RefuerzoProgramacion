import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = lector.nextInt();
        System.out.println("Introduce otro numero: ");
        int num2 = lector.nextInt();
        System.out.println("Introduce un ultimo numero: ");
        int num3 = lector.nextInt();

        if ( num1 > num2 && num2 > num3){
            System.out.println("num1 > num2 > num3");
        }else if (num2 > num1 && num1 > num3) {
            System.out.println("num2 > num1 > num3");
        }else if (num3 > num2 && num2 > num1){
            System.out.println("num3 > num2 > num1");
        }else if (num1 > num3 && num3 > num2){
            System.out.println("num1 > num3 > num2");
        }else if (num2 > num3 && num3 > num1){
            System.out.println("num2 > num3 > num1");
        }
    }

    //! HACERLO CON IF ANIDADOS

}
