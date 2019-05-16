import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static void main(String[] args) {
//        sayHello();
//        sayHello("Johnny");
//        sayHello(6);
//        format(getTotal(10, 20), "US");
//        format(getTotal(10, 20), "DE");
//        countDown(9);
//        addition(1, 2);
//        subtraction(1, 2);
//        multiplication(1, 2);
//        division(2, 1);
//        modulus(1, 2);
//        System.out.println(longMultiplication(5, 9));
//        System.out.println(getInteger(5, 10));
//        factorial();
        rollDice();
    }

    public static void rollDice() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of side of each die");
        int diceSides = sc.nextInt();
        System.out.println("enter roll when your ready to roll the dice");
        String response = sc.next();
        int di1 = rand.nextInt(diceSides + 1);
        int di2 = rand.nextInt(diceSides + 1);
        if (response.equalsIgnoreCase("roll")){
            System.out.println("The first di landed on : " + di1);
            System.out.println("The second di landed on: " + di2);
        }
        System.out.println("Would you like to roll again?");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("yes")){
            rollDice();
        } else{
            System.out.println("Bye!");
        }
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        int userNum = getInteger(1, 20);
        System.out.println("Would you like to know the factorial of " + userNum + "?");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("yes")){
            long fact = 1;
            for (int i = 1; i <= userNum; i += 1){
                fact = fact * i;
            }
            System.out.println("The factorial of " + userNum + " is: " + fact);
            factorial();
        }
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min +  " and " + max + ": ");
        int userInput = sc.nextInt();
        if((userInput <= max) & (userInput >= min)){
            System.out.println("Thank you for following directions");
            return userInput;
        }else{
            System.out.println("Try again");
            return getInteger(min, max);
        }
    }

    public static int longMultiplication(int a, int b) {
        int sum = 0;
        for (int i = 0; i < a; i++){
            sum += b;
        }
        return  sum;
    }

    public static void addition(int a, int b) {
        int total = 0;
        total = a + b;
        System.out.println(total);
    }
    public static void subtraction(int a, int b) {
        int total = 0;
        total = a - b;
        System.out.println(total);
    }
    public static void multiplication(int a, int b) {
        int total = 0;
        total = a * b;
        System.out.println(total);
    }
    public static void division(int a, int b) {
        int total = 0;
        total = a / b;
        System.out.println(total);
    }
    public static void modulus(int a, int b) {
        int total = 0;
        total = a % b;
        System.out.println(total);
    }

    public static double getTotal(int x, int y) {
        int total = 0;
        total = x + y;
        return total * 1.08;
    }

    public static void countDown(int n) {
        if(n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        countDown(n -1);
    }

    public static void format(double total) {
        System.out.println("$" + Math.round(total) + "." + "00");
    }
    public static void format(double total, String countryCode) {
        String coin = (countryCode.equals("US")) ? "$" : "£";
        System.out.println(coin + Math.round(total) + "." + "00");
    }

    public static void sayHello(){
        System.out.println("\"Hello!\" = Hello!");
    }

    public static void sayHello(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void sayHello(int num){
        int i = 0;
        do {
            if(i == 0) {
                System.out.println("Hello, " + (i + 1) + " time");
            } else{
                System.out.println("Hello, " + (i + 1) + " times");
            } i += 1;
        } while (i < num);
    }
}
