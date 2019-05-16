import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //Asks the user if they would like to play the game
            System.out.println("Would you like to play a guessing game?");
            String reply = sc.next();
                //difficulty feature
            if (reply.equalsIgnoreCase("yes")) {
                System.out.println("Select your difficulty level");
                System.out.println("input \"Easy\", \"Normal\", or \"Hard\"");
                String difficulty = sc.next();
                //Easy difficulty
                if (difficulty.equalsIgnoreCase("easy")) {
                    System.out.println("A random number has been generated for you");
                    System.out.println("The number is between 1-100");
                    System.out.println("Guess the number to WIN!");
                    int randomNumber = randomNumber();
                    int userGuess;
                    do {
                        userGuess = guess();
                        game(userGuess, randomNumber);
                    } while (randomNumber != userGuess);
                    //Normal difficulty
                } else if (difficulty.equalsIgnoreCase("normal")) {
                    System.out.println("A random number has been generated for you");
                    System.out.println("The number is between 1-100");
                    System.out.println("Guess the number to WIN!");
                    System.out.println("You have 5 guesses");
                    int randomNumber = randomNumber();
                    int userGuess;
                    for (int i = 1; i <= 5; i += 1) {
                        userGuess = guess();
                        game(userGuess, randomNumber);
                        if (randomNumber == userGuess) {
                            break;
                        } else if (i >= 5) {
                            System.out.println("The number was : " + randomNumber);
                            System.out.println("You lose Try Again?");
                        }
                    }
                    //Hard difficulty
                } else if (difficulty.equalsIgnoreCase("hard")) {
                    System.out.println("A random number has been generated for you");
                    System.out.println("The number is between 1-100");
                    System.out.println("Guess the number to WIN!");
                    System.out.println("You have 3 guesses");
                    int randomNumber = randomNumber();
                    int userGuess;
                    for (int i = 1; i <= 3; i += 1) {
                        userGuess = guess();
                        game(userGuess, randomNumber);
                        if (randomNumber == userGuess) {
                            break;
                        } else if (i >= 3) {
                            System.out.println("The number was : " + randomNumber);
                            System.out.println("You Lose Try Again?");
                        }
                    }
                }
            }
    }

    //runs the user guess against the random number.
    public static void game(int userGuess, int randomNumber){
        if(userGuess == randomNumber){
            System.out.println("YOU WIN! GREAT GUESS!");
        } else if(userGuess > randomNumber){
            System.out.println("LOWER!");
        } else{
            System.out.println("HIGHER!");
        }
    }
    //generates a random number 1-100
    public static int randomNumber() {
        Random rand = new Random();
        int num = rand.nextInt(100);
        return num;
    }
    //prompts the user to pick a number 1-100
    public static int guess() {
        int userGuess = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        userGuess = sc.nextInt();
        return userGuess;
    }
}


