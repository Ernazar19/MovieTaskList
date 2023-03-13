package service5;

import service.Movie;

import java.util.List;

public interface Sorts {
    void sortByMovieName(List<Movie> movies);

    void sortByYear(List<Movie>movies);


    void sortByDirector(List<Movie>movies);
}
