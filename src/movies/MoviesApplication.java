package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {

        Movie[] movies = MoviesArray.findAll();

        System.out.println("Welcome to my Movie Application");
        System.out.println(".___  ___.   ______   ____    ____  __   _______     _______.\n" +
                "|   \\/   |  /  __  \\  \\   \\  /   / |  | |   ____|   /       |\n" +
                "|  \\  /  | |  |  |  |  \\   \\/   /  |  | |  |__     |   (----`\n" +
                "|  |\\/|  | |  |  |  |   \\      /   |  | |   __|     \\   \\    \n" +
                "|  |  |  | |  `--'  |    \\    /    |  | |  |____.----)   |   \n" +
                "|__|  |__|  \\______/      \\__/     |__| |_______|_______/    \n" +
                "                                                             ");
        System.out.println();
        Input input = new Input();
        System.out.println("What would you like to do?");
        System.out.println("0 - exit \n1 - view all movies \n2 - view movies in the animated category \n3 - view " +
                "movies in the drama category \n4 - view moview in the horror category \n5 - view movies in the scifi" +
                " category");

            int userResponse = input.getInt(-1, 6);
                if (userResponse == 0) {
                    System.out.println("Goodbye");
                } else if (userResponse == 1) {
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + "- -" + movie.getCategory());
                    }
                } else if (userResponse == 2) {
                    System.out.println("---Movies in the animated category---");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + "- -" + movie.getCategory());
                        }
                    }
                } else if (userResponse == 3) {
                    System.out.println("---Movies in the drama category---");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + "- -" + movie.getCategory());
                        }
                    }
                } else if (userResponse == 4) {
                    System.out.println("---Movies in the horror category---");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + "- -" + movie.getCategory());
                        }
                    }
                } else if (userResponse == 5) {
                    System.out.println("----Movies in the scifi category---");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + "- -" + movie.getCategory());
                        }
                    }
                } else {
                    System.out.println("Error invalid number entered");
                }
    }
}
