//import java.util.Scanner;
import java.text.*;



public class ConsoleExercises {

    public static void customFormat(String pattern, double value) {
        {
            DecimalFormat myFormatter = new DecimalFormat(pattern);
            String output = myFormatter.format(value);
            System.out.println(value + " " + pattern + " " output);
        }
        static public void main (String[] args){
            customFormat();
            double pi = 3.14159;
            System.out.format("the value of pi is approximately: %s", pi)
        }
    }

}
