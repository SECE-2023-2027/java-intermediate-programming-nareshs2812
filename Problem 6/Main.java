import java.util.Scanner;

class AreaCalculator{

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double rectangleArea = AreaCalculator.calculateArea(length, width);
        double circleArea = AreaCalculator.calculateArea(radius);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Circle Area: " + circleArea);
    }
}
