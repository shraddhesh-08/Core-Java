import java.util.*;
public class SecondMax {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int size = sc.nextInt();

        System.out.println("Enter The "+size+" Element.");
        int a[] = new int[size];

        for(int i=0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i=0; i < a.length; i++){
            
            if(a[i]>max){
            max=a[i];
            }
            
        }System.out.println("Max num - " + max);
    }
} 