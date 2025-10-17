// Q6. Write a java program to find the sum of all natural numbers between 1 to n

import java.util.*;
public class SumNatural{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        
        int i = 1;
        int sum = 0;

        while (i <= n){
            sum += i;   // add i to sum
            i++;
        }
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
    }
}