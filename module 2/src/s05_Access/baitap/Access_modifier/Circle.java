package s05_Access.baitap.Access_modifier;

public class Circle {
    private double radius =1;
    private String color = "red";

    public Circle () {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public  double getRadius() {
        return radius;
    }
    public double getArea() {
        return this.radius * this.radius;
    }
}