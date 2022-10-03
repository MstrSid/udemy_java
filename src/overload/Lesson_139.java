package overload;

import box.Box;

public class Lesson_139 {
    public static void main(String[] args) {
        double resultD = Test.multiple(6.3, 5.8);
        int resultI = Test.multiple(6, 5);
        int resultS = Test.multiple(6);
        System.out.println(resultI);
        System.out.println(resultD);
        System.out.println(resultS);
        Box cube = new Box(10);
        cube.showVolume();
    }
}
