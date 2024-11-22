import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un numero entre 0 y 99999: ");
        int numeroUsuario = lector.nextInt(); // 0-99999
        // Version + dificultosa:

        if ((numeroUsuario < 10) && (numeroUsuario > 0)){
            System.out.println("El numero tiene 1 cifra");
        }else if ((numeroUsuario < 100) && (numeroUsuario > 0)){
            System.out.println("El numero tiene 2 cifras");
        }else if ((numeroUsuario < 1000) && (numeroUsuario > 0)){
            System.out.println("El numero tiene 3 cifras");
        }else if ((numeroUsuario < 10000) && (numeroUsuario > 0)){
            System.out.println("El numero tiene 4 cifras");
        }else if ((numeroUsuario < 100000) && (numeroUsuario > 0)){
            System.out.println("El numero tiene 5 cifras");
        }else {
            System.out.println("El numero debe estar comprendido entre 0 y 99999");
        }

        // La condicion es por el tamaño de 'numeroUsuario' por que sea "0" o "99999"
        // los limites en cifras
        // siempre seran 0 y 5


        /*if ((numeroUsuario.length() >= 0) && (numeroUsuario.length() <= 5)) {
            int numCifras = numeroUsuario.length();
            System.out.println("El número tiene: " + numCifras + " cifras");
        } else {
            System.out.println("Tienes que poner un numero comprendido ente 0 y 99999");
        }*/
        lector.close();


    }

}
