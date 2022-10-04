package l_147_148_Interfaces.animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        ArrayList<Runnable> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        for (Runnable animal : animals) {
            animal.run();
            ((Animal) animal).eat();
        }
    }
}
