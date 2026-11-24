import java.util.Scanner;

// Define the base class Shape
class Shape {
    private String name;
    // TODO: Add a constructor that takes the shape's name as a parameter
        Shape(String name){
            this.name = name;
        }
    // TODO: Add a getter method to retrieve the shape's name

    public String getName() {
        return name;
    }
}

// Define the derived class Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;
    // TODO: Add a constructor that takes the shape's name, width, and height as parameters
        Rectangle(String name,double width, double height){
            super(name);
            this.width = width;
            this.height = height;
            }
    // TODO: Call the base class constructor using the super keyword

    // TODO: Add getter methods to retrieve the rectangle's width and height

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read the shape's name, width, and height from the user input;

        String name = scanner.nextLine();
        double test1 = scanner.nextDouble();
        double test2 = scanner.nextDouble();
        // TODO: Create a Rectangle object using the user input
            Rectangle rectangle1 = new Rectangle(name,test1,test2);
        // TODO: Print out the rectangle's name, width, and height
        System.out.printf("Name: %s\nWidth: %s\nHeight: %s", rectangle1.getName(),formatNumber(rectangle1.getWidth()), formatNumber(rectangle1.getHeight()));
        scanner.close();

    }
    private static String formatNumber(double num) {
        if (num == (long) num) {
            return String.format("%d", (long) num);
        }
        return String.valueOf(num);
    }
}