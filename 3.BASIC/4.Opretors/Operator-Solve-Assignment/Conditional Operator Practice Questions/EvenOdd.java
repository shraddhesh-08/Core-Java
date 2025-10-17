// 1. Write a Java program to check whether a number is even or odd. 

import java.util.*;
public class EvenOdd {
    public static void main (String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No.");
        int no = sc.nextInt();

        // Conditional Operator
        String res = no % 2 != 0  ? (no + " is Even number.."): (no + " is Odd number..");

        System.out.println(res);
    }
}
