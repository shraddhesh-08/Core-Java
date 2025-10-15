// Write a java program to enter length and breadth of a rectangle and find its area.
// Formula - area= length * breadth;


import java.util.*;
public class RectangleArea {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        // Input length and breadth
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        // Calculate area
        int area = length * breadth;

        // Display result
        System.out.println("Area of Rectangle = " + area);

    }
}

