
public class Ejercicio2
{


    public static void Main(String[] args)
    {
        int numeroEstudiantes = 4;
        int numeroProfes = 7;
        
        School colegio = new School();

        Console.WriteLine("=====================");
        Console.WriteLine("|| Interactuar con: ||");
        Console.WriteLine("=====================");
        Console.WriteLine("                    ");
        Console.WriteLine("1.Alumnos           ");
        Console.WriteLine("2.Profesores        ");
        Console.WriteLine("3.Clases            ");

        int eleccion = Int32.Parse(Console.ReadLine());

        if (eleccion == 1)
        {
            Console.WriteLine("Has elegido alumnos, que quieres añadir o eliminar");
            string eleccionAlumnos = Console.ReadLine().ToLower();
            if (eleccionAlumnos.Equals("añadir"))
            {
                colegio.addStudents(numeroEstudiantes);
            }
            else if (eleccionAlumnos.Equals("eliminar"))
            {
                colegio.delStudents(numeroEstudiantes);
            }
            else
            {
                Console.WriteLine("Error, te has equivocao");
            }

        }
        else if (eleccion == 2)
        {
            Console.WriteLine("Has elegido profesores, que quieres añadir o eliminar");
            string eleccionProfesores = Console.ReadLine().ToLower();
            if (eleccionProfesores.Equals("añadir"))
            {
                colegio.addProfes(numeroProfes);
            }
            else if (eleccionProfesores.Equals("eliminar"))
            {
                colegio.delProfes(numeroProfes);
            }
            else
            {
                Console.WriteLine("Error, te has equivocao");
            }

        }
        else if (eleccion == 3)
        {
            Console.WriteLine("Has elegido clases...");
            colegio.createClass();

        }



    }


    public class School
    {
        private int students;
        private int teachers;
        private int classes;


        public void addStudents(int estudiantesHay)
        {
            Console.WriteLine("Cuantos alumnos quieres añadir?");
            int addAlumnitos = Int32.Parse(Console.ReadLine());
            int numeroAlumFinal = estudiantesHay + addAlumnitos;
            Console.WriteLine("Ahora hay :" + numeroAlumFinal + " alumnos en clase");
        }
        public void delStudents(int estudiantesHay)
        {
            Console.WriteLine("Cuantos alumnos quieres remover?");
            int delAlumnitos = Int32.Parse(Console.ReadLine());
            int numeroAlumFinal = estudiantesHay - delAlumnitos;
            Console.WriteLine("Ahora hay :" + numeroAlumFinal + " alumnos en clase");
        }

        public void addProfes(int profesHay)
        {
            Console.WriteLine("Cuantos profesores quieres añadir?");
            int addProfe = Int32.Parse(Console.ReadLine());
            int numeroProfeFinal = profesHay + addProfe;
            Console.WriteLine("Ahora hay :" + numeroProfeFinal + " profesores en el centro");
        }
        public void delProfes(int profesHay)
        {
            Console.WriteLine("Cuantos profesores quieres remover?");
            int delProfes = Int32.Parse(Console.ReadLine());
            int numeroProfesFinal = profesHay - delProfes;
            Console.WriteLine("Ahora hay :" + numeroProfesFinal + " profesores en el centro");
        }
        public void createClass()
        {
            Console.WriteLine("Que nueva clase quieres dar?");
            String nombreClase = Console.ReadLine();
            Console.WriteLine("Perfecto, la nueva clase: " + nombreClase + " Se ha creado con exito");

        }



    }


}
