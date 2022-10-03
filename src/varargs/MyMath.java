package varargs;

public class MyMath {
    public static final double PI = 3.14;

    public static int sum(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}
