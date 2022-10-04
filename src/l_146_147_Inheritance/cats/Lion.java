package l_146_147_Inheritance.cats;

public class Lion extends CatFamily {
    public Lion() {
        super();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("meat");
    }

}
