package day22collections_maps;

import java.util.Arrays;
import java.util.HashMap;

public class tr2 {
    public static void main(String[] args) {


        // String s = "I like you, like like!";  ==>I=1, like=3, you=1
        String s = "I like you, like like!";

        //remove all marks

        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);


        //tek barça olan stringi parçaladık
        String words[] = s.split(" ");
        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));


        HashMap<String, Integer> occ = new HashMap<>();

    }

}
