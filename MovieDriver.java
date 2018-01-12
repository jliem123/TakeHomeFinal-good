
/**
 * Write a description of class MovieDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieDriver
{
    public static void main(String[] args) {
        Director joss = new Director("Joss Whedon", 15);
        Director chris = new Director("Chris Nolan", 14);
        
        Movie avengers = new Movie("The Avengers", joss);
        Movie dark = new Movie("The Dark Knight", chris);
        
        System.out.println(avengers);
        System.out.println(dark);
    }
}
