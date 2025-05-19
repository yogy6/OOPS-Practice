package Encapsulation;

public class EncapsulationDemo {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String qualification;
    private double salary;


    // Getters & Setters should be used for encapsulation

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
