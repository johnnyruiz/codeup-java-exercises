package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Rectangle myRectangle = new Rectangle(2, 4);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());

        Square mySquare = new Square(2);
        System.out.println(mySquare.getArea());
        System.out.println(mySquare.getPerimeter());

    }
}

