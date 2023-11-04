package replit_questions;

import java.util.Scanner;

public class For_while {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

    e.g:

   char ch1= 'a' ;

   String name =“John came late"

   Expected Output: Number of a = 2


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.nextLine();

        System.out.println("Enter a character ");
        char character = input.nextLine().charAt(0);

        int  count = 0;

        for (int i = 0; i < name.length() ; i++) {

            if(name.charAt(i)==character){
               count++;
            }
        }


        System.out.println("Number of " + character + " character:  " +count);

        input.close();

    }
}
