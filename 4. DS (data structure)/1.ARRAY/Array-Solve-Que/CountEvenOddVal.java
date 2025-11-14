/*Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.
For each element in the array:
If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.
Final counts are displayed.
*/

import java.util.*;
public class CountEvenOddVal{
    public static void main(String x[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size-  ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter  "+size+" Element");
       
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
            
        }

        int evenCount = 0; 
        int oddCount = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] % 2 ==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even Number - " + evenCount);
        System.out.println(" Odd Number - " + oddCount);
    }
}