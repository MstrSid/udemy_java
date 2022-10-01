package data_types_primitive;

import java.util.Scanner;

public class Lesson_131 {
    public static void main(String[] args) {
        calcR();
        calcGipo();
        getToDo();

    }

    private static void calcGipo() {
        HW_Triangle triangle = new HW_Triangle();
        triangle.setSides(5.1, 6.5);
        System.out.println(triangle.getGipo());
    }

    private static void calcR() {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите радиус круга:");
        float r = input.nextFloat();

        float s = (float) Math.PI * (float) Math.pow(r, 2);

        System.out.println(s);
    }

    private static void getToDo() {
        Daytime daytime = new Daytime();
        daytime.setData(15, true);
        daytime.whatToDo();
    }

}
