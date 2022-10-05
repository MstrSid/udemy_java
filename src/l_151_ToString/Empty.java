package l_151_ToString;

public class Empty {
    private int some = 5;
    private String s = "Hello";

    @Override
    public String toString() {
        return String.format("Some: %d, s: %s", some, s);
    }
}
