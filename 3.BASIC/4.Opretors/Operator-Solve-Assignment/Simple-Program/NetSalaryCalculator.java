/* Write a Java program to calculate the net salary of an employee.
    Input: basic salary, HRA %, DA %, and tax %. */

import java.util.Scanner;

class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA %: ");
        double hraPercent = sc.nextDouble();

        System.out.print("Enter DA %: ");
        double daPercent = sc.nextDouble();

        System.out.print("Enter Tax %: ");
        double taxPercent = sc.nextDouble();

        // Calculate HRA and DA
        double hra = basic * hraPercent / 100;
        double da = basic * daPercent / 100;

        // Calculate Gross Salary
        double gross = basic + hra + da;

        // Calculate Tax
        double tax = gross * taxPercent / 100;

        // Calculate Net Salary
        double netSalary = gross - tax;

        System.out.println("Net Salary: " + netSalary);
    }
}


