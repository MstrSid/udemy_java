package l_146_147_Inheritance.figure;

public abstract class Figure {
    private double sideOne;
    private double sideTwo;

    protected final double getSideOne() {
        return sideOne;
    }

    protected final double getSideTwo() {
        return sideTwo;
    }

    public Figure(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public abstract double getSquare();
}
