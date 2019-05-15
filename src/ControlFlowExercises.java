import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
     /*   int i = 5;
        while (i<=15){
            System.out.println(i);
            i++;
        }*/
        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
      /*  int j = 0;
        do{
            System.out.println(j);
            j +=2;
        }while(j<= 100);*/

        for (int j = 0; j <= 100; j += 2) {
            System.out.println(j);
        }

        {
            int x = 100;
            do {
                System.out.println(x);
                x -= 5;
            } while (x >= -10);
        }

       /* long k = 2;
        do{
            System.out.println(k);
            k *= k;
        } while (k <= 1000000);*/
        for (long k = 2; k <= 1000000; k *= k) {
            System.out.println(k);
        }


        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz!");
            } else if (i % 5 == 0) {
                System.out.println("Buzz!");
            } else if (i % 3 == 0) {
                System.out.println("Fizz!");
            } else {
                System.out.println(i);
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("what number would you like to go to?");
        int stop = sc.nextInt();
        System.out.println("Do you want to continue?");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("yes")) {
            String numTable = "number  | squared| cubed \n------- | ------ | ------";
            System.out.println("here is your table: \n");
            System.out.printf(numTable + "%n");
            for (int i = 1; i <= stop; i++) {
                double square = Math.pow(i, 2);
                double cube = Math.pow(i, 3);
                if (i < 10) {
                    System.out.printf("%d\t\t|%.0f\t\t |%.0f%n", i, square, cube);
                } else {
                    System.out.printf("%d\t\t|%.0f\t |%.0f%n", i, square, cube);
                }
            }
        } else {
            System.out.println("Have a good day!");
        }

        boolean moreGrades = true;

        do {
            System.out.println("Enter a grade and receive your letter grade!");
            int grade = sc.nextInt();
            System.out.println("Do you want to see your letter grade?");
            String Uanswer = sc.next();
            if (Uanswer.equalsIgnoreCase("yes")) {
                if (grade < 60) {
                    System.out.printf("Your grade is %d, you got an F%n", grade);
                } else if ((grade >= 95) && (grade < 100)) {
                    System.out.printf("Your grade is %d, you got an A+%n", grade);
                } else if ((grade >= 90) && (grade < 94)) {
                    System.out.printf("Your grade is %d, you got an A%n", grade);
                } else if ((grade >= 85) && (grade < 89)) {
                    System.out.printf("Your grade is %d, you got an B+%n", grade);
                } else if ((grade >= 80) && (grade < 84)) {
                    System.out.printf("Your grade is %d, you got a B%n", grade);
                } else if ((grade >= 75) && (grade < 79)) {
                    System.out.printf("Your grade is %d, you got a C+%n", grade);
                } else if ((grade >= 70) && (grade < 74)) {
                    System.out.printf("Your grade is %d, you got an C%n", grade);
                } else if ((grade >= 60) && (grade < 70)) {
                    System.out.printf("Your grade is %d, you got a D%n", grade);
                } else {
                    System.out.println("Does not compute");
                }
                System.out.println("Would you like to input another grade? yes/no");
                String respond = sc.next();
                if (!respond.equals("yes")) {
                    moreGrades = false;
                }
            } else {
                System.out.println("Have a good day!");
            }
        }
            while (moreGrades) ;
            System.out.println("End");
        }
    }


