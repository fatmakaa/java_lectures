package Practices.d01;

import java.util.Scanner;

public class p02 {

    public static void main(String[] args) {


        /*

        Task: Ask user to enter his/her first name, age, height, and weight then print them on the console in this way:
        First Name: …
        Last Name: …
        Age: …
        Height: …
        Weight: …
        Note: Use only on “System.out.println();”

         */

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter your first name please");
        String firstName= scan.next();

        System.out.println(" Enter your second name please");
        String secondName = scan.next();

        System.out.println("Enter your age");
        int age = scan.nextInt();
        //byte age = scan.nextByte(); dangerous

        System.out.println("Enter your height");
        double height = scan.nextDouble();
        //float height = scan.nextFloat(); dangerous

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();


        System.out.print("First Name: " + firstName + " \n" + "Second Name=" + " \n" + secondName + "Age:" + " \n"+ age + "Height: " + " \n" + height+ "Weight: " + weight);


    }
}
