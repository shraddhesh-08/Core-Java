/*
Q1. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/

import java.util.*;
public class ElementFoundOrNot{
    public static void main(String x[]){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Size - ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter "+size+" Element : ");
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }

        System.out.println("Enter Element To Search -");
        int search = sc.nextInt();

        boolean flag = false;

        for(int i=0; i<a.length; i++){
            if(a[i]==search){
                System.out.println("Element "+search+ "  found at index " +i);
                flag = true;
                break; 
            }
        }
        if(!flag)
        System.out.println("Element Not found..");
    }
}