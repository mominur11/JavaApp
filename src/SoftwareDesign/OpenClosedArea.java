package SoftwareDesign;

public class OpenClosedArea {

    public static void main(String[] args){
        AreCalculator cal = new AreCalculator(new Rectangle(210,10));
        AreCalculator ca2 = new AreCalculator(new Circle(10));

       cal.calculate();
       ca2.calculate();
    }
}

class Rectangle{
    double height;
    double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
}
class Circle{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
}

class Triangle{
    double base;
    double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
}


class AreCalculator{
    Object shape;

    public AreCalculator(Object shape){
        this.shape = shape;
    }

    public void calculate() {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            System.out.println(r.height * r.width);
        }
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            System.out.println(3.14 * c.radius *c.radius);
        }
        if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            System.out.println(0.5 * t.base * t.height);
        }
    }
}
