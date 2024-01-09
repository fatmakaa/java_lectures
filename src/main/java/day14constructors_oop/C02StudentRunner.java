package day14constructors_oop;

public class C02StudentRunner {

    public static void main(String[] args) {

        C01Students std1 = new C01Students();
        System.out.println(std1.stdAge);



        C01Students std2 = new C01Students("Brad Pitt", 57, "BD1967002");

        System.out.println(std2.stdName);
        System.out.println(std2); //day14constructors_oop.C01Students@7d417077
        //when I want to see on the console all info's, it gives me the reference,
        // that is why on parent class I've created a "to string method".

        std2.study();
        std2.doSport();
        std1.doSport();


    }
}