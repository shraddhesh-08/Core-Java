/* Write a java program to enter radius of a circle and find its diameter,area and circumference.
        Formula :-
            diameter=2 * radius;
            circumference = 2 * 3.14 * radius;
            area = 3.14 * radius * radius;
*/ 

import java.util.*;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        // Calculate diameter, circumference and area
        double diameter = 2 * radius;
        double circumference = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        // Display results
        System.out.println("Diameter of Circle = " + diameter);
        System.out.println("Circumference of Circle = " + circumference);
        System.out.println("Area of Circle = " + area);

    }
}
