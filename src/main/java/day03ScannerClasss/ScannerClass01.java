package day03ScannerClasss;

import java.util.Scanner;

public class ScannerClass01 {

    public static void main(String[] args) {

        //Example 1: Ask user two numbers then d addition and multiplication operations with the numbers.

        //1. Step :Create a Scanner Class object.

        Scanner input = new Scanner(System.in);

        //2. Step: Give message to the user
        System.out.println("Enter first number...");

        //3. Step: Select proper method and get the data from the user

        double num1= input.nextDouble();

        System.out.println("Enter second number...");
        double num2 = input.nextDouble();


        System.out.println("The sum is" + (num1+num2));

        System.out.println("the multiplication" + (num1*num2));

        /*
        Concatenation means: Joining with each other or with other data types
                             To do concatenations we have 2 options;
                             1) Use "*" sign --> it can be used with all data type
                             2) We use concat() method to join data just for string values.

          Java follows math operation priority rules when we deal with addition, multiplication, division, subtraction
          For Java when we are required to do math operations with a String label, we have to put the addition operation part
          inside parenthesis.

          1)Java first does the operation inside the parenthesis
          2)if there is any multiplication or division operation java will deal with them in the second part
          3) If there is any addition or subtraction operation java will do the operation at the very end




         */







    }

}
