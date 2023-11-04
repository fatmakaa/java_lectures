package day22collections_maps;

// HashMap : 1) It does not put the entries in any order, that is why it is so fast.
//           2) HashMap allows you to use "null" in Keys and Values
//           3) HashMap is not "thread-safe" and not "synchronized".
// HashTable 1) It does not put the entries in any order, that is why it is fast, but it is slower than HashMap.
//           2)HashTable is "thread-safe" and  "synchronized".
//           3)HashTable does not allow u to use "null" in Keys and in Values
//TreeMap: 1)It puts the entries in natural order by using keys, that is why it is so slow.
//                 2)TreeMap does not allow you to use "null" in Keys, but it is allowed in Values.
//                 3)TreeMap is not "thread-safe" and not "synchronized".



import java.util.Hashtable;

public class C04Maps {
    public static void main(String[] args) {
        //Homework = Create a method to display the number of occurrences of letters in a sentence
        //    Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, a=1, e=1



        Hashtable<Integer, String> define = new Hashtable<>();
        define.put(1,"Baby");
        define.put(15,"Teenage");
        define.put(67,"Senior");
        // define.put(67,null); //NullPointerException
        // define.put(null,"Adult");
        System.out.println(define); //{15=Teenage, 67=Senior, 1=Baby}


    }
}
