

using System.Runtime.CompilerServices;
public class Ejercicio01
{
    public static void Main(String[] args)
    {
        Movie Joker2 = new Movie();
        Movie KickAss = new Movie();

        Console.WriteLine("Añadir o leer una reseña?");
        string condicion = Console.ReadLine().ToLower();

        if (condicion.Equals("añadir"))
        {
            Joker2.addReview();
        }else if (condicion.Equals("leer"))
        {
            KickAss.verReview();
        }else
        {
            Console.WriteLine("Que dice pixa?");
        }
        
        
    }
}
public class Movie {




    // Write a program to create a class called "Movie" with attributes for title, director,
    // actors, and reviews, and methods for adding and retrieving reviews.

    #region Atributos
    private string title;
    private string director;
    private string actors;
    private string reviews;
    #endregion

    #region Propiedades 
    public string get_Reviews() { return reviews; }
    public void set_Reviews(String reviews) { this.reviews = reviews;  } // A EXPLICAR OTRA VE <3
    #endregion

    #region Constructores
   
    // A EXPLICAR NO SE

    #endregion
    #region Metodos

    public void addReview()
    {
        Console.WriteLine("===================");
        Console.WriteLine("|| Añadir review ||");
        Console.WriteLine("===================");
        Console.WriteLine("                   ");
        string addReview = Console.ReadLine();
        Console.WriteLine("La reseña se guardó correctamente");

    }

    public void verReview()
    {
        Console.WriteLine("Que reseña quieres ver?");
        string respuesta = Console.ReadLine().ToLower();
        if (respuesta.Equals("buena")) {
            Console.WriteLine("Inserte reseña buena");

        } else if (respuesta.Equals("mala")){
            Console.WriteLine("Inserte reseña mala");
        } else {
            Console.WriteLine("No introdujiste una respuesta valida, tonto");
        }
    }
    #endregion


}




