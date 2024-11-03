package Ejercicio3;



import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Escribe tu año de nacimiento: ");
       
        int anioNacimiento = scanner.nextInt();

        int anioActual = LocalDate.now().getYear();
        int edad = anioActual - anioNacimiento;
        System.out.println("Tu edad es de: " + edad + " años.");
        
        
    }
}



