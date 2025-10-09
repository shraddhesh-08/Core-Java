//Write a java program to calculate area of an equilateral triangle.

import java.util.*;

class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the equilateral triangle :- ");
        double side = sc.nextDouble();

        // area = (√3 / 4) * side * side
        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.println("Area of Equilateral Triangle :--> " + area);
    }
}

