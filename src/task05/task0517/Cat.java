package task05.task0517;

public class Cat {
    private String name = null ;
    private int age = 2;
    private int weight = 2;
    private String address = null;
    private String color = "pink";

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
