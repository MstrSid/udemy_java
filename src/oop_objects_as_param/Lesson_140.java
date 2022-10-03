package oop_objects_as_param;

import box.Box;

public class Lesson_140 {
    public static void main(String[] args) {
        Box box1 = new Box(5);
        Box box2 = new Box(box1);
        int result = box1.compare(box2);
        switch (result) {
            case 1:
                System.out.println("Our box bigger.");
                break;
            case -1:
                System.out.println("Another box bigger.");
                break;
            case 0:
                System.out.println("Boxes are equal.");
                break;
        }
        Box box3 = new Box(10);
        Box box4 = box3.increaseBox(3);
        box3.showVolume();
        box4.showVolume();

        Box box5 = new Box(box1, box2);
        box5.showVolume();
        Box box6 = box5.boxFromTwoBoxes(box4);
        box6.showVolume();
    }
}
