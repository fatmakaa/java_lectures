package replit_questions;

import java.util.Scanner;

public class If_Switch_Ternary_StringMeth {
    public static void main(String[] args) {

        /* 1
    Write the Java code that prints on the console "Hello" on the first line and "World" on the second line.

    Sample Output:

    Hello

     World
     */

        System.out.println("Hello\nWorld\nFatma\nKarmis");


        /* 2
        Write a Java program that prints the sum, product, difference, division of num1 and num2.

         num1=100;

         num2=25;

        Sample Output:

        125

        2500

        75

         4

         */


        int num1=100;
        int num2=50;

        int sum = num1+num2;

        int product = num1*num2;

        int difference = num1-num2;

        int division = num1/num2;


        System.out.println(sum);
        System.out.println(product);
        System.out.println(difference);
        System.out.println(division);


        /*
            Ask user to their weight and height and type a program with calculates mass index

* HINT : Body Mass Index = Weight (kg) / Square of height (m)

Then give a message to user as following:

If BMI is less than 18.5 , you re weak
If BMI is between 18.5 and 25 , your weight is ideal
If BMI is between 25 and 30, you re fat
If BMI is more than or equal to 30, obese

EXAMPLE :

INPUT:

Weight : 71

Height : 1.72

OUTPUT :

Your BMI is  : 23.99945916711736
Your weight is idea


         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight.. ");
         double w = input.nextDouble();
        System.out.println("Please enter your height...");
        double h = input.nextDouble();

        double BMI = w/(h*h);
        System.out.println(BMI);

        if(BMI<18.5){
            System.out.println("Your BMI: " + BMI + "," + "You are weak...");
        }else if (BMI >= 18.5 && BMI < 25){
            System.out.println("Your BMI: " + BMI + "," + "You weight is ideal...");
        }else if (BMI >= 25 && BMI < 30){
            System.out.println("Your BMI: " + BMI + "," + "You are fat...");
        }else if (BMI>=30){
            System.out.println("Your BMI: " + BMI + "," + "You are obese...");
        }else {
            System.out.println("Invalid..");
        }






    }
}
