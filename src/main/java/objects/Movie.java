package main.java.objects;

import main.java.enums.MovieGenre;

public class Movie {
    private String name;
    private MovieGenre genre;
    private double price;

    public Movie(String name, MovieGenre genre, double price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nMovie{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                '}';
    }
}
