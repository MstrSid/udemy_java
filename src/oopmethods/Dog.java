package oopmethods;

public class Dog {
    private String name;
    private String type;
    private int speed;

    public Dog(String name, String type, int speed) {
        this.name = name;
        this.type = type;
        this.speed = speed;
    }

    public void run() {
        int i = this.speed;
        while (i > 0) {
            System.out.println("Бегу");
            i--;
        }
    }

    public String info() {
        return String.format("Name: %s, type: %s, speed: %d", this.name, this.type, this.speed);
    }
}
