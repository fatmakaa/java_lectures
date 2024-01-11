package InterviewQ;

public class Q2 {
    public static void main(String[] args) {
        //Example 4: Type code to reverse a String (Interview question!)
        //         Alexa ==> axelA

        String s = "Alexa";

        String reversed = "";

        for (int i = s.length()-1; i >=0 ; i--) {

            reversed = reversed + s.charAt(i);

        }
        System.out.println(reversed);

    }
}
