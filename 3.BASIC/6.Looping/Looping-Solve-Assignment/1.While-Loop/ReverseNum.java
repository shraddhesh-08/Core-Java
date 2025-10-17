// Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;
public class ReverseNum{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter The number.");
        int n = sc.nextInt();
        
        System.out.println("Natural numbers from 1 to " + n + " are.");

        while (n >= 1){         // condition
            System.out.println(n+ " ");
            n--;        // decrement by 1
        }
    }
}