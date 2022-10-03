package overload;

public class Test {
    public static int multiple(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static double multiple(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public static int multiple(int arg1) {
        return arg1 * arg1;
    }
}
