import java.util.Scanner;

public class util {

    private Scanner scanner = new Scanner(System.in);

    //would be useful for user choosing attack in java project
    public String getString(String msg){
        System.out.println(msg);
        return scanner.nextLine().trim().toLowerCase();
    }
    public String getString(){
        return getString("Write something: ");
    }

    public boolean yesNo(){
        getString("Type yes/no");
        return (getString().equals("yes"));
    }

    public int getInt(){
        return Integer.parseInt((getString("Give me a number: ")));
    }

    public int getInt(int max, int min){
        int num = getInt();

        if(num < min || num > max){
            return getInt();
        }
        return num;
    }

}
