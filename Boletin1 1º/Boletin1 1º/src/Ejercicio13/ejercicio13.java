package Ejercicio13;

import java.util.Scanner;

import javax.swing.Spring;

public class ejercicio13 {
    public static void main (String[] args) {
        //Aspectos que influirán IF, Elif (Si debemos ir a la biblioteca tambien, ELSE no podemos)
        Scanner respuesta = new Scanner(System.in);

        System.out.println("Esta lloviendo? (Y/N): ");
        String lluvia = respuesta.nextLine().toUpperCase();
        System.out.println("Has finalizado las tareas? (Y/N): ");
        String deberes = respuesta.nextLine().toUpperCase();
        System.out.println("Tienes que ir a la biblioteca?");
        String biblioteca = respuesta.nextLine().toUpperCase();
        

        if (lluvia.equals("N") && deberes.equals("Y")){
            System.out.println("Vale, puedes salir a tocar cesped.");

        }else if (biblioteca.equals("Y")) {
           System.out.println("Puedes salir, pero animo estudiando"); 

        }else if (lluvia.equals("Y") && deberes.equals("Y")){
            System.out.println("No puedes salir, esta lloviendo");
        
        }else{
            System.out.println("NO puedes salir");
        }



    }

}
