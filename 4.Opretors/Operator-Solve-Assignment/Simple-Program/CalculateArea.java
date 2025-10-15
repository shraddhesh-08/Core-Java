//. Write a java program to calculate area of an equilateral triangle.

import java.util.*;
public class CalculateArea {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);

        //user input
        System.out.println("Enter The Side OF A Side Of The Equilateral Triangle");
        double side = sc.nextDouble();

        // Formula
        double area = (Math.sqrt(3)/4)*side*side;

        // output
        System.out.println(" area of the equilateral triangle. is ----> " + area);
    }
}
