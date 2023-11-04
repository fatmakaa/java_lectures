package day05ternarystatement_stringmanipulations;

public class CO1TernaryOperator {

    public static void main(String[] args) {

        //Example 1: Type code to check if an integer is even or add


        int a= 11;
        //Condition ? code1 (true) : code2 (false)
       String result1= a % 2==0 ? "Even":"Odd";

        System.out.println(result1);


        //Example 2:Type code to check if an integer has 3 digits or not.


        int b =435;

        String result2= b>99 && b<1000 ? "The integer has 3 digits" : "The integer doesn't have 3 digits";
        System.out.println(result2);


        //Example 3: Type code to calculate absolute value of a number
        //         5 ==> 5   0 ==> 0  -3 ==>-3 * -1= 3

        double c = 23;

        double result3 = c<0 ? c*-1 : c;
        System.out.println(result3);


        //Example 4: Type code to find the multiplication of the integers is the signs are same.(positive sign to negative sign.)
        //            Give a message like "I do not know to multiply" if the signs are different.
        //            5 and 4 ==> 5*4     -3 and -2    -4 and 3 ==> "I do not know how to multiply"

        int d=-5;
        int e=4;

        Object result4 = (d <0 && e<0) || (d>0 && e>0) ? d*e : "I don't know how to multiply";
        System.out.println(result4);



    }

}
