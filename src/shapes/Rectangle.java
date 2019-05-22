package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double length() {
        return length;
    }

    @Override
    public double width() {
        return width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("The perimeter of the rectangle is: ");
        return (2 *length) + (2 * width);
    }

    @Override
    public double getArea() {
        System.out.println("The area of the rectangle is: ");
        return length * width;
    }
}
