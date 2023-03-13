package service5;

import service.Movie;

import java.util.List;

public class Sortable implements Sorts {
    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(Movie.sortByMovieName);
        for (Movie m : movies) {
            System.out.println(m);
            System.out.println("*****************************");
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(Movie.sortByMovieYear);
        for (Movie s : movies) {
            System.out.println(s);
            System.out.println("*****************************");
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(Movie.sortByMovieDirector);
        for (Movie a : movies) {
            System.out.println(a.getDirector().getName()+"\nMovie: "+a.getName());
            System.out.println("*****************************");
        }
    }
}
