
/**
 * Write a description of class Director here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Director
{
    private String name;
    private int filmography;
    
    public Director(String nm, int fm) {
        this.name = nm;
        this.filmography = fm;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getFilmography() {
        return this.filmography;
    }
    
    public void setName(String ne) {
        this.name = ne;
    }
    
    public void setFilmography(int num) {
        this.filmography = num;
    }
    
    public void direct() {
        filmography = filmography + 1;
    }
    
    public String compareTo(Director dr) {
        if ((filmography == dr.filmography) && (name.equals(dr.name))){
            return "They are the same director.";
        }
        else if (filmography > dr.filmography) {
            return this.name + "has directed more films than the other director.";
        }
        else {
            return this.name + "has directed less films than the other director.";
        }
    }
    
    public String toString() {
        return this.name + ", has directed " + this.filmography + " movies.";
    }
  
}
