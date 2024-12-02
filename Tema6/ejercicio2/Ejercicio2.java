package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {

    int numPares = 0;
        do {
            if (numPares % 2 == 0){
                System.out.println("Los numeros pares hasta el 200 son: " + numPares);
            }
            numPares++;
        } while (numPares < 200);
    }
}
