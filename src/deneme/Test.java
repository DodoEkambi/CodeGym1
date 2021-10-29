package deneme;

public class Test {
    public static void main(String[] args) {
        int number = 13;
        System.out.println(number%10);
        Cat cat1 = new Cat("Missy");
        System.out.println(cat1.catCount);
        Cat cat2 = new Cat("Dissy");
        System.out.println(cat2.catCount);;
    }
}

    class Cat{
    String name;
    int catCount=0;
    public Cat(String name){
        this.name = name;
        catCount++;
    }
}
