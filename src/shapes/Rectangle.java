package shapes;

public class Rectangle {
    protected long length;
    protected long width;

    public Rectangle(long length, long width) {
        this.length = length;
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getArea(){
        System.out.println("The area of the rectangle is: ");
        return this.length * this.width;
    }
    public long getPerimeter(){
        System.out.println("The perimeter of the rectangle is: ");
        return 2 * this.length + 2 * this.width;
    }
}
