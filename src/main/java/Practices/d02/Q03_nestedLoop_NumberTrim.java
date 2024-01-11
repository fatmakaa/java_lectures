package Practices.d02;

import java.util.Scanner;

public class Q03_nestedLoop_NumberTrim {
    /*

   Type code to ask user to enter the number of rows and print the
   shape below according to that number:
   1
   2 3
   4 5 6
   7 8 9 10
   11 12 13 14 15
   16 17 18 19 20 21

    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int rows = scan.nextInt();
        System.out.println("rows: " +rows);

        int number = 1;

        for (int i = 0; i < rows ; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;

            }

            System.out.println();
         }



    }
}
