/* Q1. Mobile plan billing system:
        Input: Minutes used in a month

        Logic:
        Up to 100 mins → Base ₹199
        101–300 mins → ₹199 + ₹1/min for extra
        301–500 mins → ₹199 + ₹1.5/min for extra
        Above 500 mins → ₹199 + ₹2/min for extra
        Output: Total monthly bill.
*/ 


import java.util.*;

class MobilePlanBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes used in a month: ");
        int minutes = sc.nextInt();

        double bill = 199; 

        // Calculate extra charges using nested if
        if (minutes > 100) {
            int extra = minutes - 100;

            if (minutes <= 300) {           // 101–300 mins
                bill += extra * 1;
            } else if (minutes <= 500) {    // 301–500 mins
                bill += 200 * 1;            // 101–300 mins charge
                bill += (extra - 200) * 1.5;
            } else {                        // Above 500 mins
                bill += 200 * 1;            // 101–300 mins
                bill += 200 * 1.5;          // 301–500 mins
                bill += (extra - 400) * 2;  // above 500 mins
            }
        }

        System.out.println("Total monthly bill: ₹" + bill);
    }
}




