package InterviewQ;

public class Q1 {
    public static void main(String[] args) {

        //Example 3: Type code to print just the unique characters in a String (interview question)
        //           "Hello" ==> Heo


        String s = "Hello";

        int indexOfH = s.indexOf("H");
        //System.out.println(indexOfH);

        int lastIndexOfH = s.lastIndexOf("H");
        //System.out.println(lastIndexOfH);

        if (indexOfH == lastIndexOfH) {
            System.out.print("H");
        }


        int indexOfE = s.indexOf("e");
        // System.out.println(indexOfE);

        int lastIndexOfE = s.lastIndexOf("e");
        // System.out.println(lastIndexOfE);

        if (indexOfE == lastIndexOfE) {
            System.out.print("e");
        }


        int indexOfL = s.indexOf("l");
        //  System.out.println(indexOfL);

        int lastIndexOfL = s.lastIndexOf("l");
        //   System.out.println(lastIndexOfL);

        if (indexOfL == lastIndexOfL) {
            System.out.print("l");
        }


        int indexOfO = s.indexOf("o");
        //   System.out.println(indexOfO);

        int lastIndexOfO = s.lastIndexOf("o");
        //  System.out.println(lastIndexOfO);

        if (indexOfO == lastIndexOfO) {
            System.out.println("o");
        }



        System.out.println("************");
        // Second way with loop
        //Example 6: Type code to print to find unique characters in a string
        //      Hello ==> Heo


        String t = "Hello";

        String unique = "";

        for (int i=0; i < t.length(); i++) {

            char a = t.charAt(i);

            if (t.indexOf(a) == t.lastIndexOf(a)) {

                unique = unique + a;

            }

        }

        System.out.println(unique);

    }
}
