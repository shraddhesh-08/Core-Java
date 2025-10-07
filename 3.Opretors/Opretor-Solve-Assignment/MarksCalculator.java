

import java.util.*;
public class MarksCalculator {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("--Enter Mark Of Subject 1-- ");
        double sub1 = sc.nextDouble();

        System.out.println("--Enter Mark Of Subject 2-- ");
        double sub2 = sc.nextDouble();

        System.out.println("--Enter Mark Of Subject 3-- ");
        double sub3 = sc.nextDouble();

        System.out.println("--Enter Mark Of Subject 4-- ");
        double sub4 = sc.nextDouble();

        System.out.println("--Enter Mark Of Subject 5-- ");
        double sub5 = sc.nextDouble();

        double total = sub1 + sub2 + sub3 + sub4 + sub5;

        double percentage = (total / 500) * 100; 

        System.out.println("Total Marks----> " +total);
        System.out.println("Total percentage----> "+percentage+"%");
    }
}
