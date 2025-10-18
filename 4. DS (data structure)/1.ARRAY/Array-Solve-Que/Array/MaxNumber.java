// Q. WAP to input five values in array and find max value from array?

import java.util.*;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number.");
        int size = sc.nextInt();

        int a[] = new int[size];

        for (int i =0; i<size; i++){
            a[i]=sc.nextInt();
        }

        int max = a[0];
        
        for (int i =0; i<size; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.print("Max Number Is - "+max);
    }
    
}