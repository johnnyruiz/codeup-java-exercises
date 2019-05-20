package shapes;

import util.Input;

public class CircleTest {

    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(5.0);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
