/*Q1. Problem:
 Create a class Employee with fields:
empId, empName, basicSalary, hra, da, and grossSalary.
Use a parameterized constructor to initialize empId, empName, and basicSalary.
 HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
 Display all employee details and salary slip.
Hint: Use constructor to calculate the salary.
Explanation:
 This helps you understand how constructors can perform initial calculations immediately after object creation.
*/ 

class Employee{
    int empId;
    String empName;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    Employee(int id, String name, double base){        //parameterized constructor
       empId=id;
       empName=name;
       basicSalary=base;     

         // Calculations
         hra = 0.10 * basicSalary;
         da = 0.15 * basicSalary;
         grossSalary = basicSalary + hra + da;
    }
         //method 
        void display() {
        System.out.println("----- Employee Salary Slip -----");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (10%): " + hra);
        System.out.println("DA (15%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("--------------------------------");
    }    

public static void main(String x[]){
    Employee obj = new Employee(101, "sp", 50000 );
    obj.display();
}
}