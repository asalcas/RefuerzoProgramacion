import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nota al sistema: ");
        int notaUsuario = scanner.nextInt();

        if ((notaUsuario >= 0) && (notaUsuario < 5)){
            System.out.println("La nota se considera: INSUFICIENTE");
        }else if ((notaUsuario >= 5) && (notaUsuario < 6)) {
            System.out.println("La nota se considera: SUFICIENTE");
        }else if ((notaUsuario >= 6) && (notaUsuario < 7)) {
            System.out.println("La nota se considera: BIEN");
        }else if ((notaUsuario >= 7) && (notaUsuario < 9)) {
            System.out.println("La nota se considera: NOTABLE");
        }else if ((notaUsuario >= 9) && (notaUsuario <= 10)) {
            System.out.println("La nota se considera: SOBRESALIENTE");
        }else {
            System.out.println("Tienes que introducir la nota correctamente (0-10)");
        }
        scanner.close();
    }
}
