
//Q2. Write a Java program to check whether a triangle is valid or not.

import java.util.*;

class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input three sides
        System.out.print("Enter first side: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second side: ");
        int b = sc.nextInt();
        
        System.out.print("Enter third side: ");
        int c = sc.nextInt();
        
        // Check validity
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println(" The triangle is valid");
        } else {
            System.out.println("The triangle is not valid");
        }
    }
}

