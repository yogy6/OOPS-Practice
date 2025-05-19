package Inheritance;

public class RoadVehicle extends Vehicle {

    public void travelOnRoad(){
        System.out.println("These vehicles travel on road");
        super.color = "Red";
        super.fuel();
        System.out.println(color);
    }

    public void start(){
        System.out.println("Road Vehicle has started");
    }

    public void stop(){
        System.out.println("Road Vehicle has Stopped");
    }

    public void fuel(){
        System.out.println("Road Vehicle petrol is Full");
    }
}
