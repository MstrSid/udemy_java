package overload;

public class Monster {
    private int eyes;
    private int legs;
    private int arms;

    public Monster() {
        eyes = 2;
        legs = 2;
        arms = 2;
    }

    public Monster(int eyes) {
        this.eyes = eyes;
        legs = 2;
        arms = 2;
    }

    public Monster(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
        arms = 2;
    }

    public Monster(int eyes, int legs, int arms) {
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
    }

    public void voice() {
        System.out.println("Voice");
    }

    public void voice(int i) {
        while (i > 0) {
            System.out.println("Voice");
            i--;
        }
    }

    public void voice(int i, String word) {
        while (i > 0) {
            System.out.println(word);
            i--;
        }
    }

    public void info() {
        System.out.printf("Eyes: %d, legs: %d, arms: %d\n", eyes, legs, arms);
    }
}
