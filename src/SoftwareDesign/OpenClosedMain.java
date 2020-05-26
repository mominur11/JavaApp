package SoftwareDesign;

public class OpenClosedMain {

    public static void main(String[] args){
        AreCalculators cal = new AreCalculators();
        cal.calculate(new Rectangles(210,10));
        cal.calculate(new Triangles(10,5));
        cal.calculate(new Circles(10));
    }
}

abstract class Shape{
    abstract public void calculateArea();
}

class Rectangles extends Shape{
    double height;
    double width;

    public Rectangles(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println(height * width);
    }
}


class Circles extends Shape{
    double radius;

    public Circles(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(3.14 * radius *radius);
    }
}

class Triangles extends Shape{
    double base;
    double height;

    public Triangles(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println(0.5 * base * height);
    }
}


class AreCalculators{
   public void calculate(Shape shape){
       shape.calculateArea();
    }
}
