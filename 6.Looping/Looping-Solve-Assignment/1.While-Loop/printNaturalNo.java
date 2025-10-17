// Q1. Write a java program to print all natural numbers from 1 to n. using while loop.

import java.util.*;
public class printNaturalNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();  
        
        int i = 1;  // initialization
        
        System.out.println("Natural numbers from 1 to " + n + " are:");
        
        while(i <= n) {  // condition
            System.out.print(i + " ");  
            i++;  // increment
        }
    }
}
