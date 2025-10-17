//  Write a program to find first and last digit of a number without using loop in three digit.

import java.util.*;
public class FirstLastDigit {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3-Digit.");
        int no = sc.nextInt();

        // using operators
        
        int fstno = no / 100;    // 1st digit
        int lastno = no % 10;    // 3ed digit 

        System.out.println("Firstst digit --> " +fstno);
        System.out.println("lastst digit --> " +lastno);
    }
}