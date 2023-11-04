package day03ScannerClasss;

import java.util.Scanner;

public class ScannerClass03 {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);


        System.out.println("Please enter your full name");

        String fullName = input.nextLine();


        System.out.println("Please enter you age");
        byte age = input.nextByte();

        System.out.println("Please enter your height");
        float height = input.nextFloat();

        System.out.println("Please tell me, are you married?");
        boolean isMarried = input.nextBoolean();


        System.out.println("Your full name is:" + fullName);
        System.out.println("Your age is:" + age);
        System.out.println("Your height is:" + height);
        System.out.println("Is married?:"+ isMarried);

    }


}
