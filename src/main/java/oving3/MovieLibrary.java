package oving3;

import java.util.ArrayList;

public class MovieLibrary {

    ArrayList<Movie> movies;

    public MovieLibrary() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }
    public Movie findByTitle(String title){
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }
    public ArrayList<Movie> releasedAfter(int year){
        ArrayList<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getReleaseYear() > year) {
                result.add(movie);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MovieLibrary{");
        sb.append("movies=").append(movies);
        sb.append('}');
        return sb.toString();
    }
    


    
    
}
