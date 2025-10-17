// Q8. Write a java program to find the sum of all odd numbers between 1 to n.


import java.util.*;
public class OddNumberSum{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= n){
            if(i %2 != 0){
                sum += i;
            }
            i++;
        }
        System.out.println("Sum Of Odd Number of 1 to " + n + " is: " + sum);
    }
}