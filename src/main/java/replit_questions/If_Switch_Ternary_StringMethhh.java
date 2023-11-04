package replit_questions;

import java.util.Scanner;

public class If_Switch_Ternary_StringMethhh {
    public static void main(String[] args) {

        /*
           * Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


               (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

Input :

John White 1234234534561478

Output :

Name : J*** W****

CCN  : **** **** **** 1478

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your name and Surname...");
        String nameAndSurname = input.nextLine();

        System.out.println("Please Enter your credit card number...");
        String ccNum = input.nextLine();

        if (ccNum.length()==16){
            System.out.println("");
        }else{
            System.out.println("Invalid credit card number");
        }


        String [] nameParts = nameAndSurname.split(" ");
        String firstName = nameParts[0];
        String surName = nameParts[1];
        String initials = firstName.substring(0,1).toUpperCase() + "**** " + surName.substring(0,1).toUpperCase() +"**** ";
        String hideCcNum ="**** **** **** " + ccNum.substring(12,16);

        System.out.println(initials);
        System.out.println(hideCcNum);










    }
}
