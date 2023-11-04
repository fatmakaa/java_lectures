package day21colletions;

import java.util.LinkedList;

public class C02LinkedList {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("France");
        countries.add("Italy");
        countries.add("Albania ");
        countries.add("Germany");
        countries.add("Netherlands");
        System.out.println(countries);


        // peek() and element() methods returns first element without removing.
        // for empty lists peek() methods returns "null"
        // for empty lists element() method throws "NoSuchElementException"

        String country1 = countries.peek();  //Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(country1);  //France
        System.out.println(countries);

        countries.element();  //Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(country1);
        System.out.println(countries);


        LinkedList<Integer> names = new LinkedList<>();
        System.out.println(names.peek());  //null
        //System.out.println(names.element()); // NoSuchElementException


        //pop() and poll() methods return and remove the first element.
        // for empty lists poll() methods returns "null"
        // for empty lists pop() method throws "NoSuchElementException"

        String c = countries.pop();   //This method is equivalent to removeFirst().
        System.out.println(c);   //gave me the first element    //France
        System.out.println(countries);  //without first element


       String a =   countries.poll();     //Retrieves and removes the head (first element) of this list.
        System.out.println(a);              //gave me the first element   //Italy
        System.out.println(countries);        //without first element

        //System.out.println(names.pop());     // NoSuchElementException
        System.out.println(names.poll());    //null
        


    }

}
