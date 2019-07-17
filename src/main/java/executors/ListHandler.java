package main.java.executors;

import main.java.enums.MovieGenre;
import main.java.enums.Teams;
import main.java.objects.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListHandler {
    public static Map<Teams, String> getSpesialUsersTeams(List<User> users) {
        return users.stream()
                .filter(user -> user.getLoginDate()
                        .isAfter(LocalDate.now().minusDays(8)))
                .collect(Collectors.toMap
                        (User::getTeam, User::getEmail, (t, u) -> t.concat(", ").concat(u)));
    }

    public static Map<MovieGenre, List<Movie>> getMoviesByGenre(List<List<Movie>> movieList) {
        return movieList.stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Movie::getGenre));
    }

    public static void printAverageTicketPriceByGenres(Map<MovieGenre, List<Movie>> moviesByGenre) {
        moviesByGenre.forEach((key, value) -> System.out.println("The average price of tickets for "
                + key + " genre is " + value.stream()
                .map(Movie::getPrice)
                .reduce(Double::sum).orElse(1.0) / value.size()));
    }

    public static void printMoviesCountByGenres(Map<MovieGenre, List<Movie>> moviesByGenre) {
        moviesByGenre.forEach((key, value) -> System.out.println("There are " + value.size()
                + " movies of " + key + " genre in the cinema"));
    }

    public static void printProtectors(List<Box> boxes) {
        List<Protector> protectors = boxes.stream()
                .flatMap(box -> box.getThings().stream())
                .filter(Thing::isFragile)
                .map(Protector::new)
                .collect(Collectors.toList());
        System.out.println(protectors);
    }
}
