import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to talk to Bob?");
        String userResponse = sc.next();
        if (userResponse.equalsIgnoreCase("yes")) {
            System.out.println("ask Bob a question");
            String userInput;
                do {
                    userInput = sc.next();
                    if (userInput.endsWith("!")) {
                        System.out.println("Whoa, chill out!");
                    } else if (userInput.endsWith("?")) {
                        System.out.println("Sure.");
                    } else if (userInput.equals(" ")) {
                        System.out.println("Fine. Be that way!");
                    } else {
                        System.out.println("Whatever");
                    }
                }while (userInput.equals("you're grounded!"));
            }
        }
    }

