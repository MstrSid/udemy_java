package l_151_ToString;

public class Main {
    public static void main(String[] args) {
        Empty empty = new Empty();
        System.out.println(empty);
        System.out.printf("Random number: %d\n", getRandom(6));
    }

    public static int getRandom(int limit) {
        return (int) ((Math.random() * limit) + 1);
    }
}
