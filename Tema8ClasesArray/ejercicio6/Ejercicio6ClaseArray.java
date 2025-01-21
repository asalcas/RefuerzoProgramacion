package ejercicio6;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6ClaseArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] cuponPremiado = new int[6];
        int[] cuponComprado = new int[cuponPremiado.length];
        int numerosAcertados = 0;
        String cadenaArray = "";

        // Es posible usarlo en este caso, pero podrian ser arrays de distinto tamaño
        for(int i = 0; i < cuponPremiado.length; i++){
            cuponComprado[i]= rnd.nextInt(1,50);
            cuponPremiado[i]= rnd.nextInt(1,50);
        }
        /*  VISTO CON JESUS, para no repetir numeros. (No entiendo muy bien.)

        for(int i = 0; i < cuponComprado.length; i++){
            cuponComprado[i]= rnd.nextInt(1,50);
            for(int j = 0; j < i; j++){
                while(cuponComprado[j] == cuponComprado[i]){
                    cuponComprado[i]= rnd.nextInt(1,50);
                    j=0;
                }
            } 
        }   
        for(int i = 0; i < cuponPremiado.length; i++){
            cuponPremiado[i]= rnd.nextInt(1,50);
            for(int j = 0; j < i; j++){
                while(cuponPremiado[j] == cuponPremiado[i]){
                    cuponPremiado[i]= rnd.nextInt(1,50);
                    j=0;
                }
                
            }
            
        }
            //! OTRA FORMA DE HACERLO 
        boolean encontrado;
        for (int i = 0; i < aleatorios.length; i++) {
            do {
                encontrado = false;
                aleatorios[i] = r.nextInt(1, 50);
                
                for (int j = 0; j < i; j++) {
                    if (aleatorios[i] == aleatorios[j])
                        encontrado = true;
                }
            } while (encontrado);
        }
            */
        Arrays.sort(cuponPremiado);
        cadenaArray = Arrays.toString(cuponComprado);
        System.out.println("El cupon que has comprado es: \n" + cadenaArray);
        cadenaArray = Arrays.toString(cuponPremiado);
        System.out.println("Y el cupon premiado es: \n" + cadenaArray);

        for(int i= 0; i < cuponPremiado.length; i++){
            if (cuponComprado[i] == cuponPremiado[i]){
                numerosAcertados++;
                System.out.println(String.format("Has acertado en la posición: %d con el numero: %d", i, cuponComprado[i]));
            }else{
                System.out.println(String.format("En el numero %d no has acertado :(", cuponComprado[i]));
            }
        }
        System.out.println(String.format("Has acertado en total %d veces", numerosAcertados));
    }
}
