package day07loops;

public class C02ForLoops {

    public static void main(String[] args) {

        //Example 4: Type code to reverse a String (Interview question!)
        //         Alexa ==> axelA


        String s = "Alexa";
        String reversed = "";

        for (int i = s.length()-1; i>=0; i--) {   // used decrement cuz it goes big index to least

            reversed=reversed+ s.charAt(i);
        }

        System.out.println(reversed);






        //Example 5: Type code to find the sum of the digits in on integer
        //            587 ==> 5+8+7=20

       int num = 123;
       int sumOfD = 0;

        for (int i = num; 0<i ; i=i/10) {
            sumOfD = sumOfD + i%10;
        }
        System.out.println(sumOfD);




        //Example 6: Type code to print to find unique characters in a string
        //      Hello ==> Heo


        String t = "Hello";

        String unique = "";

        for (int i=0; i < t.length() ; i++) {

            char ch = t.charAt(i);

            if (t.indexOf(ch) == t.lastIndexOf(ch)){

                unique = unique + ch;

            }

        }
        System.out.println(unique);





    }

}
