package day24lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C01Lambda {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(17);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        System.out.println(calculateSquareOfDistinctEvens(nums));
        System.out.println(multiplyLastDigitOfDistinctOdd(nums));
        System.out.println(findMax(nums));
        System.out.println(findMax2(nums));
        System.out.println(findMax3(nums));
        System.out.println(findMin(nums));
        System.out.println(findMin2(nums));
        System.out.println(findMin3(nums));
        System.out.println(findMinEvenGreaterThanSeven(nums));


    }

    // Example 1: Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements

    public static int calculateSquareOfDistinctEvens(List<Integer> list){

        return list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0,(t,u) -> t+u);

    }


    // Example 2: Create a method to calculate the "multiplication" of the "last digit" of "distinct" "odd" elements


    public static int multiplyLastDigitOfDistinctOdd(List<Integer> list){

      return list.stream().distinct().filter(t-> t%2==1).map(t-> t%10).reduce(1,(t,u) -> t*u);

    }


    //Example 3: Find the maximum element from the list

    //1.way

    public static int findMax(List<Integer> list){

        return list.stream().distinct().reduce(list.get(0),(t,u) -> t>u ? t : u);

    }



    // 2 way: we can find the elements by putting them in ascending order as well

    public static int findMax2(List<Integer> list){
       return list.stream().distinct().sorted().reduce((t,u)-> u).get();

    }


    // 3. way: we can find the maximum element by putting them in descending order

    public static int findMax3(List<Integer> list){
        return list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();

    }




    //homework: find the min. value from the list using these 3 ways.




    //1.way
    public static int findMin(List<Integer> list){
        return list.stream().distinct().reduce(list.get(0),(t,u) -> t<u ? t : u);

    }


    //2.way


    public static int findMin2(List<Integer> list){
      return list.stream().distinct().sorted().reduce((t,u)-> t).get();
    }


    //3.way

    public static int findMin3(List<Integer> list){
      return list.stream().distinct().sorted(Comparator.naturalOrder()).findFirst().get();
    }




    //Example 4: Create a method to find the minimum value which is grater than 7 and even from the list

    public static int findMinEvenGreaterThanSeven(List<Integer> list){

      return list.stream().distinct().filter(t-> t>7 && t%2==0).sorted().findFirst().get();

    }



}
