package day05ternarystatement_stringmanipulations;

public class CO3StringManipulations {

    public static void main(String[] args) {

        //Example 1: count the alphabetical characters in a given string
        //Tom12 Hanks!... ==> 8
        //i) Remove the non-alphabetical characters
        // ii)Count the remaining characters

        //non-alphabetical characters are a group of data.
        // To work with a group of data we use "Regular Expressions" (Regex)

        /*
        i) Upper case letters: A-Z
        ii) Lower case letters: a-z
        iii) All letters: [A-Za-z]
        iv) All digits: [0-9]
        v) Letters from m to v: [m-v]
        vi) Regex for a,b,e,d,g,z :[abedgz]

         a) All characters different from uppercase letters: [^A-Z]
         b) All characters different from lowercase letters: [^a-z]
         c) All characters different from all letters:
         d) All characters different from digits: [^0-9]
         e) All symbol (different from digits and letters): [^A-Za-z0-9]

         f) All punctuations: \\p{Punct}

       */


        String s1= "Tom Hanks!...";
        int numOfChar= s1.replaceAll("[^A-Za-z]","").length();
        System.out.println(numOfChar);

        //replaceAll() ==> It changes a group of characters to another character
        //length() ==> Counts the number of characters in String


        //Example 2= Type  code to change all digits to "+" in a given password
        //          pwd:a12b32c! ==> a**b**c
        String pwd = "a12b32c";
        String hiddenPwd = pwd.replaceAll("[0-9]","*");
        System.out.println("hiddenPwd = "+ hiddenPwd);


         //Example 3:Get initials from a full name. (Middle name is out of scope)
        //           Tom Hanks ==> TH  -   tom hanks ==>TH - "  tOM Hanks  " ==> TH


        String name="tom hanks";

        System.out.println(name);

        String firstInitial= name.trim().substring(0,1).toUpperCase();
        System.out.println(firstInitial);

        String lastInitial= name.trim().split("")[1].substring(0,1).toUpperCase();
        System.out.println(lastInitial);

        System.out.println(firstInitial+lastInitial);


        //trim(): Removes spaces from the beginning and from the end

        //substrings (s,e): It gets a part of the String.
        //           "s" stands for starting index which is inclusive
        //           "e" stands for ending index which is inclusive

        //toUpperCase(): Changes all alphabetical characters to upper cases in a String
        //split(): Splits a String from given character and indexes every part



    }


}
