package day16oop;
   /*
  Encapsulation: It means "hiding data"
  Why do you need to hide the data?
   i) Because some data should not be public e.g. student Id,
     credit card no, social security, gpa etc.
   ii) Because we do not want some data to be accessed from other classes/packages
   How do you do encapsulation?
   To hide data, we use "private" access modifier.
   Note: getter and setter methods collectively are known as "Java Beans"
    */
public class C05Student {
    private String stdId = "TH001";
    private String illness= "Headache";
    private double gpa = 3.9;
    private boolean disability = false;

    // How to read the encapsulated data even when we can't see it?
    // we create get() methods (also called getters)
    public String getStdId(){
        return stdId;
    }
    public String getIllness(){
        return illness;
    }
    public double getGpa() {
        return gpa;
    }
    public boolean isDisability() { // get() method for boolean data type starts with 'is', all others start with 'ge
        return disability;
    }

    // How to update the encapsulated data even when we can't see it?
    // set() method (setters) is used to update the encapsulated data
    public void setStId(String stdId){
        this.stdId = stdId;
    }
    public void setIllness(String illness){
        this.illness = illness;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setDisability(boolean disability) {
        this.disability = disability;
    }
}