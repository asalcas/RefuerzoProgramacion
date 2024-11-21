import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public class alumno{
        //#region Atributos
        private String nombre;
        private int edad;
        List<Integer>notasCurso;
        private int notas;
        //#endregion
        //#region Cosntructores
        public alumno(){
            // AI YO NO CE
        }

        public alumno(String nombre, int edad, List<Integer> notasCurso){
            // AI YO NO CE

        }
        //#endregion
        //#region Getters y Setters

        // AL FINAL DE CUENTAS TENDREMOS QUE CREAR OBJETOS ALUMNO EN AULA, POR LO QUE TENEMOS QUE GETEAR Y SETEAR TODO
        public String get_nombre(){
            return nombre;
        }
        public void set_nombre(String nombre){
            this.nombre = nombre;
        }
        public int get_edad(){
            return edad;
        }
        public void set_edad(int edad){
            this.edad = edad;
        }
        public List<Integer> getNotasCurso(){
            return notasCurso;
        }
        public void set_notasCurso(List<Integer> notasCurso){
            this.notasCurso = notasCurso;
        }
        public int get_notas(){
            return notas;
        }
        public void set_notas(int notas){
            this.notas = notas;
        }
        
        //#endregion 
        //#region Métodos
        public int addNota(){
            Scanner lector = new Scanner (System.in);
            List<Integer>notasCursoAlumno1 = new ArrayList<>();
            boolean valor = true;

            while (valor = true){
                System.out.println("Escribe tu ultima nota :)");
                if (lector.hasNextInt()){
                    lector.nextInt();
                    System.out.println("Has añadido la nota con exito");
                    valor = false;
                }


                lector.close();
            }
            System.out.println("Escribe tu ultima nota :)");
            lector.nextInt();
            System.out.println("Has añadido la nota con exito");

            return 2;
        }

        public int notaMedia(){
            // recorreria la lista con un for por el tamaño de la lista donde por cada iteración, sumaria "nota" += notaResult, y despues dividiria nota Result al
            // final por I, haciendo alguna validación para que no pueda fallar, ya que tengo que sacar I de dentro del bucle. O asigno el valor a una variable, 
            // puedo inicianizarla a 0 en el bucle y que vaya += dentro hasta que llegue a lo que quiero para dividir el numero de notas a notaResult


            return 1;
        }
        //#endregion

    
    }
}
