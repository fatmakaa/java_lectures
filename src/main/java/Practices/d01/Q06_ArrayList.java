package Practices.d01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06_ArrayList {

    public static void main(String[] args) {


        //    Ask user to enter an integer from 1 to 10
        //          If the number user entered exists in the Database(DB), change the number to “Bingo”
        //          If the number user entered does not exist in the DB, add it into the DB
        //          If all records in the DB is “Bingo”, give a message to the user like “You won!”


        List<String> database = new ArrayList<>();
        database.add("4");
        database.add("7");
        database.add("1");

        System.out.println(database);


        int counter = 0;  // We create a counter cuz to be able to increase always the index part

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Please enter a number from 1 to 10");
            String n = scan.next();
            int num = Integer.valueOf(n);

            if (num < 1 || num > 10) {
                System.out.println("Chose a number from 1 to 10");
                continue;                                 //If my number is invalid it will skip. It is not going to add to the database.
            }

            if (database.contains(n)) {
                database.set(database.indexOf(n), "Bingo"); //It will replace with bingo
                counter++;

            } else {
                database.add(n);
            }

            if (counter == database.size()) {
                System.out.println("You Won");
                break;
            }


        } while (true);


    }
}
