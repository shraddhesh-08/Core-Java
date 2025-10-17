// Q5. Write a java program to print all odd numbers between 1 to 100.

public class OddNumber{
    public static void main(String x[]){
        
        int i = 1;  // starting number

        while(i <= 100){        // condition: loop will run till i = 100
            if( i % 2 != 0){        // check if number is odd
                System.out.print(i + " ");
            }
            i++;
        }
    }
}