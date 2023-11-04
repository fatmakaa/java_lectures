package Practices.d03;

import java.time.LocalTime;
import java.util.Scanner;

public class p04_DateTime_DiceSec {
     static int playerDice;
     static int playerScore;
    //Write a method that rolls two dice and compares the result with the score of the computer
    // by multiplying the result with 2 or 5 according to the second it was.
    //When the dice is rolled, if the second is a multiple of 5, the number of dice will be multiplied by 5 and added to the score.
    //When the dice is rolled, if the second is a multiple of 2, the number of dice will be multiplied by 2 and added to the score.
    //When the dice is rolled, if the second is an odd number, the number of dice will be added to the score.

    public static void main(String[] args) {

        //System.out.println((int)(Math.random()*6)+1);

        rolDice();
    }

    public static void rolDice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter R to roll the dice");
        String start = scan.next();

        if (start.equalsIgnoreCase("r")){

            playerDice = (int)(Math.random()*6)+1;
            System.out.println("playerDice= " + playerDice);

            // to calculate the second when the dice is rolled
            int playerSecond = LocalTime.now().getSecond();
            System.out.println("playerSecond" + playerSecond);

            //condition
            if (playerSecond  % 5 ==0 ){
                int playerScore = playerDice +5;

            }else if (playerSecond % 2 ==0){

            }else{

            }




        }else {
            rolDice(); //calling the method in else part acts like a loop
        }


    }

}
