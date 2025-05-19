package Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Vehicle vehi = new Vehicle();

        System.out.println("------------VEHICLE PARENT CLASS------------");
        vehi.start();
        vehi.stop();
        //vehi.fuel();
        System.out.println(vehi.color);


        RoadVehicle road = new RoadVehicle();
        System.out.println("-------------ROAD CHILD CLASS--------------");
        road.start();
        road.travelOnRoad();
        road.stop();


        WaterVehicle water = new WaterVehicle();
        System.out.println("-------------WATER CHILD CLASS------------");
        water.start();
        water.travelsOnWater();
        water.stop();

        AirVehicle air = new AirVehicle();
        System.out.println("--------------AIR CHILD CLASS-----------");
        air.start();
        air.travelsOnAir();
        air.stop();
    }
}
