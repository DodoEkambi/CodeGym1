package task06.task0604;

public class Cat {
    public static int catCount = 0;
    public Cat(){
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        catCount--;
    }
}
