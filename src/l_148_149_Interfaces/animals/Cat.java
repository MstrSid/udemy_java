package l_148_149_Interfaces.animals;

public class Cat extends Animal implements Runnable {
    @Override
    public void eat() {
        System.out.println("Whiskas");
    }

    public void run() {
        System.out.println("Cat runs");
    }
}
