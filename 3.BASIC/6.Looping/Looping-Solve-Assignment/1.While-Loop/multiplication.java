// Q9. Write a java program to print a multiplication table of any number.

import java.util.*;
public class multiplication{
    public static void main(String x []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n = sc.nextInt();

        int i = 1;

        while (i <=10){
           int mul = n * i;
           System.out.println(n + " x " + i + " = " + mul);
            i++;
        }
        
    }
}