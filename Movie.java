
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    private Director movieDirector;
    private String title;
    
    public Movie (String ti, Director dr) {
        this.movieDirector = dr;
        this.title = ti;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String tl) {
        this.title = tl;
    }
    
    public String toString() {
        return "The movie is " + this.title + ". The director, " + this.movieDirector;
    }
    
    public String compareTo(Movie mv) {
        if ((title.equals(mv.title)) && (movieDirector.equals(mv.movieDirector))){
            return "These are the same movie.";
        }
        else {
            return this.title + " is not the same as the other movie";
        }
    }
}
