import java.util.Scanner;

public class HelloWorld {

    /**
     * This is a multi-line comment
     * that
     * takes up
     * multiple lines
     */

    public static void main(String[] args) {
        //this is a single line comment
        /*this is a block comment */
        {
            System.out.print("Hello");
            System.out.print(", World!");
        }
        //spacer tab below
        System.out.println("\t");
        {
            int myFavoriteNumber;
            String myString;

            myFavoriteNumber = 25;
            myString = "My favorite number is: ";
            System.out.print(myString);
            System.out.print(myFavoriteNumber);
        }
        //spacer tab below
        System.out.println("\t");

        {
            long myNumber = 123;
            System.out.print(myNumber);
        }
        //spacer tab below
        System.out.println("\t");
        {
            //post increment
            //x++ prints the original value first the increments the variable
            int x = 5;
            System.out.println(x++);
            System.out.println(x);
            //returns
            //5
            //6
        }
        {
            //pre increment
            //++x increments the value first then prints out it's value
            int x = 5;
            System.out.println(++x);
            System.out.println(x);
            //returns
            //6
            //6
        }


            //Note: you can not use 'class' as a variable name
            //String class = "This string";
            //other examples of reserved words :

            // abstract, continue, for, new, switch, assert, default,
            // goto, package, synchronized, boolean, do, if, private,
            // this, break, double, implements, protected, throw, byte,
            // else, import, public, throws, case, enum, instanceof,
            // return, transient, catch, extends, int, short, try, char,
            // final, interface, static, void, class, finally, long,
            // strictfp, volatile, const, float, native, super, while,




            //String type variables can not be converted this way
            //  int three = (int) "three";
            //  System.out.println(three);


        {
            int x = 4;
            x += 5;
            System.out.println(x);
            // output
            //9
        }
        {
            int x = 3;
            int y = 4;
            System.out.println(x + y);
            // output
            // 7
        }
        {
            int x = 10;
            int y = 2;
            System.out.println(x / y);
            System.out.println(y - x);
            // output
            //
        }
        {
            //when setting the value of a variable
            //to larger or smaller than it's type can
            //hold you will get back an error
            //*incompatible types

            //byte toHigh = 130;
            //System.out.println(toHigh);
        }
        {
            //when you increment a variable that is larger than
            //it's type can hold it will go back to the lowest value
            //it can hold and increase from there
            byte thisValue = 126;
            thisValue += 2;
            System.out.println(thisValue);
            //byte -128 to 127
            //output
            //-128
            //MAX_VALUE and MIN_VALUE can be used as a reference of the
            //highest and lowest value that can be assigned to a type
            System.out.println(Byte.MAX_VALUE);
            System.out.println(Byte.MIN_VALUE);
        }
        {
            String name = "codeup";
            System.out.format("Hello there, %s. Nice to see you. \n", name);
            //output
            // Hello there, codeup. Nice to see you.
        }
        {
            String greeting = "Salutations";
            String name = "codeup";
            System.out.format("%s, %s!", greeting, name);
            //output
            //Salutations, codeup!
        }
        //spacer tab below
        System.out.println("\t");
        {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter something: ");
            //below will only grab the first item the user enters
            //String userInput = scanner.next();
            //Will grab the whole input
            //String userInput = scanner.nextLine();
            // Will grab the integer the user inputs
            int userInput = scanner.nextInt();

            System.out.println("You entered: --> \"" + userInput + "\" <--");
        }
    }
}

///////////////////////////////////////////////////////////////////
/////////////////////////Reference////////////////////////////////
/////////////////////////////////////////////////////////////////

// psvm tab pronts out main method
// sopt tab is System.out.println

        //<-----DATA TYPES----->//

    //There are two main categories of types in Java: PRIMITIVE and REFERENCE.
    // Primitive types are the "building blocks" of the language; any variable
    // that holds a primitive type has a value. Reference types are those that
    // refer to objects or arrays; they default to the special value null, which
    // indicates a lack of an object. We will see this come into play more when
    // we talk about passing values to methods, and when we discuss objects in
    // more detail

//  byte	1	Very short integers from -128 to 127
//  short   2	Short integers from -32,768 to 32,767
//  int	    4	Integers from -2,147,483,648 to 2,147,483,647
//  long	8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//  float	4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
//  double	8	Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
//  char	2	A single Unicode character that’s stored in two bytes
//  boolean	1	A true or false value