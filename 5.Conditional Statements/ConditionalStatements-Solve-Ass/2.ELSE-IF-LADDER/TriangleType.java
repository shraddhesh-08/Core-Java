//Q1. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene

import java.util.*;
public class TriangleType {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Side.");
        int a = sc.nextInt();

        System.out.println("Enter 2st Side.");
        int b = sc.nextInt();

        System.out.println("Enter 3st Side.");
        int c = sc.nextInt();

        if(a == b && a == c){
            System.out.println("Equilateral Triangle.");
        }
        else if(a == b || b == c || a == c){
            System.out.println("Isoscale Triangle.");
        }
        else{
            System.out.println("Scalene Triangle.");
        }
    }
}
