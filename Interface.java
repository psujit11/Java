package Assignment1;
import java.util.Scanner;

/**
 *
 * @author sujit
 */

// Define the Shape interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
// Implement the Shape interface in the Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Implement the Shape interface in the Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Demonstrate the use of the interface in a program
public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        // Get user input for the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);

        // Calculate and display the area and perimeter for Circle
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Calculate and display the area and perimeter for Rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Close the scanner
        scanner.close();
    }
}

    

