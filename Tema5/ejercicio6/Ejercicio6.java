package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Un centro de investigación de la flora urbana necesita una aplicación que
        // muestre cuál es el árbol más alto. Para ello se introducirá por teclado la
        // altura (en centímetros) de cada árbol (terminando la introducción de datos
        // cuando se utilice -1 como altura). La aplicación debe devolver la altura del
        // árbol más alto.

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la altura de los arboles del Parque Maria Luisa: ");
        System.out.println("Recuerda que tienes que introducir los datos en (cm)");
        int resultadoUser = lector.nextInt();
        boolean funcionando = true;
        int alturaMax_arbol = 0;

        while (funcionando) {

            if (resultadoUser > alturaMax_arbol) {
                alturaMax_arbol = resultadoUser;
            }else if (resultadoUser < 0 && resultadoUser != -1){
                System.out.println("Tienes que introducir un numero positivo");
            }
            System.out.println("Escribe otra altura, si escribes -1, se parará el programa");
            resultadoUser = lector.nextInt();

            if (resultadoUser == -1) {
                funcionando = false;
            }
            
        }
        System.out.println("El arbol más alto mide: " + alturaMax_arbol + " cm");
        lector.close();
    }
}
