package task0504;

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat1", 1, 2, 2);
        Cat cat2 = new Cat("cat2", 2, 2, 3);
        Cat cat3 = new Cat("cat3", 1, 3, 2);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
