// Q4. Write a java program to print all even numbers between 1 to 100.- using while loop


public class EvenOdd{
    public static void main(String x[]){
       
        int no = 1;

        while(no <= 100){
            if(no % 2 ==0){
            System.out.println(no + " ");
            }
            no++;
            
        }
    }
}