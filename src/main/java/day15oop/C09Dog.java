package day15oop;

public class C09Dog extends C08Mammal{


    @Override
    public int getWeight() {
        return 6;
    }


    @Override // @Override Annotation checks "override" rules in our code
    public void eat() {
        System.out.println("Dogs eat...");
        return ;

    }


    @Override
    public C07Animal create() {
        return new C09Dog();
    }
}

