package ejercicio7;

import java.util.Scanner;

public class Ejercicio7Arrays {
    // Colores: 
    public static String Azul = "\u001B[34m";
    public static String Amarillo = "\u001B[33m";
    public static String Rojo = "\u001B[31m";
    public static String Restart = "\u001B[37m";
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int respuestaUser;
        int valor;
        
        
        int[] arrayMeses = new int[12];
        
        for(int i = 0; i < arrayMeses.length; i++){
            System.out.println("Escribe la temperatura media del mes: " + (i + 1));
            respuestaUser = lector.nextInt();
            arrayMeses[i] = respuestaUser;
        }
        for(int i = 0; i < arrayMeses.length; i++){
            valor = arrayMeses[i];
            System.out.print("Mes " + (i + 1) + "\t");

            if (valor < 10 && valor > -10){
                System.out.print(Azul);
            }else if (valor < 30 && valor >= 10){
                System.out.print(Amarillo);
            }else if(valor >= 30){
                System.out.print(Rojo);
            }
            
            for(int j = 0; j < valor; j++){
            System.out.print("█ ");
            }
            System.out.println(Restart);
        }
        lector.close();
    }
}
