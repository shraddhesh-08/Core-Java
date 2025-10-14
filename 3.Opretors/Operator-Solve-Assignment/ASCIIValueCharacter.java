// Write a Java program to print the ASCII value of a given character.


import java.util.Scanner;

public class ASCIIValueCharacter {
    public static void main(String x []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Charecter - ");
        char ch = sc.next().charAt(0); // Take first character as input

        int ascii = (int) ch;  // Type casting char to int to get ASCII value

        System.out.println("THE ASCII VALUE OF :- " + ascii); 
    }
}
