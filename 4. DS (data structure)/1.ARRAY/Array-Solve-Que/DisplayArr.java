/*Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50
*/


import java.util.*;
public class DisplayArr{
    public static void main(String x[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size - ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("enter The Elment "+size);
         for(int i = 0; i < a.length; i++){
            a[i]=sc.nextInt();
         }
        

        for(int i = 0; i < a.length; i++){
           System.out.println("Display Array - "+a[i]);
        }


        
    }
}