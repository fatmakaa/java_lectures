package Practices.d03;

import java.util.Arrays;

public class Q03_Arrays_Anagram {
    //Type code to check if two Strings are Anagram or not
    // Anagram: A word or phrase made by using the letters of another word/phrase in a different order.
    //        Ex:
    //dormitory -> dirty room
    //debit card -> bad credit
    //eleven plus two -> twelve plus one
    // a decimal point -> I'm a dot in place
    // vacation time -> I am not active


    public static void main(String[] args) {

        System.out.println(isAnagram("dormitory","dirty room"));

    }

    public static boolean isAnagram(String str1, String str2) {

        String[] arr1 = str1.toLowerCase().replaceAll("[^a-z]", "").split("");
        System.out.println("arr1 = " + Arrays.toString(arr1));
        String[] arr2 = str2.toLowerCase().replaceAll("[^a-z]", "").split("");
        System.out.println("arr2 = " +Arrays.toString(arr2));

        Arrays.sort(arr1);

        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            return true;
        }else {
            return false;
        }

    }


}
