package main.java.executors;

import main.java.enums.MovieGenre;
import main.java.enums.Teams;
import main.java.objects.Movie;
import main.java.objects.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListGenerator {
    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("peter@.gmail.com", LocalDate.of(2019, 7, 10), Teams.COWBOYS));
        users.add(new User("alex@.gmail.com", LocalDate.of(2019, 7, 15), Teams.PREDATORS));
        users.add(new User("bob@.gmail.com", LocalDate.of(2019, 7, 5), Teams.STAY_AT_HOMES));
        users.add(new User("patrick@.gmail.com", LocalDate.of(2019, 6, 2), Teams.COWBOYS));
        users.add(new User("william@.gmail.com", LocalDate.of(2019, 7, 17), Teams.STAY_AT_HOMES));
        users.add(new User("jack@.gmail.com", LocalDate.of(2019, 5, 11), Teams.PREDATORS));
        users.add(new User("bruce@.gmail.com", LocalDate.of(2019, 7, 13), Teams.COWBOYS));
        return users;
    }

    public static List<List<Movie>> getCinemaMoviesList() {
        List<Movie> oldMovies = new ArrayList<>();
        oldMovies.add(new Movie("LIZ THE ELIZABETH TAYLOR STORY", MovieGenre.DRAMA, 33.57));
        oldMovies.add(new Movie("DAYS OF THUNDER", MovieGenre.ACTION, 101.26));
        oldMovies.add(new Movie("MARABUNTA", MovieGenre.HORROR, 65.2));
        oldMovies.add(new Movie("ON THE BORDERLINE", MovieGenre.THRILLER, 48.65));
        oldMovies.add(new Movie("RUNAWAY HEARTS", MovieGenre.FAMILY, 85.12));
        oldMovies.add(new Movie("BARN RED", MovieGenre.FAMILY, 3.25));
        oldMovies.add(new Movie("CONGO", MovieGenre.ACTION, 645.45));
        List<Movie> newArrivals = new ArrayList<>();
        newArrivals.add(new Movie("THIS IS MY YEAR", MovieGenre.DRAMA, 200.00));
        newArrivals.add(new Movie("JEFF DUNHAM - CONTROLLED CHAOS", MovieGenre.COMEDY, 50.55));
        newArrivals.add(new Movie("WHAT THE WATERS LEFT BEHIND", MovieGenre.HORROR, 44.44));
        newArrivals.add(new Movie("ROB THE MOB", MovieGenre.ACTION, 587));
        newArrivals.add(new Movie("STROSZEK", MovieGenre.COMEDY, 64.89));
        List<List<Movie>> cinema = new ArrayList<>();
        cinema.add(oldMovies);
        cinema.add(newArrivals);
        return cinema;
    }
}
