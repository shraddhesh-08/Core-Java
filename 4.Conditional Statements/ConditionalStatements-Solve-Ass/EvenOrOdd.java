//Q1. Write a Java program to check whether a number is even or odd.

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter a number: ");
        int num = sc.nextInt();               //input

        if (num % 2 == 0) {             
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }
}
