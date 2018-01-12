
/**
 * Write a description of class DirectorDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DirectorDriver
{
    public static void main(String[] args) {
        Director chris = new Director("Chris Nolan", 14);
        Director steven = new Director("Steven Spielberg", 56);
        
        System.out.println(chris);
        System.out.println(steven);
        
        chris.toString();
        steven.toString();
        
        changeIt(chris, steven);
        
        chris.toString();
        steven.toString();
        
        System.out.println(chris);
        System.out.println(steven);
    }
    
    public static void changeIt(Director obj1, Director obj2) {
        obj1.setName("Tim Burton");
        obj1.setFilmography(38);
        
        Director obj3 = new Director("George Lucas", 18);
        obj2 = obj3;
        obj2.setName("Zack Snyder");
        obj2.setFilmography(15);
        
        obj1.toString();
        obj2.toString();
    }
}
