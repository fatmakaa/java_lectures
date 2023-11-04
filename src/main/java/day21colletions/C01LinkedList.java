package day21colletions;

/*
   1) ArrayList and LinkedList are the child classes of the list interface
   2) ArrayList is successful in search operations but not successful in adding and removing operations
   3) LinkedList is not successful in search operations, but successful in adding and removing operations
   4) LinkedList has "nodes" not elements.
      nodes have 2 parts i)Data Part ii) Pointer Part
      First nodes is pointed by "Head", last "node"(Tail) points null




 */

import java.util.ArrayList;
import java.util.LinkedList;

public class C01LinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(6);
        linkedList.add(1,12);
        linkedList.add(2,5);
        linkedList.addLast(2);

        System.out.println(linkedList);


        //If you want to remove an integer "node", convert it to rapper class then put it inside the remove method parenthesis
        // like the example below. If you put integer directly inside remove() parenthesis Java will accept it as index.
        linkedList.remove((Integer) 12);
        System.out.println(linkedList);

        //Remove method without parameters, it removes to first element.
       linkedList.remove();
        System.out.println(linkedList);


        System.out.println(linkedList.remove()); //It will print the first element
        System.out.println(linkedList); //it will print without first element


        linkedList.removeFirst();
        System.out.println(linkedList);


        linkedList.add(10);
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(13);
        System.out.println(linkedList);

        linkedList.removeFirstOccurrence(10);
        System.out.println(linkedList);

        linkedList.removeLastOccurrence(13);
        System.out.println(linkedList);





    }

}
