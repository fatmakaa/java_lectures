package day25lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class C02Lambda {
    private static String season;

    public static void main(String[] args) {

        Course c1 = new Course("Java",127,"Summer",97.8);
        Course c2 = new Course("SQL",125,"Summer",95.6);
        Course c3 = new Course("API",129,"Summer",97.8);
        Course c4 = new Course("Selenium",137,"Summer",97.8);

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        System.out.println(courses);

        System.out.println(checkAvgScoreIsGreaterThanGivenValue(courses,91));
      //  System.out.println(checkSeasonNameAvgScore("Winter",));


    }

    //Example 1: Create a method to check if all average scores are greater than 91

    public static boolean checkAvgScoreIsGreaterThanGivenValue(List<Course> list, double num){
        return list.stream().allMatch(t-> t.getAvgScore() > num);

    }


    //Example 2: Create a method to check if at least one of the course name has "J" in it.

    public static boolean checkCourseNameContainsGivenString(List<Course> list,String s){
        return list.stream().anyMatch(t-> t.getCourseName().contains(s));
    }

    //Example 3: Create a method to check if there is a season namely "Winter" and the average score is less than 96

    public static boolean checkSeasonNameAvgScore(List<Course> list, double num){
       return list.stream().anyMatch(t-> t.getSeason().equalsIgnoreCase(season) && t.getAvgScore()<num);

    }

    //Example 4: Create a method to print the course whose number of students is the highest

    public static void printCourseWİthHighestNumOfStd(List<Course> list){

        System.out.println(list.stream().sorted(Comparator.comparing(Course::getNumOfStd).reversed()).findFirst().get());

    }


    //Example 5:Create a method to print the course whose number of students is the third highest

    public static void printCourseWithThirdHighestNumOfStf(List<Course> List){
       // System.out.println(list.stream().sorted(Comparator.comparing(Course::getNumOfStd).reversed()).skip(2).limit(1).collect(Collectors);

    }


}
