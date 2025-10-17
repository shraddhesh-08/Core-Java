// 2. Write a Java program to check whether a triangle is valid or not.

import java.util.*;
public class validTriangle{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The 1st Angle.");
        int a = sc.nextInt();

        System.out.println("Enter The 2ed Angle.");
        int b = sc.nextInt();

        System.out.println("Enter The 3ed Angle.");
        int c = sc.nextInt();

        
        String res = (a+b > c && b+c > a && c+a > b) ? " Triangle is Valid." : " Triangle is Not valid.";

        System.out.println(res);
    }
}