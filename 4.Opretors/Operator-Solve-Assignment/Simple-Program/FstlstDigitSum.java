// Write a program to calculate sum of first and last digit of a number without using loop.

import java.util.*;
public class FstlstDigitSum{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3-Digit.");
        int no = sc.nextInt();

        int fstno = no /100;    //1st digit 
        int lastno = no % 10;   //3ed digit

        // Calculate sum
        int sum = fstno + lastno;

        System.out.println("Sum of first and last digit  -> " +sum);
    }
}