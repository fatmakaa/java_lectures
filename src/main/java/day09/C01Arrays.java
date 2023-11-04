package day09;

import java.util.Arrays;

public class C01Arrays {

    public static void main(String[] args) {

        //To learn a new topic
        //1)What is it?
        //2)Why do we need it?
        //3)How do we use it?
        //4)Mid-level implementation should be practice
        //5)Advanced-level implementations should be applicable


        /*
        1)Arrays is a data structure, used to store multiple data in the same data type.
        2)When you create an Array, you have to declare the number of elements in the array.
         */

        //How to create an Array

        String[] studentNames = new String[5];
        System.out.println(studentNames);  //reference of the array is given ([Ljava.lang.String;@75bd9247)

        System.out.println(Arrays.toString(studentNames));

        //How ro add elements into an array

        studentNames[0]="Tom";
        studentNames[3]="Mary";
        studentNames[1]="Mark";
        studentNames[4]="Hanks";
        studentNames[2]="Jim";

        System.out.println(Arrays.toString(studentNames));


        //How to get a specific element from an Array

        String fourth =studentNames[3];
        System.out.println(fourth);


        //Example 1:  Create an integer array, then find the multiplication of all elements.

        int[] ages = new int[4];
        ages[0]=12;
        ages[1]=5;
        ages[2]=7;
        ages[3]=1;

        System.out.println(Arrays.toString(ages)); //[12, 5, 7, 1]

       int result=1;
       
       
        for (int i=0; i< ages.length ; i++){
           
            result=result*ages[i];

        }

        System.out.println(result); //420


        //2. way: for-each loop (c)
        //for-each loop is so easy to use, that is why if it is possible we prefer to use for-each loop
        //Sometimes we need to work with indexes, if you need to use indexes, using for-each loop is no possible
        //for-each loop can be used just with "Arrays" and "Collections"


        int result2= 1;

        for (int w: ages){
            result2=result2*w;

        }
        System.out.println(result2);



        //Example 2: Find the difference between the maximum and minimum value od array elements
        //    [8,12,34,10,78,19] ==> 78-8 ==>70


        int[] nums = {8,12,34,10,78,19}; //second way to declare an array


        //1. way: By using sort()
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); //[8, 10, 12, 19, 34, 78]


        int min = nums[0];
        int max = nums[nums.length-1];

        System.out.println(max-min);



        //2. way: for each loop

        int[] numbers= {8,12,34,20,78,19};

        int minimum= numbers[0];
        int maximum= numbers[0];


        for (int w: numbers) {

            maximum = Math.max(maximum, w);

            minimum = Math.min(minimum, w);


        }

        System.out.println(maximum-minimum);



    }

}
