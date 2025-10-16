// Q4. Write a Java program to check whether a number is positive , negative or zero.

import java.util.*;
public class CheckNumber{
    public static void main(String x[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter The Number.");
        int  no = sc.nextInt();

    // Check if number is Positive, Negative or Zero 
        if (no>0){
            System.out.println("Positive number");
        }
        else if (no<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero number");
        }
    }
}