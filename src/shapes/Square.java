package shapes;

public class Square extends Rectangle{
    public long side;

    public Square(long side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public long getArea(){
        System.out.println("The area of a Square is: ");
        return side * side;
    }
    @Override
    public long getPerimeter(){
        System.out.println("The Perimeter of a square is: ");
        return 4 * side;
    }
}
