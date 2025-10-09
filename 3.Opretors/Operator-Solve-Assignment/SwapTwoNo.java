// Write a java program swap two number using third variable.

import java.util.*;
public class SwapTwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //user input
        System.out.println("Enter the 1st Number :- ");
        int no1 = sc.nextInt(); 

        System.out.println("Enter the 1st Number :- ");
        int no2 = sc.nextInt(); 

        System.out.println("-After Swapping-" );
        System.out.println("No1 -> "+ no1 + ",No2 -> "+no2);

        int temp = no1;
        no1 = no2;
        no2 =  temp;

        System.out.println("-Before Swapping-");
        System.out.println("No1 -> "+ no1 + ",No2 -> "+no2);
    }
}
