// Write a java program to enter two angles of a triangle and find the third angle.

import java.util.*;

public class ThirdAngleOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two angles
        System.out.print("Enter first angle of the triangle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter second angle of the triangle: ");
        int angle2 = sc.nextInt();

        // Calculate third angle
        int angle3 = 180 - (angle1 + angle2);

        // Display result
        System.out.println("The third angle of the triangle is: " + angle3);
    }
}

