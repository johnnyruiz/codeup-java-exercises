package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileTest {
    public static void main(String[] args) {
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
            List<String> namesFromFile = Files.readAllLines(file);
            for(String name : namesFromFile) {
                System.out.println("Name :" + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.write(file, Arrays.asList("Ryan"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
