package Inheritance;

import java.util.concurrent.TimeUnit;

public class InheritanceTest {
    public int d;

    public static void main(String[] args) {
        Person ana = new Person("Ana");
        Employee fer = new Employee("Fer");
        ana.sayHello();
        fer.setSalary(90000.55);
        fer.sayHello();
        System.out.println("$" + fer.getSalary());
        fer.doWork();
        hi();
        int x = 5 * 4 % 3;
        System.out.println(x);
    }

    public static void hi() {
        System.out.println("hi");
    }
}
