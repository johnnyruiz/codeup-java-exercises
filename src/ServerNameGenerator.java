import java.util.Random;
public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"Marvellous", "Awesome", "Fantastic", "Epic", "Wild", "Speedy", "Rapid", "Clever",
                "Wise", "Massive"};
        String[] nouns = {"Dragon", "Shadow", "Void", "Vortex", "Flame","Atomic", "Chrome", "Light", "Wing", "Crypt"};

        Random ran = new Random();
        int randomAdjective = ran.nextInt(adjectives.length);
        int randomNoun = ran.nextInt(adjectives.length);
        System.out.println("Here is your server name: \n" + adjectives[randomAdjective] + " " + nouns[randomNoun]);
    }
}
