import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        //Numbers array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //String array
        String[] person = {"Jordan", "Joshua", "Jake"};
        person = addPerson(person, "Johnny");
        person = addPerson(person, "Jennifer");

        //prints the length of the array after it has been updated.
        System.out.println(person.length);

        //prints the array in array format
        System.out.println(Arrays.toString(person));

        //for loop that iterates through the array of names and prints each one.
        for (int i = 0; i < person.length; i += 1){
            System.out.println(person[i]);
        }
        //iterates through the array and prints each name.
        for(String name : person){
            System.out.println("Name: " + name);
        }
        //for each number print it's value
        for( int n : numbers){
            System.out.println(n);
        }
    }
//    public static String addName(String name){
//            return addPerson(name);
//    }
    public static String[] addPerson(String[] arr, String name){
        int currentSize = arr.length;
        int newSize = currentSize + 1;
        String[] tempArray = new String [newSize];
        for (int i = 0; i < currentSize; i += 1){
            tempArray[i] = arr[i];
        }
        tempArray[newSize - 1] = name;
        arr = tempArray;
        return arr;
    }
}


