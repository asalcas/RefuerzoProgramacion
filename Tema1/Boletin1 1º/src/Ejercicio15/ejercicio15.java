package Ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        final double IVA = 21.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un precio al que le tengamos que aplicar el 21% de IVA: ");
        double precioIntroducido = scanner.nextDouble();
        double precioIVA = precioIntroducido * IVA / 100;
        double precioFinal = precioIVA + precioIntroducido;
        System.out.println("El importe del IVA es de: " + precioIVA+ "€");
        System.out.println("El precio final del producto se queda en: " + precioFinal);

    }

}
