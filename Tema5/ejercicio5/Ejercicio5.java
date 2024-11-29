package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Implementar una aplicación para calcular datos estadísticos de las edades de
        // los alumnos de un centro educativo. Se introducirán datos hasta que uno de
        // ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
        // la media, el número de alumnos y cuántos son mayores de edad.
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la edad de los alumnos de IES Nervion: ");
        int respuestaUser = 0;
        int sumaEdades = 0;
        int mediaEdadCentro = 0;
        int contadorAlumnos = 0;
        int contadorAlumnosMayorEdad = 0;
        respuestaUser = lector.nextInt();
        while (respuestaUser >= 0) {
            sumaEdades += respuestaUser;
            contadorAlumnos++;
            mediaEdadCentro = sumaEdades / contadorAlumnos;
            if (respuestaUser >= 18) {
                contadorAlumnosMayorEdad++;
            }
            respuestaUser = lector.nextInt();
        }
        System.out.println("La suma de todas las edades es de: " + sumaEdades);
        System.out.println("Y hay " + contadorAlumnos + " alumnos en el instituto");
        System.out.println("La media de edad de los alumnos del centro es de: " + mediaEdadCentro);
        System.out.println("Hay " + contadorAlumnosMayorEdad + " alumnos con mas de 18 años ");
        lector.close();
    }
}
