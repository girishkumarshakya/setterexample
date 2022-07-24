package spring.core.setter.java;

public class Movie {
    private String name;
    private String director;
    private String stuntMaster;
    private String numberOfArtists;
    private String releaseDate;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStuntMaster() {
        return stuntMaster;
    }

    public void setStuntMaster(String stuntMaster) {
        this.stuntMaster = stuntMaster;
    }

    public String getNumberOfArtists() {
        return numberOfArtists;
    }

    public void setNumberOfArtists(String numberOfArtists) {
        this.numberOfArtists = numberOfArtists;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", stuntMaster='" + stuntMaster + '\'' +
                ", numberOfArtists='" + numberOfArtists + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }


}
