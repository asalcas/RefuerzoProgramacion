package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4ClaseArray {
    public static void main(String[] args) {
        int[] competidores = new int[8];
        int[] arrayReverse = new int[competidores.length];
        int j = 0;
        Scanner sc = new Scanner(System.in);
        int puntuacion;
        String cadenaArray = "";
        System.out.println("Introduce las puntuaciones de los competidores de ajedrez: ");

        for(int i = 0; i < competidores.length; i++){
            puntuacion = sc.nextInt();
            if(puntuacion >= 1000 && puntuacion <= 2800){
                    competidores[i] = puntuacion;
                    System.out.println("Introduce otro numero: ");
                }else{
                    while(puntuacion < 1000 || puntuacion > 2800){
                        System.out.println("Puntuacion no valida. Vuelve a intentarlo: ");
                        puntuacion = sc.nextInt();
                        if(puntuacion >=1000 && puntuacion <= 2800){
                            competidores[i] = puntuacion;
                            System.out.println("Introduce otro numero: ");
                        }
                    }
                }
        }
        Arrays.sort(competidores);
        for(int i = competidores.length -1; i >= 0; i--){
            arrayReverse[i] = competidores[j];
            j++;
        }

        cadenaArray = Arrays.toString(competidores);
        System.out.println(String.format("Cadena ordenada ASCENDENTE: "+cadenaArray));
        cadenaArray = Arrays.toString(arrayReverse);
        System.out.println(String.format("Cadena ordenada DESCENDENTE: "+cadenaArray));
        sc.close();
    }
}
