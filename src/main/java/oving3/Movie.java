package oving3;

public class Movie {
    private String title;

    private String director;

    private int releaseYear;

    public Movie(String director, int releaseYear, String title) {
        this.director = director;
        this.releaseYear = releaseYear;
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    public int getReleaseYear(){
        return this.releaseYear;

    }
    public String toString(){
        return title + releaseYear + ", directed by " + director;

    }


}
