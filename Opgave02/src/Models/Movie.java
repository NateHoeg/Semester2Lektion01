package Models;

import java.util.ArrayList;

public class Movie extends VideoStuff{
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return getTitle() + " " + productionYear + " " + director + " " + getGenres() + " " + rating + " " + getCast();
    }
}
