package oopmethods;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobby", "type1", 3);
        Dog dog2 = new Dog("Wolfie", "type2", 4);

        System.out.println(dog1.info());
        dog1.run();

        System.out.println();

        System.out.println(dog2.info());
        dog2.run();
    }
}
