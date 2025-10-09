
import java.util.*;
public class SimpleIntrest {
   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //  Input values
        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();
        
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        
        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();
        
        // Calculate Simple Interest Formula
        double si = (p * r * t) / 100;
        
        // result
        System.out.println("Simple Interest = " + si);
    }
}
