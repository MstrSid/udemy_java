package l_146_147_Inheritance.box;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight() {
        super();
        weight = 1;
    }

    public BoxWeight(double weight, double side) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public BoxWeight(Box box, double weight) {
        super(box);
        this.weight = weight;
    }

    public BoxWeight(Box box1, Box box2, double weight) {
        super(box1, box2);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf(" weight: %.2f\n", weight);
    }
}
