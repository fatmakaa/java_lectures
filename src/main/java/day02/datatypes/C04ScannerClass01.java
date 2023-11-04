package day02.datatypes;

import java.util.Scanner;

public class C04ScannerClass01 {

    // Scanner Class: It is used to get data from user.

    public static void main(String[] args) {

        //To be able to get data from user,following 3 steps

        //1.Step: Create a Scanner Class Object
        Scanner input = new Scanner(System.in);

        //2.Step: Give a message to the user
        System.out.println("Enter your age...");

        //3.Step: Get the data user entered
        int userAge = input.nextInt();

        System.out.println(userAge);








    }

}
