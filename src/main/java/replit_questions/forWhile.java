package replit_questions;

import java.util.Random;
import java.util.Scanner;

public class forWhile {
    public static void main(String[] args) {
        /*

     Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

     Input :

     30 and 40

     Expected OutPut:

     GCD for 30 and 40 = 10

     LCM for 30 and 40 = 120

      */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers...");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);



        //calculate gcd
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; ++i) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        // Calculate LCM
        int lcm = (num1 * num2) / gcd;



        System.out.println("GCD for " + num1 + " and " + num2 + " = " + gcd);
        System.out.println("LCM for " + num1 + " and " + num2 + " = " + lcm);


    }
}
