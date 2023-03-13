package service;

import service1.Cast;
import service2.Director;

import java.util.Comparator;
import java.util.List;

public class Movie {

    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> castList;

    public Movie(String name, int year, String description, Director director, List<Cast> castList) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.castList = castList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCastList() {
        return castList;
    }

    public void setCastList(List<Cast> castList) {
        this.castList = castList;
    }
    public static Comparator<Movie>sortByMovieName=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }; public static Comparator<Movie>sortByMovieYear=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();
        }
    }; public static Comparator<Movie>sortByMovieDirector=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getName());
        }
    };


    @Override
    public String toString() {
        return "Movie: " +"\n"+
                "name: " + name +"\n"+
                "year: " + year +"\n"+
                "description: " + description +"\n"+
                "director: " + director +"\n"+
                "castList: " + castList ;
    }
}
