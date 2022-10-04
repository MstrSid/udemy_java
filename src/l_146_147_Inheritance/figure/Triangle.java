package l_146_147_Inheritance.figure;

public class Triangle extends Figure {

    private double sideThree;

    public Triangle(double side) {
        super(side, side);
        this.sideThree = side;
    }

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        super(sideOne, sideTwo);
        this.sideThree = sideThree;
    }

    @Override
    public double getSquare() {
        double p = (getSideOne() + getSideTwo() + sideThree) / 2;
        return Math.sqrt(p * (p - getSideOne()) * (p - getSideTwo()) * (p - sideThree));
    }
}
