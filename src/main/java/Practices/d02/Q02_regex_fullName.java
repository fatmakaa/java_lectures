package Practices.d02;

import java.util.Scanner;

public class Q02_regex_fullName {

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
        System.out.println("Enter your name and surname with a space between");
        String fullName =  scan.nextLine().replaceAll("\\s+"," ").replaceAll("[^a-zA-Z ]","").trim();
        // "\\s+" meanas one space and more if there are

        System.out.println("fullname = " + fullName);

      String firstName = fullName.split(" ")[0].substring(0,1).toUpperCase() ;
                                                        //By using split method,
                                                       //I got the first index, which means
                                                      // I got the first word by using [0]. index.

      String lastName = fullName.split(" ")[1].substring(0,1).toUpperCase();   //By using split method,
                                                        //I got the second index, which means
                                                        // I got the second word by using [1]. index.


        System.out.println("First Name: " + firstName + "\nSurname: " + lastName );



    }
}
