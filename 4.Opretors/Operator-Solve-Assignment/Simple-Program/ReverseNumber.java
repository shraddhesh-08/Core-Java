// Write a Java program to reverse a number without using loop.

import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3-digit number:");
        int no = sc.nextInt();

        
        int fstNo = no / 100;           // first digit
        int sedNo = (no / 10) % 10;     // second digit
        int lstNo = no % 10;            // last digit

        // Reverse number using operators
        int rev = lstNo * 100 + sedNo * 10 + fstNo;

        System.out.println("Reverse Number --> " + rev);
    }
}

