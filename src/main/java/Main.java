package main.java;

import main.java.enums.MovieGenre;
import main.java.executors.ListGenerator;
import main.java.executors.ListHandler;
import main.java.objects.Box;
import main.java.objects.ChangeableList;
import main.java.objects.Movie;
import main.java.objects.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("First task. Custom functional interface.");
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        System.out.println("Strings before changing: " + strings);
        ChangeableList<String> changeableList = new ChangeableList<>(strings);
        changeableList.changeAll(changeable -> changeable.concat("_@_modified"));
        System.out.println("Strings after changing: " + changeableList.getList() + "\n");

        System.out.println("Second task. List of users.");
        List<User> users = ListGenerator.getUsersList();
        users.forEach(System.out::println);
        System.out.println("\nTeams with users emails, which authorised along last week");
        System.out.println(ListHandler.getSpesialUsersTeams(users));

        System.out.println("\nThird task. Cinema.");
        List<List<Movie>> cinemaMovieList = ListGenerator.getCinemaMoviesList();
        System.out.println("The list of movies:");
        System.out.println(cinemaMovieList);
        Map<MovieGenre, List<Movie>> moviesByGenres = ListHandler.getMoviesByGenre(cinemaMovieList);
        System.out.println();
        ListHandler.printAverageTicketPriceByGenres(moviesByGenres);
        System.out.println();
        ListHandler.printMoviesCountByGenres(moviesByGenres);

        System.out.println("\nForth task. Boxes of things.");
        List<Box> boxes = Box.getBoxes();
        System.out.println("\nList of boxes with things:");
        System.out.println(boxes);
        System.out.println("\nList of protectors with fragile things:");
        ListHandler.printProtectors(boxes);
    }
}