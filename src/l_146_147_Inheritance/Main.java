package l_146_147_Inheritance;

import l_146_147_Inheritance.box.Box;
import l_146_147_Inheritance.box.BoxWeight;
import l_146_147_Inheritance.cats.Cat;
import l_146_147_Inheritance.cats.Lion;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();

        System.out.println(lion.getLegs());
        System.out.println(cat.isBigClaws());
        lion.showInfo();
        lion.eat();
        cat.showInfo();
        cat.eat();


        Box box1 = new Box(5);
        Box box2 = new Box(4,6,5);

        BoxWeight boxWeight = new BoxWeight(4,2,5,15);
        boxWeight.showInfo();

        BoxWeight boxWeight2 = new BoxWeight(box1, box2,15);
        boxWeight2.showInfo();
    }
}
