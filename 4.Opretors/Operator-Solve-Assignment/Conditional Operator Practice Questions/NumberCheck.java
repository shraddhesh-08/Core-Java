// 4. Write a Java program to check whether a number is positive , negative or zero.

import java.util.*;
public class NumberCheck {
    public static void main(String x []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number.");
        int no = sc.nextInt();

        String res = no < 0 ? "Negative Number." :
                     no > 0 ? "Positive Number." :
                     "Zero Number" ;

    System.out.println(res);
    }
}