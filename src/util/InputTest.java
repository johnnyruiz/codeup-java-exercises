package util;


public class InputTest {
    public static void main(String[] args) {
          Input input = new Input();

        System.err.println(input.getInt(1, 10));
        System.err.println(input.getDouble(10, 20));
        System.err.println(input.getString("What's your name?"));
        System.err.println(input.yesNo());
    }
}
