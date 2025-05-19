package Inheritance;

public class AirVehicle extends Vehicle{

    public void travelsOnAir(){
        System.out.println("These vehicles travels on Air");
        super.color = "Blue";
    }

    public void start(){
        System.out.println("Air Vehicle has started");
    }

    public void stop(){
        System.out.println("Air Vehicle has Stopped");
    }

    public void fuel(){
        System.out.println("Air Vehicle petrol is Full");
    }
}
