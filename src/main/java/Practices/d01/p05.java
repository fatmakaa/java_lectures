package Practices.d01;

import java.util.ArrayList;
import java.util.List;

public class p05 {
    public static void main(String[] args) {


        // Create a String array, add 5 elements in it,
        // find the sum of the number of the characters in all Strings.


       String[] countries = {"Turkey", "United States", "Sweden","Japan", "Russia"};

       int sum = 0;


        for (String w :countries) {
           sum += w.length();

        }
        System.out.println(sum);


    }
}
