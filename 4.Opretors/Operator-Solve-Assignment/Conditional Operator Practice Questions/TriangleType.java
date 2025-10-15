// 3. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 

import java.util.*;
public class TriangleType {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The 1st Angle.");
        int a = sc.nextInt();

        System.out.println("Enter The 2ed Angle.");
        int b = sc.nextInt();

        System.out.println("Enter The 3ed Angle.");
        int c = sc.nextInt();

         // Check triangle type using ternary operators
        String res = (a == b && a == c) ? " Equilateral Triangle" :
                     (a == b || b == c || a == c) ? " Isoscale Triangle" :
                     " Scalene Triangle" ;

        System.out.println(res);
    }
}