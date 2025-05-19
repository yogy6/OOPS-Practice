package Polymorphism;

public class PolyMain {
    public static void main(String[] args) {
        SumOperations add = new SumOperations();

        add.sum(5,3);
        add.sum(3,5,5);
        add.sum(1.2f,2.3f);
    }
}
