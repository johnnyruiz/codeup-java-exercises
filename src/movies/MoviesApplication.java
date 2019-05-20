package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
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
                System.out.println(Arrays.toString(MoviesArray.findAll()));
            } else if (userResponse == 2) {
                System.out.println("View Movies in the animated category");
            } else if (userResponse == 3) {
                System.out.println("View movies in the drama category");
            } else if (userResponse == 4) {
                System.out.println("View movies in the horror category");
            } else if (userResponse == 5) {
                System.out.println("View movies in the scifi category");
            } else {
                System.out.println("Error invalid number entered");
            }
    }
}
