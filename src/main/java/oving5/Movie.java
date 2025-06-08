package oving5;

import java.util.List;

public class Movie {

    private String title;
    private String director;
    private int releaseYear;
    private List<String> genres;
    private double rating;

    public Movie(String title, String director, int releaseYear, List<String> genres, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genres = genres;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<String> getGenres() {
        return genres;
    }

    public double getRating() {
        return rating;
    }



}
