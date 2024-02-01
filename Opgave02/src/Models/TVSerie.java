package Models;

import java.util.ArrayList;

public class TVSerie extends VideoStuff {
    private int numberOfSeasons;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString() {
        return getTitle() + " " + numberOfSeasons + " " + getGenres() + " " + getCast();
    }
}
