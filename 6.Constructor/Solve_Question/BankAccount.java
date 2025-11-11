/*Q3.Problem:
 Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
A default constructor to set balance = 1000
A parameterized constructor to initialize all field
A method deposit() to add money
A method display() to show details.
Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
 This question tests constructor overloading — how multiple constructors can initialize objects differently.
*/

import java.util.*;
class BankAccount{
    int accNo; 
    String accHolder; 
    double balance;

    BankAccount(){
        balance = 1000;
        System.out.println("default constructor: to set balance = 1000");
    }

    BankAccount(int aNo, String aName, double bal){
        accNo =aNo;
        accHolder = aName;
        balance = bal;
    }
    void deposit(double amount){
        balance += amount;
        System.out.println("Amount Deposit  -> " +amount);
    }
    void display(){
        System.out.println("Account Number --> " +accNo);
        System.out.println("Account Name --> " +accHolder);
        System.out.println("balance --> " + balance);
    }

    public static void main(String x[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Creating Default Account");
        BankAccount b1 = new BankAccount();

        b1.accNo = 101;
        b1.accHolder = "Defult User";
        b1.display();

    
        System.out.println("\nCreating Parameterized Account...");
        System.out.print("Enter Account Number: ");
        int no = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Opening Balance: ");
        double bal = sc.nextDouble();

        BankAccount b2 = new BankAccount(no, name, bal);

        // Deposit operation
        System.out.print("\nEnter amount to deposit: ");
        double amt = sc.nextDouble();
        b2.deposit(amt);

        // Display final details
        b2.display();

    }
}