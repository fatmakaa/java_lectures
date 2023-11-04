package day17oop;

public class CarRunner {
    public static void main(String[] args) {



        Honda myHonda = new Honda();


        myHonda.price(); // price method is a concrete method in interface, and it was created by default keyword.
              //That kind of methods are called "default method"
              //"default method" are accessible by using object

        Engine.accelerate(); //accelerate() method is concrete method in interface, it was created by default keyword.
                         //That kind of methods are called "static methods"
                        // "static methods" are accessible by interface name

        System.out.println(Engine.ENGINE_NAME + "!"); //Electrical Engine


    }
}
