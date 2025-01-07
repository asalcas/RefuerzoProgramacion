package Tema7.ejerciciosEspeciales.ejercicio1;

import java.util.Scanner;

public class Ejercicio1Especial {
    /***
     * 
     * @param args
     */

     // Prueba 1: 1h 10' 50"  +  10" a incrementar.
     // Resultado esperado = 1h 11' 0"
     //* */ Resultado CORRECTO
    
     // Prueba 2: 1h 10' 0" + 120" a incrementar.
     // Resultado esperado 1h 12' 0"
     //* */ Resultado CORRECTO
    
     // Prueba 3:
     // Prueba 2: 1h 10' 0" + 0" a incrementar.
     // Resultado esperado 1h 10' 0"
     //* */ Resultado CORRECTO
    
     // Prueba 4:
     // Prueba 2: 1h 59' 50" + 10" a incrementar.
     // Resultado esperado 2h 0' 0"
     //* */ Resultado CORRECTO
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int segundos;
        int segundosIncremento;
        int segundosTotales;
        int minutos; 
        int horas;
        
        // Datos fecha a usar
        System.out.println("Indica con que hora quieres trabajar: ");
        System.out.print("¿Que hora quieres?: ");
        horas = lector.nextInt();
        System.out.print("¿Que minuto quieres?: ");
        minutos = lector.nextInt();
        System.out.print("¿Que segundos quieres?: ");
        segundos = lector.nextInt();
        
        // Dato: Segundos a incrementar a la fecha
        System.out.println("Ahora debes introducir unos segundos a incrementar: ");
        segundosIncremento = lector.nextInt();
        segundosTotales = segundos + segundosIncremento;

        if (segundosTotales >= 60){
            for(int i = segundosTotales; i >= 60;){
                i -= 60;
                segundosTotales = i;
                minutos++;
                
            }
        }
        if (minutos >= 60){
            for(int i = minutos; i>= 60;){
                minutos-=60;
                i = minutos;
                horas++;
            }
            
        }
        
        String miResultado = String.format("El resultado final deberia ser: %dh %d' %d''", horas, minutos, segundosTotales);
        System.out.println(miResultado);
        lector.close();
    }
    
}
