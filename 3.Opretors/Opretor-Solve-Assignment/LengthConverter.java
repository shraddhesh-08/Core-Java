//Write a java program to enter length in centimeter and convert into meter and kilometer.

import java.util.*;

public class LengthConverter {
    public static void main(String x[] ) {
        Scanner sc = new Scanner(System.in);

        // Input length in centimeter
        System.out.print("Enter length in centimeter: ");
        double cm = sc.nextDouble();

        // Conversion
        double meter = cm / 100;
        double kilometer = cm / 100000;

        // Output
        System.out.println("Length in Meter: " + meter);
        System.out.println("Length in Kilometer: " + kilometer);
    }
}



//program to convert length from centimeter to meter and kilometer


