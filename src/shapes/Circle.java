package shapes;

public class Circle {

    private double radius;

    public Circle(Double rad){
        this.radius = rad;
    }

    public double getArea(){
        System.out.println("The area of the circle is: ");
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        System.out.println("The circumference of the circle is: ");
        return 2 * Math.PI * radius;
    }

}
