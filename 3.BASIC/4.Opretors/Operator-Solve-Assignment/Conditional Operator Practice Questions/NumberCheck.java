// 4. Write a Java program to check whether a number is positive , negative or zero.

import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check number using ternary operator
        String result = (num > 0) ? "Positive" :
                        (num < 0) ? "Negative" :
                        "Zero";

        System.out.println("The number is " + result);
    }
}
