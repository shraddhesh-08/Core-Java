import java.util.*;
public class SwapWithoutThird {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The 1st Number :- ");
        int a = sc.nextInt();

        System.out.println("Enter The 2ed Number :- ");
        int b = sc.nextInt();

       System.out.println("Before number");
       System.out.println("A = "+a+", B =" +b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After number ");
        System.out.println("A = "+a+ ", B = "+b);
    }   
}