package ejercicio7;
import java.util.Arrays;
public class Ejercicio7ClaseArray {
    public static void main(String[] args) {
        int [] arrayNumeros = new int[55]; 
        int desde = 0;
        int hasta = 0;
        String cadenaArray = "";

        for(int i = 1; i <= 10 ; i++){
            hasta = desde + i;
            Arrays.fill(arrayNumeros,desde,hasta,i);
            desde = hasta;
        }
        cadenaArray = Arrays.toString(arrayNumeros);
        System.out.println(cadenaArray);
    }
}
