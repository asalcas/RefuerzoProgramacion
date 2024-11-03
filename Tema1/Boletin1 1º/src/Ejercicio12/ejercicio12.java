package Ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantas manzanas se han vendido en el año?");
        double cantidadVentaManzanas = scanner.nextDouble();
        System.out.println("¿Cuantas peras se han vendido en el año?");
        double cantidadVentaPeras = scanner.nextDouble();
        double preciokgManzanas = 2.35;
        double preciokgPeras = 1.95;
        
        double ventaManzanas = cantidadVentaManzanas * preciokgManzanas;
        double ventaPeras = cantidadVentaPeras * preciokgPeras;
        
        System.out.println("La venta anual en KG de Manzanas es de: " + cantidadVentaManzanas+ " con un precio de 2,45€ el Kg, dando un total de: " + ventaManzanas);
        System.out.println("La venta anual en KG de Peras es de: " + cantidadVentaPeras+ " con un precio de 1,95€ el Kg, dando un total de: " + ventaPeras);

        double ventaTotal = ventaManzanas + ventaPeras;

        System.out.println("Las ganancias totales al año fueron de: " + ventaTotal);
    }
}
