package Practices.d01;

public class Q05_Arrays {
    public static void main(String[] args) {


        // Create a String array, add 5 elements in it,
        // find the sum of the number of the characters in all Strings.


        String[] countries = {"Türkiye","US","Sweden","Finland","Morocco"};

        int sum=0;
        for (String w :countries) {
            sum = sum+w.length();

        }

        System.out.println(sum);

    }
}
