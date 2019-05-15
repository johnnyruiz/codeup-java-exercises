import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's up? My name is Bob");
        int i = 0;
        do {

            String userResponse = sc.next();

            if (userResponse.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userResponse.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userResponse.equalsIgnoreCase(" ")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
            i += 1;
        } while (i >= 10);
            System.out.println("I'm bored, bye!");
        }
    }
