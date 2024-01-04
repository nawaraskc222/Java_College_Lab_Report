package Lab1;


/////question 1

import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Triangle {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double rectLength = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double rectWidth = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(rectLength, rectWidth);

        System.out.println("Enter the base of the triangle:");
        double triBase = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double triHeight = scanner.nextDouble();

        Triangle triangle = new Triangle(triBase, triHeight);

        double rectArea = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + rectArea);

        double triArea = triangle.calculateArea();
        System.out.println("Area of the triangle: " + triArea);

        scanner.close();
    }
}
