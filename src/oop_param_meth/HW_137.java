package oop_param_meth;

public class HW_137 {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setDimens(15.5, 7.4);
        double perimeter = rect.getPerimeter();
        double square = rect.getSquare();
        System.out.printf("Perimeter: %f, square: %f", perimeter, square);
    }
}
