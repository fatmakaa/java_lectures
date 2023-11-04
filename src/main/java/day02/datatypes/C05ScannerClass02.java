package day02.datatypes;

import java.util.Scanner;

public class C05ScannerClass02 {

    public static void main(String[] args) {

        //Get users name

        //1.Step: Create Scanner Class Object
        Scanner input = new Scanner(System.in);

        //2.Step: Give a message to the user
        System.out.println( "Enter your name please....");

        //3. Step: Get the data from user
        String userName = input.nextLine();
        System.out.println(userName);


        System.out.println("Enter your parents first name...");

        String parentFirstName = input.next();

        System.out.println(parentFirstName);

    }

}
