// Write a Java program to convert days to years, month and week.

import java.util.Scanner;

class DaysConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total days: ");
        int totalDays = sc.nextInt();

        // Calculate years
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        // Calculate months
        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        // Calculate weeks
        int weeks = remainingDays / 7;
        remainingDays = remainingDays % 7;

        // Output the results
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks: " + weeks);
        System.out.println("Remaining Days: " + remainingDays);
    }
}

