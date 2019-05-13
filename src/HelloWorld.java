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
        System.out.print("Hello");
        System.out.print(", World!");
    }
}

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