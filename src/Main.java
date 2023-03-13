import service.Movie;
import service1.Cast;
import service2.Director;
import service5.Sortable;
import services4.Findable1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cast>casts1=new ArrayList<>();
        casts1.add(new Cast("Vin Diesel","Dominic Toretto"));
        casts1.add(new Cast("Mishel Rodriguez","Letty Ortiz"));
        casts1.add(new Cast("Pol Walker","Brian O’Conner"));
        casts1.add(new Cast("Jason Statham","Deckard  Shaw"));
        casts1.add(new Cast("Dwayne Johnson","Luck Hops"));
        casts1.add(new Cast("Tyrese Gibson","Roman Pearce"));
        casts1.add(new Cast("Luda Cris","Tej Parker"));
        casts1.add(new Cast("Nathalie  Emmanuel","Ramsey"));
        casts1.add(new Cast("Sung Kang","Han Lue"));
        ArrayList<Cast>casts2=new ArrayList<>();
        casts2.add(new Cast("Shumkar Beishenakiev", "Shuma "));
        casts2.add(new Cast("Azamat Ismailov", "Azamat "));
        casts2.add(new Cast("Aiperi Chotonova", "Aiperi "));
        casts2.add(new Cast("Esenakunov Ulan", "Molar1"));
        casts2.add(new Cast("Azim Kasymov", "Molar2"));
        casts2.add(new Cast("Sultanov Chyngyz", "Chika"));
        ArrayList<Movie>movies=new ArrayList<>();
        Movie movie1 = new Movie("Fast&Furious-7", 2015, "Action criminal adventure",
                new Director("Gary","Scot"),casts1);
        Movie movie2 = new Movie("Perekupshik",2019,"Comedy drama Action",
                new Director("Azamat ","Ismailov"),casts2);
        movies.add(movie1);
        movies.add(movie2);
        Findable1 findable1 = new Findable1();
        Sortable sort = new Sortable();

        while (true){
            switch (scanner.next()){
                case "Movies":
                   findable1.getAllMovies(movies);
                    break;
                case "SearchMovieName":
                    System.out.println("~~~~Write the name of the movie~~~~");
                    findable1.findMovieByName(movies);
                    break;
                case "SearchActorName":
                    System.out.println("~~~~Write the name of the actor~~~~");
                   findable1.findMovieByActorName(movies);
                    break;
                case "SearchMovieYear":
                    System.out.println("~~~~Write the year of release of the film~~~~ ");
                    findable1.findMovieByYear(movies);
                    break;
                case "SearchMovieByDirector":
                    System.out.println("~~~~write the director's name~~~~");
                    findable1.findMovieByDirector(movies);
                    break;
                case "SearchMovieByDescription":
                    System.out.println("~~~~write a description of the movie~~~~");
                    findable1.findMovieByDescription(movies);
                    break;
                case "SearchMovieByRole":
                    System.out.println("~~~~Write the role of an actor~~~~");
                   findable1.findMovieByRole(movies);
                    break;
                case "SortByName":sort.sortByMovieName(movies);
                   break;
                case "SortByYear":
                    sort.sortByYear(movies);
                    break;
                case "SortByDirector":
                    sort.sortByDirector(movies);
                    break;
                default:
                    System.err.println("Error");

            }
        }


    }
}
