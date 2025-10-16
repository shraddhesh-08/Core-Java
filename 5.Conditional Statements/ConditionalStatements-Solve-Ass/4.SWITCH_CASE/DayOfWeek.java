/*Q1. Develop a Java program using switch to print the day type for an input day number (1-7):
            * 1 for Monday, …, 7 for Sunday.
            * for 1-5, display “Weekday”; for 6-7, display “Weekend”.

        Explanation:
        Use switch with multiple cases falling through for weekdays and weekends.
*/ 

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
