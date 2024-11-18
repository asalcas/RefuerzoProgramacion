import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un numero cercano al cero: ");
        double numeroInput = lector.nextDouble();
        boolean funcionando = true;
        while (funcionando == true){
            if (numeroInput > 0 && numeroInput < 1){
                System.out.println("Este numero es Casi 0");
                funcionando = false;
            }else if (numeroInput < 0 && numeroInput > -1) {
                System.out.println("Este numero es Casi 0");
                funcionando = false;
            }else {
                System.out.println("Sigue intentando con otro numero más cercano a 0");
            }
        }
    lector.close();
        
    }
}
