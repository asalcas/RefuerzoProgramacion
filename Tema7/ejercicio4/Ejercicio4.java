package ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Los primeros numeros impares hasta 10 son: ");
        int suma = 0;
        for(int i = 1; i <= 10; i++){
            if (i % 2 != 0){
                suma += i;
                System.out.print(i + " ");
            }
            
        }
        System.out.print("Y la suma da: " + suma);
    }
    
}
