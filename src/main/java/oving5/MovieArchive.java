package oving5;

import java.util.List;

public class MovieArchive {
    
    private List<Movie> movies;

    public MovieArchive(List<Movie> movies) {
        if (movies == null) {
            throw new IllegalArgumentException("");
        }
        this.movies = movies;
    }

    public List<Movie> findMovies(Predicate<Movie> predicate){
        return movies.stream().anyMatch(predicate);

    }

public boolean hasHighlyRatedMovie(Predicate<Movie> predicate){
    return movies.stream().filter(p -> p.getRating() > 8);

}

public long countMovies(Predicate<Movie> predicate){

}

    
    
}
