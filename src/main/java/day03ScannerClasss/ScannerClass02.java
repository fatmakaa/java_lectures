package day03ScannerClasss;

import java.util.Scanner;

public class ScannerClass02 {

    public static void main(String[] args) {

        // Example: Ask user to enter width and length of a rectangle then calculate the perimeter and the area


        //1. Step :Create a Scanner Class object.
        Scanner input = new Scanner(System.in);


        //2. Step: Give message to the user.
        System.out.println("Enter the width and length of a rectangle...");

        //3. Step: Create proper containers for the user input.

        double width = input.nextDouble();
        double length = input.nextDouble();

        System.out.println("The perimeter is:" + (2*width+2*length));











    }

}
