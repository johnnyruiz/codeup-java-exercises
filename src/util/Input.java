package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    //would be useful for user choosing attack in java project
    public String getString(String msg) {
        System.out.println(msg);
        return scanner.nextLine().trim().toLowerCase();
    }

    public String getString() {
        return getString("Write something: ");
    }

    public boolean yesNo() {
        String input = getString("Type yes/no");
        return input.equals("yes") || input.equals("y");
    }

    public int getInt(int min, int max) {
        int num = getInt();

        if (num < min || num > max) {
            System.out.println("Error outside of the boundaries");
            return getInt(max, min);
        }
        return num;
    }

    public int getInt() {
        return Integer.parseInt((getString("Enter a number: ")));
    }

    public double getDouble() {
        return Double.parseDouble(getString("Give me a decimal!"));
    }

    public double getDouble(double min, double max) {
        double num = getDouble();
        if (num < min || num > max) {
            System.out.println("Error outside of the boundaries");
            return getDouble(min, max);
        }
        return num;
    }
}

