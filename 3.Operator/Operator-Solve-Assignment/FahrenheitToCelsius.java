//Write a java program to enter temperature in Fahrenheit and convert to Celsius.
        //Formula :- cel = (fah - 32) * 5 / 9;

import java.util.*;
public class FahrenheitToCelsius{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.println("Enter temperature in Fahrenheit :- ");
        double fah = sc.nextDouble();

        // Conversion formula
        double cel = (fah - 32) * 5 / 9;

        // Output result
        System.out.println("Temperature in Celsius :-->  " + cel);
    }
}
