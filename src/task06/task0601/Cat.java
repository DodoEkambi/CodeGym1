package task06.task0601;

public class Cat {
    Cat(){

    }
    protected void finalize() throws Throwable{
        System.out.println("A cat was destroyed");
    }
    public static void main(String[] args) {

    }


}
class Dog{
    Dog(){

    }


    protected void finalize() throws Throwable {
        System.out.println("A dog was destroyed");
    }
}
