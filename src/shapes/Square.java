package shapes;

public class Square extends Quadrilateral{

//    public double side;

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double length() {
        return this.length;
    }

    @Override
    public double width() {
        return this.width;
    }

    @Override
    public double getArea() {
        System.out.println("The Area of the square is: ");
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("The perimeter of the square is: ");
        return this.length * 4;
    }

}
