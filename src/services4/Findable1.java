package services4;

import service.Movie;
import service1.Cast;

import java.util.List;
import java.util.Scanner;

public class Findable1 implements Findable {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie m : movies) {
            System.out.println(m);
            System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
        }
        return null;
    }
    @Override
    public void findMovieByName(List<Movie> movies) {
        String b = new Scanner(System.in).nextLine();
        for (Movie movie : movies) {
            if (movie.getName().equals(b)) {
                System.out.println(movie);
                System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
            }
        }
    }
    @Override
    public void findMovieByActorName(List<Movie> movies) {
        String v = new Scanner(System.in).nextLine();
        for (Movie movie : movies) {
            for (Cast cast1 : movie.getCastList()) {
                if (cast1.getActorFullName().equals(v)) {
                    System.out.println(cast1);
                    System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
                }
            }
        }
    }
    @Override
    public void findMovieByYear(List<Movie> movies) {
        int a = new Scanner(System.in).nextInt();
        for (Movie movie : movies) {
            if (movie.getYear() == a) {
                System.out.println(movie);
                System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
            }
        }
    }
    @Override
    public void findMovieByDirector(List<Movie> movies) {
        String s = new Scanner(System.in).nextLine();
        for (Movie movie1 : movies) {
            if (movie1.getDirector().getName().equals(s)) {
                System.out.println(movie1);
                System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
            }
        }
    }
    @Override
    public void findMovieByDescription(List<Movie> movies) {
        String d = new Scanner(System.in).nextLine();
        for (Movie movie2 : movies) {
            if (movie2.getDescription().equals(d)) {
                System.out.println(movie2);
                System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
            }
        }
    }
    @Override
    public void findMovieByRole(List<Movie> movies) {
        String f = new Scanner(System.in).nextLine();
        for (Movie movie3 : movies) {
            for (Cast cast : movie3.getCastList()) {
                if (cast.getActorFullName().equals(f)) {
                    System.out.println(cast);
                    System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");;
                }
            }
        }
    }
}
