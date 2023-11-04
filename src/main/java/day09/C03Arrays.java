package day09;

import java.util.Arrays;

public class C03Arrays {

    public static void main(String[] args) {

        //Example 5: Create an integer array and print all elements less than 5
        // [12,3,-3,5,23] --> -3,3

         int [] numbers = {12,3,-3,5,23};

        for (int w: numbers){

            if (w<5){

                System.out.print(w+ " ");
            }
        }


        System.out.println();

        // Example 6: Check if a specific element exists in an array or not.


        // binarySearch() --> checks if a specified element exists in an array or not
        // binarySearch() --> gives you the index of an "existing element" with positive number
        // binarySearch() --> gives you the order of a "non-existing element" with negative number as if it would have been in the array
        // binarySearch() cannot be used with repeated elements



        int[] nums= {12,3,14,5,23};

        Arrays.sort(nums);//3 5 12 14 23

        System.out.println(Arrays.toString(nums));

        int result = Arrays.binarySearch(nums, 20);

        System.out.println(result);



    }
}
