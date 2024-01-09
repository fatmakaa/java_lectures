package day22collections_maps;

import java.util.HashMap;

public class tr {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 77);
        stdAges.put("Veli", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Can", 58);

        //key tekrarlı kullanınca hata vermez ama en son verilen entrynin değerini kabul eder
        stdAges.put("Can", 18);
        System.out.println(stdAges);

        //Replace method used for update the values by using their keys
        stdAges.replace("Can", 19);
        System.out.println("stdAges = " + stdAges);


    }
}
