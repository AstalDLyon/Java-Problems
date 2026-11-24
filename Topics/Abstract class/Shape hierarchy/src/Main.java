abstract class Shape {
    protected double perimeter;
    protected double area;

    public abstract double getPerimeter();

    public abstract double getArea();
}

class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double semiperimeter;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public double getArea() {
        semiperimeter = (a + b + c) / 2;
        this.area = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
        return area;
    }
}

class Circle extends Shape{
    private double radius;


    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea(){
        this.area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}

class Rectangle extends Shape{
    private double a;
    private double b;

    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea(){
        this.area = a * b;
        return area;
    }
    public double getPerimeter(){
        this.perimeter = 2 * ( a + b);
        return perimeter;
    }
}