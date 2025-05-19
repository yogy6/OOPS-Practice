package Encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        EncapsulationDemo demo = new EncapsulationDemo();

        demo.setId(1);
        demo.setName("Mahima");
        System.out.println(demo.getId());
        System.out.println(demo.getName());
    }
}
