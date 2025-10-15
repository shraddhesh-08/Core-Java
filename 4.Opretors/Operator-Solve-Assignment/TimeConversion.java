// Write a Java program to convert seconds to hours, minutes and seconds. 

import java.util.*;
public class TimeConversion {
    public static void main(String x[])
    {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter Total Secound.");
        int Totalsec = sc.nextInt();

        int hr = Totalsec / 3600 ;              // 1 hour = 3600 seconds
        int min = Totalsec % 3600 / 60;         // remaining minutes
        int sec = Totalsec % 60;                // remaining seconds

        System.out.println("Hours - " +hr);
        System.out.println("Minutes - " +min);
        System.out.println("Seconds - " +sec);
    }
}
