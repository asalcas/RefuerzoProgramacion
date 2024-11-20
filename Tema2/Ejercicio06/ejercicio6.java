import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a solucionar una ecuación de segundo grado: ax^2 + bx + c = 0");
        System.out.println("Introduce un numero para A: ");
        double a = scanner.nextDouble();
        System.out.println("Introduce un numero para B: ");
        double b = scanner.nextDouble();
        System.out.println("Introduce un numero para C: ");
        double c = scanner.nextDouble();
        double discriminante = Math.pow(b,2) - (4 * a * c);
        boolean funcionando = true;

        

            if (a == 0 || b == 0 || c == 0){
                System.out.println("La solución es: 0");
                
            }else if ((discriminante) == 0){
                double x = -b / (2 * a);
                System.out.println("La solución es:" + x);
            }else if ((discriminante) > 0){
                double x = (-b - (Math.sqrt(discriminante))) / (2*a);
                double x1 = (-b + (Math.sqrt(discriminante))) / (2*a);
                System.out.println("Las soluciones son:" + x +" y "+ x1);
            }else{
                System.out.println("No hay solucion REAL");
            
        }  
    }
}
