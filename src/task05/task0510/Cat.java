package task05.task0510;

public class Cat {
    private String name;
    private int age=1;
    private int weight=1;
    private String color="white";
    private String address;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight ;
        this.age = age;
    }
    public void initialize (String name, int age){
        this.name = name ;
        this.age = age;
    }
    public void initialize (int weight,String color){
        this.weight = weight;
        this.color = color;

    }
    public void initialize (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
