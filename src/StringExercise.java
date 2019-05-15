import java.util.Scanner;
public class StringExercise {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                {
                        String education = ("We don't need no education We dont need no thought control");
                        String newEducation = (education.substring(0, 26) + "\n" + education.substring(27, 58));
                        System.out.println(newEducation);
                }
                System.out.println(" ");
                {
                        String message = "Check \"this\" out!, \"s inside of \"s ";
                        System.out.println(message);
                }
                System.out.println(" ");
                {
                        String message = "In windows, the main drive usually C:\\";
                        System.out.println(message);
                }
                System.out.println(" ");
                {
                        String backslash = "\\";
                        String message = "I can do backslashes " + backslash + ", double backslashers " + backslash + backslash + ", and the amazing triple backslash" + backslash + backslash + backslash + "!";
                        System.out.println(message);
                }
        }
}
