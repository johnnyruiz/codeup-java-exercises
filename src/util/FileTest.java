package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

//      _______________________________________________________
//      |                                                      |
//      |   Can be a method for formatting the phone numbers   |
//      |______________________________________________________|
//      |      phoneNum = 1234567                              |
//      |      first = phoneNum.substring(0,3);                |
//      |      second = phoneNum.substring(4,8);               |
//      |      system.out.println(first + "-" + second)        |
//      |      expected 123-4567                               |
//      |                                                      |
//      |______________________________________________________|


public class FileTest {

    public static String format(String number){
        if(number.length() == 7) {
            String first = number.substring(0, 3);
            String second = number.substring(3, 7);
            return "(" + first + ")" + "-" + second;
        } else if (number.length() == 10){
            String first = number.substring(0, 3);
            String second = number.substring(3, 6);
            String third = number.substring(6, 10);
            return "(" + first + ")" + "-" + second + "-" + third;
        }  return "Error invalid entry";
    }
    public static void main(String[] args) {

        String phone1 = "1234567";
        String phone2 = "1234567891";

        System.out.println(phone1);
        System.out.println(format(phone1));

        System.out.println(phone2);
        System.out.println(format(phone2));

        

        String directory = "data";

        Path folder = Paths.get(directory);
        Path file = Paths.get(directory, "info.txt");

        if(Files.notExists(folder)){
            try {
                Files.createDirectories(folder);
                System.out.println(folder + " directory was created.");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(Files.notExists(file)){
            try {
                Files.createFile(file);
                System.out.println(file + " file was created");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        
//        List <String> names = Arrays.asList("Fer", "Daniel", "Justin", "Sophie");
//            try{
//                Files.write(file, names);
//            } catch (IOException e){
//                e.printStackTrace();
//            }
        try {
            Files.write(file, Arrays.asList("David"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            List<String> namesFromFile = Files.readAllLines(file);
            for(String name : namesFromFile) {
                System.out.println("Name :" + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
