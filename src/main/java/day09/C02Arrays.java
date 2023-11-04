package day09;

import java.util.Arrays;

public class C02Arrays {

    public static void main(String[] args) {


        //Example 3: Create a String array, ad 5 elements in it, find the sum of the number of the characters in all Strings.

        String[] cities = {"Miami", "Alabama", "Jacksonville", "Tampa", "Orlando" };

        System.out.println(Arrays.toString(cities));

        int sum=0;

        for (String w: cities){

            sum = sum+w.length();
        }
        System.out.println(sum);


        //Note 1: Arrays can contain just "primitive data types" and "reference" of the non-primitives

        //Note 2: Strings use "length()" but arrays use "length variable"


        //Example 4: {0, 2, 3, 0, 12, 0} put the zeros to the end. //interview quest

        int[] m= {0,2,3,0,12,0};

        int [] n= new int[m.length];


        System.out.println(Arrays.toString(n));

        int idx=0;


        for (int w: m){

            if (w!=0){

                n[idx]= w;

                idx++;


            }
        }

        System.out.println();

    }

}
