//  Write a Java program that reads a number and display the cube.

import java.util.Scanner;

public class CubeCal {
    public static void main(String x [])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number.");
        int no = sc.nextInt();

        int cube;
        cube = no * no * no;

        System.out.println("Cube Of - "+no+ " - Is --> "+cube);
    }
}
