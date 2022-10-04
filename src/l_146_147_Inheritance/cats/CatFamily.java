package l_146_147_Inheritance.cats;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    public CatFamily() {
        ears = 2;
        legs = 4;
        bigClaws = true;
    }

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    protected void setEars(int ears) {
        if (ears > 0) {
            this.ears = ears;
        }

    }

    protected void setLegs(int legs) {
        if (legs > 0) {
            this.legs = legs;
        }
    }

    protected void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public int getEars() {
        return ears;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isBigClaws() {
        return bigClaws;
    }

    public void showInfo() {
        System.out.printf("Ears: %d, legs: %d, has big claws: %b\n", ears, legs, bigClaws);
    }

    public void eat() {
        System.out.print("Eat: ");
    }
}
