import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        System.out.println("A random number has been generated for you");
        System.out.println("The number is between 1-100");
        System.out.println("Guess the number to WIN!");
        int randomNumber = randomNumber();
        int userGuess = guess();
        game(userGuess, randomNumber);
    }
    public static void game(int userGuess, int randomNumber){
        if(userGuess == randomNumber){
            System.out.println("YOU WIN! GREAT GUESS!");
        } else if(userGuess > randomNumber){
            System.out.println("LOWER!");
        } else{
            System.out.println("HIGHER!");
        } guess();
        game(userGuess, randomNumber);
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


