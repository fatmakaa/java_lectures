package Practices.miniproject.busticketcalculation;

public class Ticket {
    // distance, journeyType, seatNumber,price

    public double distance;
    public int journeyType;
    public int seatNumber;
    public double price;


    // tp print these values on the ticket

    public void print(Bus bus){
        System.out.println("---- Ticket details ----");
        System.out.println("Bus number: " + bus.busNum);
        System.out.println("Distance:  "+ this.distance);
        System.out.println("Type of journey: " + (this.journeyType ==1 ? "One way" : "Round Trip"));
        System.out.println("Your seat no: " + this.seatNumber);
        System.out.println("Total price is: " + this.price);
        System.out.println(" Hava a nice trip! ");


    }



}
