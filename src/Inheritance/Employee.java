package Inheritance;

public class Employee extends Person{

    private double salary;

    public Employee(String name){
        super(name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void doWork(){
        System.out.println("Working...");
    }
}
