package day03ScannerClasss;

public class Concatenation {

    public static void main(String[] args) {

        String name= "Tom";

        String lastName= "Hanks";

        int i=12;

        int k=5;

        char c= 'A';

        System.out.println(name+ " " +lastName);

        System.out.println(name + i+k ); //Tom125
        System.out.println(name + (i+k)); //Tom17
        System.out.println(i+k + name ); //12Tom
        System.out.println(name+ i*k); // no need to parentheses


    }

}
