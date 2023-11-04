package day18oop_static_keyword;

public class C07StudentRunner {
    public static void main(String[] args) {

        C06Student std1 = new C06Student();
        System.out.println(std1.numOfEyes);
        System.out.println(C06Student.numOfStudent);

        System.out.println();
        C06Student std2 = new C06Student();
        System.out.println(std2.numOfEyes);
        System.out.println(C06Student.numOfStudent);

        System.out.println();

        C06Student std3 = new C06Student();
        System.out.println(std3.numOfEyes);
        System.out.println(C06Student.numOfStudent);

        C06Student std4 = new C06Student();   // whenever ı create a student the value of numofstudent gonna increase

        System.out.println();
        System.out.println(std1.numOfStudent);
        System.out.println(std2.numOfStudent);
        System.out.println(std3.numOfStudent);

        System.out.println();

        System.out.println(std1.numOfEyes);
        System.out.println(std2.numOfEyes);
        System.out.println(std3.numOfEyes);



    }
}
