package l_146_147_Inheritance.figure;

public class Rect extends Figure {

    public Rect(double side) {
        super(side, side);
    }

    public Rect(double sideOne, double sideTwo) {
        super(sideOne, sideTwo);
    }

    @Override
    public double getSquare() {
        return getSideOne() * getSideTwo();
    }
}
