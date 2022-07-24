package spring.core.setter.java;

public class SimpleMovieLister {
    private Movie movie;

    public SimpleMovieLister() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "SimpleMovieLister{" +
                "movie=" + movie +
                '}';
    }




}
