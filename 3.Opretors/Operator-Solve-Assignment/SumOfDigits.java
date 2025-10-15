// Write a Java program and compute the sum of an integer's digits.

import java.util.*;
public class SumOfDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three Digit Number");
        int num = sc.nextInt();


                //last digit   //middle digit    //first digit
        int sum = (num %10)  + ((num / 10)%10) + (num /100);

        System.out.println("Sum of Digit:--> "+sum);
    }
}