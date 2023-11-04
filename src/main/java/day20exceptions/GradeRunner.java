package day20exceptions;

import java.util.ArrayList;
import java.util.List;

public class GradeRunner {
    public static void main(String[] args) {

        System.out.println(addGrades(80));
        System.out.println(addGrades(-80));
        System.out.println(addGrades(200));
    }

    //Create a method adds the grades into the grade list

    public static List<Integer> addGrades(int grade){

        List<Integer> gradeList = new ArrayList<>();

        if (grade>=0 && grade<=100){
            gradeList.add(grade);

        }else {
            throw new IllegalGradeException("Grade cannot be less than 0 and more than 100");
        }

        return gradeList;
    }

}
