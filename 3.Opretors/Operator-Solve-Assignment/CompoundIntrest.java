//  Write a java program to calculate the compound intrest.

import java.util.*;
public class CompoundIntrest {
    public static void main(String x[]){
        Scanner sc  = new Scanner(System.in);

        // //user input
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded per year: ");
        double n = sc.nextDouble();

        // Formula
        double amount = principal * Math.pow((1 + rate / (n * 100)), n * time);
        double compoundInterest = amount - principal;

        //result
        System.out.println("\nCompound Interest = " + compoundInterest);
        System.out.println("Total Amount = " + amount);

    }
}
