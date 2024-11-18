import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe dos numeros para ordenarlos de menor a mayor: ");
        int numeroInput1 = lector.nextInt();
        System.out.println("Escribe otro numero: ");
        int numeroInput2 = lector.nextInt();
        
        if (numeroInput1 > numeroInput2) {
            System.out.println("Los numeros ordenados de menor a mayor son: menor: "+numeroInput2+" y mayor: "+numeroInput1);
            System.out.println(numeroInput2);
            System.out.println(numeroInput1);

        }else{
            System.out.println("Los numeros ordenados de menor a mayor son: menor: "+numeroInput1+" y mayor: "+numeroInput2);
            System.out.println(numeroInput1);
            System.out.println(numeroInput2);
        }

    }
}
