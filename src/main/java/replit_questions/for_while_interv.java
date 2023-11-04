package replit_questions;

import java.util.HashSet;
import java.util.Set;

public class for_while_interv {
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)

 Input :
 String str=“Javaisalsoeasy”

Output:
 [a, s]
/*
        Write a code that returns the duplicate chars in a String array.(interview Question)

 Input :
 String str=“Javaisalsoeasy”

Output:
 [a, s]

         */

        String str="dta base";


        Set<Character> seen = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();


        for (char c: str.toCharArray()){
            if (!seen.add(c)){
                duplicate.add(c);
            }
        }

        System.out.println("Duplicate characters: " + duplicate);

    }
}
