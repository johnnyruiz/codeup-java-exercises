package shapes;

public class Triangle extends Shape {

    private int side1;
    private int side2;
    private int side3;


    public double getArea() {
        //here we would actually calculate area based on sides
        return 0;
    }

    public double getPerimeter() {
        return (double) side1 + side2 + side3;
    }

}
