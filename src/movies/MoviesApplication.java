package movies;

import util.Input;

import java.lang.reflect.Array;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What would you like to do?");
        int userResponse = input.getInt();
        if(userResponse == 0){
            System.out.println("Goodbye");
        } else if(userResponse == 1){
            System.out.println(MoviesArray.findAll());
        }
    }
}
