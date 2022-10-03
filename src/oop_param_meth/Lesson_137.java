package oop_param_meth;

import box.Box;

public class Lesson_137 {
    public static void main(String[] args) {
        Test test = new Test();
        int square = test.square(15);
        System.out.println(square);

        Box box = new Box();
        box.setDimens(15.5, 15.6, 15.7);
        double result = box.volume();
        System.out.println(result);
    }
}
