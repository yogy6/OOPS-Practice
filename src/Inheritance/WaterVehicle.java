package Inheritance;

public class WaterVehicle extends Vehicle{

    public void travelsOnWater(){
        System.out.println("These Vehicles travel on water.");
        super.color = " Teal";
    }

    public void start(){
        System.out.println("Water Vehicle has started");
    }

    public void stop(){
        System.out.println("Water Vehicle has Stopped");
    }

    public void fuel(){
        System.out.println("Water Vehicle petrol is Full");
    }
}
