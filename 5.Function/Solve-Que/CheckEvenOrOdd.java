/*Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.
*/

/*public class CheckEvenOrOdd{

    void isEven(int n){
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String x[]){

        CheckEvenOrOdd obj = new CheckEvenOrOdd();

        obj.isEven(10);  // calling Function
    } 
}
*/

import java.util.Scanner;

public class CheckEvenOrOdd{

    static void isEven(int n){
        if (n%2==0){
            System.out.println("Even No");
        }else{
            System.out.println("Odd Number ");
        }
    }

    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number-");
        int n = sc.nextInt();
        isEven(n);
    }
}