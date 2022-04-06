package _04_access_modifier_static_method_static_property.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    public Circle(){

    }

    public Circle(double r) {
       this.radius = r;
    }


    protected double getRadius( ) {
        return radius;
    }


    protected double getArea(){
        return radius * radius * Math.PI;
    }
}
