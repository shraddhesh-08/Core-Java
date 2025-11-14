/*Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.
*/

import java.util.*;
public class E0venOddIndexVal{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter "+size+"Element");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Even Numebr - ");
        for(int i=0; i<a.length; i++ ){
            if(a[i]%2==0){
                System.out.print(i +" ");
            }
        }

        System.out.println();

         System.out.print("Odd Numebr - ");
        for(int i=0; i<a.length; i++ ){
            if(a[i]%2!=0){
                System.out.print(i +" ");
            }
        }
    }
}