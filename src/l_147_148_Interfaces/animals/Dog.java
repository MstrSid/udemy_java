package l_147_148_Interfaces.animals;

public class Dog extends Animal implements Runnable {
    @Override
    public void eat() {
        System.out.println("Bone");
    }

    public void run() {
        System.out.println("Dog runs");
    }
}
