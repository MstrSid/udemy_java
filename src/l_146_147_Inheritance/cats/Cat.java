package l_146_147_Inheritance.cats;

public class Cat extends CatFamily {

    public Cat() {
        super(2, 4, false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("milk");
    }
}
