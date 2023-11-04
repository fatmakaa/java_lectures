package Practices.d02;

import java.util.Scanner;

public class p02_regex_fullName {

     /*
    Divide the 2-word name and surname you will receive from the user into separate words.
    Print the name and surname on the screen separately.

     EXAMPLE:
    INPUT: John Doe

     OUTPUT:
    First name: John
    Surname: Doe

     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name and surname with a space between");
        String fullName  = scan.nextLine().trim();


        System.out.println("fullName= " + fullName);

        String firstName = fullName.split(" ")[0];
        String surname = fullName.split(" ")[1];


        System.out.println("First name: " + firstName + "\nSurname: " + surname);





    }
}
