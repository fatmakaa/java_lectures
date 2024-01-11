package InterviewQ;

public class Q3 {
    public static void main(String[] args) {
        /*
           Example 7: Type code to print the following image on the console (Nested For Loop) (interview ques)

            X X X X X
            X X X X X
            X X X X X

         */

        int row = 3;
        int column = 5;

        for (int i = 1; i <=row ; i++) {

            String s = "";

            for(int k=1 ; k<column; k++){

                s= s + "X ";
            }

            System.out.println(s);

        }





    }
}
