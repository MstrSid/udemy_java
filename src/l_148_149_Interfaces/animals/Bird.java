package l_148_149_Interfaces.animals;

public class Bird extends Animal implements Flyable, Runnable {
    @Override
    public void eat() {
        System.out.println("Worms");
    }

    public void fly() {
        System.out.println("Bird flies");
    }

    @Override
    public void run() {
        System.out.println("Bird run");
    }
}
